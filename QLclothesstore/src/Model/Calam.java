package Model;

public class Calam {

    private int Maca;
    private String ca, MaNV, Ten, Chucvu, giolam, ngaylam;

    public Calam() {
    }

    public Calam(int Maca, String ca, String MaNV, String Ten, String Chucvu, String giolam, String ngaylam) {
        this.Maca = Maca;
        this.ca = ca;
        this.MaNV = MaNV;
        this.Ten = Ten;
        this.Chucvu = Chucvu;
        this.giolam = giolam;
        this.ngaylam = ngaylam;
    }

    public int getMaca() {
        return Maca;
    }

    public void setMaca(int Maca) {
        this.Maca = Maca;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getGiolam() {
        return giolam;
    }

    public void setGiolam(String giolam) {
        this.giolam = giolam;
    }

    public String getNgaylam() {
        return ngaylam;
    }

    public void setNgaylam(String ngaylam) {
        this.ngaylam = ngaylam;
    }

}
