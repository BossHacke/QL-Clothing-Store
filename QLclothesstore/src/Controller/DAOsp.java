package Controller;

import Model.Sanpham;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;

public class DAOsp {
    
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
    
    public ArrayList<Sanpham> getListSP() throws ClassNotFoundException, SQLException {
        ArrayList<Sanpham> list = new ArrayList<>();
        Connection conn = getConnection();
        String sql = "SELECT * FROM tblSanPham";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sanpham s = createsanpham(rs);
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteSP(int id) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "Delete from tblSanpham where ID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean AddSP(Sanpham s) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "insert into tblSanpham(ID,Masp,Tensp,loai,size,Soluong,Gia,Hinh) VALUES" + "(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getID());
            ps.setString(2, s.getMasp());
            ps.setString(3, s.getTensp());
            ps.setString(4, s.getLoai());
            ps.setString(5, s.getSize());
            ps.setInt(6, s.getSoluong());
            ps.setInt(7, s.getGia());
            if (s.getHinh() != null) {
                Blob hinh = new SerialBlob(s.getHinh());
                ps.setBlob(8, hinh);
            } else {
                Blob hinh = null;
                ps.setBlob(8, hinh);
            }
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return AddSP(s);
    }

//    public boolean UpdateSP(Sanpham s) throws ClassNotFoundException, SQLException {
//        Connection conn = getConnection();
//        String sql = "update tblSanpham set Tensp = ?,loai = ?,Soluong = ?,Gia = ?,Hinh = ?" + "where ID = ?";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, s.getTensp());
//            ps.setString(2, s.getLoai());
//            ps.setInt(3, s.getSoluong());
//            ps.setInt(4, s.getGia()); 
//            if (s.getHinh() != null) {
//                Blob hinh = new SerialBlob(s.getHinh());
//                ps.setBlob(5, hinh);
//            } else {
//                Blob hinh = null;
//                ps.setBlob(5, hinh);
//            }
//            ps.setInt(6, s.getID());
//            return ps.executeUpdate() > 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return UpdateSP(s);
//    }
    public ArrayList<Sanpham> findbyName(String Name) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        ArrayList<Sanpham> list = new ArrayList<>();
        String sql = "select * from tblsanpham where Tensp like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + Name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sanpham s = new Sanpham();
                s.setID(rs.getInt("ID"));
                s.setMasp(rs.getString("Masp"));
                s.setTensp(rs.getString("Tensp"));
                s.setLoai(rs.getString("loai"));
                s.setSize(rs.getString("size"));
                s.setSoluong(rs.getInt("Soluong"));
                s.setGia(rs.getInt("Gia"));
                Blob blob = rs.getBlob("Hinh");
                if (blob != null) {
                    s.setHinh(blob.getBytes(1, (int) blob.length()));
                }
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    private Sanpham createsanpham(final ResultSet rs) throws Exception, SQLException {
        Sanpham sp = new Sanpham();
        sp.setID(rs.getInt("ID"));
        sp.setMasp(rs.getString("Masp"));
        sp.setTensp(rs.getString("Tensp"));
        sp.setLoai(rs.getString("loai"));
        sp.setSize(rs.getString("size"));
        sp.setSoluong(rs.getInt("Soluong"));
        sp.setGia(rs.getInt("Gia"));
        Blob blob = rs.getBlob("Hinh");
        if (blob != null) {
            sp.setHinh(blob.getBytes(1, (int) blob.length()));
        }
        return sp;
    }
}
