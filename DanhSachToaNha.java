package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachToaNha {
    private static ArrayList<ToaNha> danhsach;
    private Scanner sc;

    public DanhSachToaNha(){
        danhsach = new ArrayList<ToaNha>();
    }

    public void themToaNha(ToaNha toaNha){
        danhsach.add(toaNha);
    }

    public int getSoLuongToaNha(){
        return danhsach.size();
    }




}


