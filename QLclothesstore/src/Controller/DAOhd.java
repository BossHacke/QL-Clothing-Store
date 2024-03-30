package Controller;

import Model.Hoadon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOhd {
    
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
    
    public ArrayList<Hoadon> getListHD() throws ClassNotFoundException, SQLException {
        ArrayList<Hoadon> list = new ArrayList<>();
        Connection conn = getConnection();
        String sql = "SELECT * FROM tblhoadon";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hoadon hd = new Hoadon();
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setKhachHang(rs.getString("KhachHang"));
                hd.setTensp(rs.getString("Tensp"));
                hd.setGia(rs.getInt("Gia"));
                hd.setSize(rs.getString("size"));
                hd.setDateoder(rs.getString("Dateoder"));
                hd.setSoluong(rs.getInt("Soluong"));
                hd.setThanhtien(rs.getInt("Thanhtien"));
                list.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void AddHD(Hoadon h) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "insert into tblhoadon (MaHD,KhachHang,Tensp,Gia,size,Dateoder,Soluong,Thanhtien) values" + "(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, h.getMaHD());
            ps.setString(2, h.getKhachHang());
            ps.setString(3, h.getTensp());
            ps.setInt(4, h.getGia());
            ps.setString(5, h.getSize());
            ps.setString(6, h.getDateoder());
            ps.setInt(7, h.getSoluong());
            ps.setInt(8, h.getThanhtien());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void DeleteSP(int id) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "Delete from tblHoadon where ID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Hoadon> findbyHD(String Name) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        ArrayList<Hoadon> list = new ArrayList<>();
        String sql = "select * from tblhoadon where Dateoder like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + Name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hoadon hd = new Hoadon();
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setKhachHang(rs.getString("KhachHang"));
                hd.setTensp(rs.getString("Tensp"));
                hd.setGia(rs.getInt("Gia"));
                hd.setSize(rs.getString("size"));
                hd.setDateoder(rs.getString("Dateoder"));
                hd.setSoluong(rs.getInt("Soluong"));
                hd.setThanhtien(rs.getInt("Thanhtien"));
                list.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
