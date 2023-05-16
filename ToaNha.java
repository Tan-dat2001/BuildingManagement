package ex;

import java.util.Date;

public class ToaNha {
    private String tenTN;
    private Date date;
    private int soluongPhong;
    private String category;
    public ToaNha(){

    }

    public ToaNha(String tenTN, Date date, int soluongPhong, String category) {
        this.tenTN = tenTN;
        this.date = date;
        this.soluongPhong = soluongPhong;
        this.category = category;
    }

    public String getTenTN() {
        return tenTN;
    }

    public void setTenTN(String tenTN) {
        this.tenTN = tenTN;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSoluongPhong() {
        return soluongPhong;
    }

    public void setSoluongPhong(int soluongPhong) {
        this.soluongPhong = soluongPhong;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ToaNha{" +
                "tenTN='" + tenTN + '\'' +
                ", date=" + date +
                ", soluongPhong=" + soluongPhong +
                ", category='" + category + '\'' +
                '}';
    }
}
