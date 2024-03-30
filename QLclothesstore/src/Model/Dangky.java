package Model;

public class Dangky {

    private String username, gmail, pass, confirmpass;

    public Dangky() {
    }

    public Dangky(String username, String gmail, String pass, String confirmpass) {
        this.username = username;
        this.gmail = gmail;
        this.pass = pass;
        this.confirmpass = confirmpass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConfirmpass() {
        return confirmpass;
    }

    public void setConfirmpass(String confirmpass) {
        this.confirmpass = confirmpass;
    }

}
