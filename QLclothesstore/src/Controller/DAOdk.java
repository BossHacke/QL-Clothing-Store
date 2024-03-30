package Controller;

import Model.Dangky;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOdk {

    public static java.sql.Connection getConnection() throws ClassNotFoundException, SQLException {
        String hostname = "localhost";
        String dbname = "qlstore";
        String username = "root";
        String password = "123456";
        return getConnection(hostname, dbname, username, password);
    }

    private static java.sql.Connection getConnection(String hostname, String dbname, String username, String password)
            throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionurl = "jdbc:mysql://" + hostname + ":3306/" + dbname;
        java.sql.Connection con = DriverManager.getConnection(connectionurl, username, password);
        return con;
    }

    public ArrayList<Dangky> getListDK() throws ClassNotFoundException, SQLException {
        ArrayList<Dangky> list = new ArrayList<>();
        Connection conn = getConnection();
        String sql = "SELECT * FROM account";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dangky Dk = new Dangky();
                Dk.setUsername(rs.getString("username"));
                Dk.setGmail(rs.getString("gmail"));
                Dk.setPass(rs.getString("pass"));
                list.add(Dk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void Addaccount(Dangky dk) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "insert into account (username,gmail,pass,confirmpass) values" + "(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dk.getUsername());
            ps.setString(2, dk.getGmail());
            ps.setString(3, dk.getPass());
            ps.setString(4, dk.getConfirmpass());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteDK(String username) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "Delete from account where username = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateDK(Dangky dk) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "update account set gmail = ?, pass = ?, confirmpass = ?" + "where username = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(4, dk.getUsername());
            ps.setString(1, dk.getGmail());
            ps.setString(2, dk.getPass());
            ps.setString(3, dk.getConfirmpass());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean Login(Dangky dk) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "select * from account where username = ? and pass = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dk.getUsername());
            ps.setString(2, dk.getPass());
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
