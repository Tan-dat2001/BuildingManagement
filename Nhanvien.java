package ex;

public class Nhanvien {
    private String manv;
    private String ten;

    public Nhanvien() {
    }

    public Nhanvien(String manv, String ten) {
        this.manv = manv;
        this.ten = ten;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "manv='" + manv + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
