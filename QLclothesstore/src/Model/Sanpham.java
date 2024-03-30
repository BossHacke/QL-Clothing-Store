package Model;

public class Sanpham {

    private int ID;
    private String Masp;
    private String Tensp;
    private String loai, size;
    private int Soluong;
    private int Gia;
    private byte[] hinh;

    public Sanpham() {
    }

    public Sanpham(int ID, String Masp, String Tensp, String loai, String size, int Soluong, int Gia, byte[] hinh) {
        this.ID = ID;
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.loai = loai;
        this.size = size;
        this.Soluong = Soluong;
        this.Gia = Gia;
        this.hinh = hinh;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public byte[] getHinh() {
        return hinh;
    }

    public void setHinh(byte[] hinh) {
        this.hinh = hinh;
    }

}
