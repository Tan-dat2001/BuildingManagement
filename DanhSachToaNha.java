package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachToaNha {
    private static ArrayList<ToaNha> danhsach;
    private Scanner sc;

    public DanhSachToaNha(){
        danhsach = new ArrayList<ToaNha>();
    }

    public ToaNha findByName(String tenTN){
        for (ToaNha toanha:danhsach) {
            if(toanha.getTenTN().equals(tenTN))
                return toanha;
        }
        return null;
    }

    public boolean kiemTra2ToaNha() {
        System.out.println("Nhập ten tòa nhà cần thứ nhất cần kiểm tra: ");
        String tn1 = sc.nextLine();
        System.out.println("Nhập ten tòa nhà cần thứ hai cần kiểm tra: ");
        String tn2 = sc.nextLine();

        ToaNha toaNha1 = findByName(tn1);
        ToaNha toaNha2 = findByName(tn2);
//        for (ToaNha toanha : danhsach) {
//            if (toanha.getTenTN().equals(tn1) && toanha.getTenTN().equals(tn2)) {
//                System.out.println("Cả 2 tòa nhà đều có trong danh sách");
//                return true;
//            } else {
//                System.out.println(" 1 hoặc 2 tòa nhà không có trong danh sách, Không thể so sánh");
//                return false;
//            }
//        }
        if(toaNha1 != null && toaNha2 != null){
            System.out.println("Cả 2 tòa nhà đều có trong danh sách");
            return true;
        }else{
            System.out.println(" 1 hoặc 2 tòa nhà không có trong danh sách, Không thể so sánh");
            return false;
        }
    }

//    public void kiemTraSoPhongItHon(){
//        System.out.println("Nhập ten tòa nhà cần thứ nhất cần kiểm tra: ");
//        String tn1 = sc.nextLine();
//        System.out.println("Nhập ten tòa nhà cần thứ hai cần kiểm tra: ");
//        String tn2 = sc.nextLine();
//
//        for (ToaNha toanha:danhsach) {
//            if(toanha.getTenTN().equals(tn1) && toanha.getTenTN().equals(tn2)){
//                System.out.println("Cả 2 tòa nhà đều có trong danh sách");
//                if(tn1.length() < tn2.length()) {
//                    System.out.println("Tòa nhà " + tn1 + " có số lượng phòng ít hơn " + tn2);
//                } else if (tn1.length() > tn2.length()) {
//                    System.out.println("Tòa nhà " + tn2 + " có số lượng phòng ít hơn " + tn1);
//                } else{
//                    System.out.println("Tòa nhà " + tn1 + " có số lượng phòng bằng " + tn2);
//                }
//            }
//            else {
//                System.out.println(" 1 hoặc 2 tòa nhà không có trong danh sách, Không thể so sánh");
//            }
//        }
//    }
    public void kiemTraSoPhongItHon(String tn1,String tn2){
        if(kiemTra2ToaNha()){
            if(tn1.length() < tn2.length()) {
                System.out.println("Tòa nhà " + tn1 + " có số lượng phòng ít hơn " + tn2);
            } else if (tn1.length() > tn2.length()) {
                System.out.println("Tòa nhà " + tn2 + " có số lượng phòng ít hơn " + tn1);
            } else{
                System.out.println("Tòa nhà " + tn1 + " có số lượng phòng bằng " + tn2);
            }
        }else {
            System.out.println(" 1 hoặc 2 tòa nhà không có trong danh sách, Không thể so sánh");
        }
    }

    public boolean kiemTraCungNgayTL(String tn1,String tn2){
        ToaNha toanha1 = findByName(tn1);
        ToaNha toanha2 = findByName(tn2);
        if(kiemTra2ToaNha()){
            System.out.println("So sánh ngày thành lập 2 tòa nhà");
            if(toanha1.getDate() == toanha2.getDate()){
                return true;
            }
            else
                return false;
        }
        return false;
    }
}


