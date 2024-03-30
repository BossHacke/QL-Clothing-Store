package Model;

public class Hoadon {

    private int MaHD;
    private String KhachHang, Tensp, size, Dateoder;
    private int Gia, Soluong, Thanhtien;

    public Hoadon() {
    }

    public Hoadon(int MaHD, String KhachHang, String Tensp, String size, String Dateoder, int Gia, int Soluong, int Thanhtien) {
        this.MaHD = MaHD;
        this.KhachHang = KhachHang;
        this.Tensp = Tensp;
        this.size = size;
        this.Dateoder = Dateoder;
        this.Gia = Gia;
        this.Soluong = Soluong;
        this.Thanhtien = Thanhtien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getKhachHang() {
        return KhachHang;
    }

    public void setKhachHang(String KhachHang) {
        this.KhachHang = KhachHang;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDateoder() {
        return Dateoder;
    }

    public void setDateoder(String Dateoder) {
        this.Dateoder = Dateoder;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(int Thanhtien) {
        this.Thanhtien = Thanhtien;
    }

}
