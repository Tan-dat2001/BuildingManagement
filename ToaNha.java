package ex;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToaNha {
    private String tenTN;
    private Date ngayThanhLap;
    private int soluongPhong;
//    private String loaiPhong;
    private boolean lagiangduong;
    List<Nhanvien> NhanVienQuanLy;

    public ToaNha(String tenTN, Date ngayThanhLap, int soluongPhong, boolean lagiangduong) {
        this.tenTN = tenTN;
        this.ngayThanhLap = ngayThanhLap;
        this.soluongPhong = soluongPhong;
        this.lagiangduong = lagiangduong;
        this.NhanVienQuanLy = new ArrayList<Nhanvien>();
    }

    public void themNhanVien(Nhanvien nhanvien){
        this.NhanVienQuanLy.add(nhanvien);
    }

    public boolean kiemTraSoPhongItHon(ToaNha toaNhaKhac){
        return this.soluongPhong < toaNhaKhac.soluongPhong;
    }

    public boolean kiemTraCungNgayThanhLap(ToaNha toaNhaKhac){
        return this.ngayThanhLap.equals(toaNhaKhac.ngayThanhLap);
    }

    public String getThongTinNhanVien(){
        if(lagiangduong || NhanVienQuanLy.isEmpty()){
            return "khong co thong tin";
        }
        return NhanVienQuanLy.get(0).getTen();

    }



}
