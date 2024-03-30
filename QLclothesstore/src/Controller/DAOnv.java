package Controller;

import Model.Nhanvien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOnv {

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

    public ArrayList<Nhanvien> getListNV() throws ClassNotFoundException, SQLException {
        ArrayList<Nhanvien> list = new ArrayList<>();
        Connection conn = getConnection();
        String sql = "Select * from nhanvien";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Nhanvien nv = new Nhanvien();
                nv.setId(rs.getInt("id"));
                nv.setManv(rs.getString("MaNV"));
                nv.setHoten(rs.getString("Name"));
                nv.setSex(rs.getString("Sex"));
                nv.setChucvu(rs.getString("position"));
                nv.setNgaysinh(rs.getString("Dateofbirth"));
                nv.setDiachi(rs.getString("Adrress"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setLuong(rs.getInt("Wage"));
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void AddNV(Nhanvien nv) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "insert into nhanvien (id,MaNV,Name,Sex,position,Dateofbirth,Adrress,SDT,Email,Wage) values" + "(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nv.getId());
            ps.setString(2, nv.getManv());
            ps.setString(3, nv.getHoten());
            ps.setString(4, nv.getSex());
            ps.setString(5, nv.getChucvu());
            ps.setString(6, nv.getNgaysinh());
            ps.setString(7, nv.getDiachi());
            ps.setString(8, nv.getSDT());
            ps.setString(9, nv.getEmail());
            ps.setInt(10, nv.getLuong());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteNV(int id) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "Delete from nhanvien where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Nhanvien> findbyNhanvien(String Name) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        ArrayList<Nhanvien> list = new ArrayList<>();
        String sql = "select * from nhanvien where Name like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + Name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Nhanvien nv = new Nhanvien();
                nv.setId(rs.getInt("id"));
                nv.setManv(rs.getString("MaNV"));
                nv.setHoten(rs.getString("Name"));
                nv.setSex(rs.getString("Sex"));
                nv.setChucvu(rs.getString("position"));
                nv.setNgaysinh(rs.getString("Dateofbirth"));
                nv.setDiachi(rs.getString("Adrress"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setLuong(rs.getInt("Wage"));
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
