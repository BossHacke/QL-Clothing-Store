package Controller;

import Model.Hoadon;
import Model.Sanpham;
import Model.SanphamCT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAOspCT {

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

    public ArrayList<SanphamCT> getListSanphamCT() throws ClassNotFoundException, SQLException {
        ArrayList<SanphamCT> list = new ArrayList<>();
        Connection conn = getConnection();
        String sql = "SELECT * FROM tblSanphamCT";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanphamCT s = new SanphamCT();
                s.setId(rs.getInt("ID"));
                s.setMaspID(rs.getInt("MaspID"));
                s.setSoLuong(rs.getInt("SoLuong"));
                s.setGia(rs.getInt("Gia"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Sanpham> getListSP() throws ClassNotFoundException, SQLException {
        ArrayList<Sanpham> list = new ArrayList<>();
        Connection conn = getConnection();
        String sql = "SELECT * FROM tblSanPham";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sanpham s = new Sanpham();
                s.setID(rs.getInt("ID"));
                s.setMasp(rs.getString("Masp"));
                s.setTensp(rs.getString("Tensp"));
                s.setLoai(rs.getString("loai"));
                s.setSoluong(rs.getInt("Soluong"));
                s.setGia(rs.getInt("Gia"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void AddSP(SanphamCT sp) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "INSERT INTO tblSanphamCT(ID,MaspID,SoLuong,Gia)" + " VALUES (?,?,?,?)";

//        String sql2 = "insert into tblSanpham(ID,Tensp,Soluong,Gia) VALUES" + "(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sp.getId());
            ps.setInt(2, sp.getMaspID());
            ps.setInt(3, sp.getSoLuong());
            ps.setInt(4, sp.getGia());

//            Sanpham s = new Sanpham();
//            PreparedStatement ps2 = conn.prepareStatement(sql);
//            ps2.setInt(1, s.getID());
//            ps2.setString(2, s.getTensp());
//            ps2.setInt(3, s.getSoluong());
//            ps2.setInt(4, s.getGia());
            ps.executeUpdate();

            JOptionPane.showInputDialog(this, "thêm sản phẩm chi tiết thành công");
        } catch (Exception e) {
            JOptionPane.showInputDialog(this, "MaspID của bạn nhập sai với ID sản phẩm vui lòng nhập lại");
            e.getMessage();
        }
    }

    public void DeleteSP(int id) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "Delete from tblSanPhamCT where ID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AddHD(Hoadon h) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();
        String sql = "insert into tblSanPham ('Dateoder','Thanhtien') value" + "(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, h.getDateoder());
            ps.setInt(2, h.getThanhtien());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
