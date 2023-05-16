package ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yy");
        DanhSachToaNha dstn = new DanhSachToaNha();

        ToaNha toaNha1 = new ToaNha("Tòa Nhà A", new Date(2023,5,16), 20, true );
        ToaNha toaNha2 = new ToaNha("Tòa Nhà B", new Date(2023,5,17), 30, false );
        ToaNha toaNha3 = new ToaNha("Tòa Nhà C", new Date(2023,5,16), 40, false );

        Nhanvien nhanvien1 = new Nhanvien("nv01", "nguyen van a");

        toaNha1.themNhanVien((nhanvien1));

        dstn.themToaNha(toaNha1);
        dstn.themToaNha(toaNha2);
        dstn.themToaNha(toaNha3);
        //test phương thức lấy số lượng tòa nhà
        System.out.println(dstn.getSoLuongToaNha());
        //test phương thức kiểm tra số phòng
        System.out.println(toaNha1.kiemTraSoPhongItHon(toaNha2));
        //test phương thức lấy thông tin nhân viên
        System.out.println(toaNha3.getThongTinNhanVien());
        //tets phương thức kiểm tra cùng ngày thành lập
        System.out.println(toaNha2.kiemTraCungNgayThanhLap(toaNha3));


        System.out.println("------------MENU-------------"
                        + "1. Thêm tòa nhà. \n"
                        + "2. Thêm nhân viên. \n"
                        + "3. Kiểm tra số phòng ít hơn. \n"
                        + "4. Kiểm tra cùng ngày thành lập. \n"
                        + "5. Lấy số lượng tòa nhà. \n"
                        + "6. Lấy thông tin nhân viên. \n"
        );
        System.out.println("Nhập tùy chọn của bạn: ");
        int choose = sc.nextInt();
        while(true){
            if(choose < 1 || choose >6){
                System.out.println("Tùy chọn vừa nhập không hợp lệ, nhập lại: ");
                choose = sc.nextInt();
                break;
            }
        }

        switch (choose){
            case 1:
                System.out.println("Bạn chọn thêm tòa nhà");
                System.out.println("Tên tòa nhà: " ); String tenTN = sc.nextLine();
                System.out.println("Ngày thành lập: ");
                try {
                    Date ngayTL = date.parse(sc.nextLine());
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Số lượng phòng: "); int soluongPhong = sc.nextInt();
                System.out.println("Có phải là Giảng đường không: ");
                if(){

                }

        }




    }


}
