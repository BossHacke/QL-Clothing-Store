package Model;

public class SanphamCT {

    private int id, MaspID;
    private int SoLuong;
    private int Gia;

    public SanphamCT() {
    }

    public SanphamCT(int id, int MaspID, int SoLuong, int Gia) {
        this.id = id;
        this.MaspID = MaspID;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public SanphamCT(int MaspID,int SoLuong, int Gia) {
        this.MaspID = MaspID;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaspID() {
        return MaspID;
    }

    public void setMaspID(int MaspID) {
        this.MaspID = MaspID;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

}
