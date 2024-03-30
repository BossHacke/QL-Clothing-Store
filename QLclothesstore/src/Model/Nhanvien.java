package Model;

public class Nhanvien {

    private int id;
    private String Manv, Hoten, sex, Chucvu, Ngaysinh, Diachi, SDT, Email;
    private int Luong;

    public Nhanvien() {
    }

    public Nhanvien(String Manv, String Hoten, String sex, String Chucvu, String Ngaysinh, String Diachi, String SDT, String Email, int Luong) {
        this.Manv = Manv;
        this.Hoten = Hoten;
        this.sex = sex;
        this.Chucvu = Chucvu;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.SDT = SDT;
        this.Email = Email;
        this.Luong = Luong;
    }

    public Nhanvien(int id, String Manv, String Hoten, String sex, String Chucvu, String Ngaysinh, String Diachi, String SDT, String Email, int Luong) {
        this.id = id;
        this.Manv = Manv;
        this.Hoten = Hoten;
        this.sex = sex;
        this.Chucvu = Chucvu;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.SDT = SDT;
        this.Email = Email;
        this.Luong = Luong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }

}
