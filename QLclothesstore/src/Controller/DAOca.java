package Controller;

import Model.Calam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOca {

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

    public ArrayList<Calam> getListCa() throws ClassNotFoundException, SQLException {
        ArrayList<Calam> list = new ArrayList<>();
        Connection conn = getConnection();
        String sql = "select * from ca";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Calam ca = new Calam();
                ca.setMaca(rs.getInt("Maca"));
                ca.setMaNV(rs.getString("MaNV"));
                ca.setTen(rs.getString("Name"));
                ca.setChucvu(rs.getString("position"));
                ca.setCa(rs.getString("ca"));
                ca.setGiolam(rs.getString("giolam"));
                ca.setNgaylam(rs.getString("ngaylam"));
                list.add(ca);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void AddCa(Calam ca) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "insert into ca (MaNV,Name,position,ca,giolam,ngaylam) values" + "(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ca.getMaNV());
            ps.setString(2, ca.getTen());
            ps.setString(3, ca.getChucvu());
            ps.setString(4, ca.getCa());
            ps.setString(5, ca.getGiolam());
            ps.setString(6, ca.getNgaylam());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteCa(int Maca) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "Delete from ca where Maca = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Maca);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Calam> findbyCa(String Name) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        ArrayList<Calam> list = new ArrayList<>();
        String sql = "select * from Ca where Name like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + Name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Calam ca = new Calam();
                ca.setMaca(rs.getInt("Maca"));
                ca.setMaNV(rs.getString("MaNV"));
                ca.setTen(rs.getString("Name"));
                ca.setChucvu(rs.getString("position"));
                ca.setCa(rs.getString("ca"));
                ca.setGiolam(rs.getString("giolam"));
                ca.setNgaylam(rs.getString("ngaylam"));
                list.add(ca);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
