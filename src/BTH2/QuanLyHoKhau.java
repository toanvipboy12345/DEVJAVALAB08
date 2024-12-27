package BTH2;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoKhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SoHoKhau> danhSachSoHoKhau = new ArrayList<>();

        // Nhập danh sách các sổ hộ khẩu
        System.out.print("Nhập số lượng sổ hộ khẩu: ");
        int soLuong = sc.nextInt();
        sc.nextLine(); // Xóa bộ nhớ đệm

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho sổ hộ khẩu thứ " + (i + 1) + ":");
            SoHoKhau soHoKhau = new SoHoKhau();
            soHoKhau.nhapThongTin();
            danhSachSoHoKhau.add(soHoKhau);
        }

        // Hiển thị thông tin về các sổ hộ khẩu
        System.out.println("\nThông tin các sổ hộ khẩu đã nhập:");
        for (SoHoKhau soHoKhau : danhSachSoHoKhau) {
            soHoKhau.hienThiThongTin();
            System.out.println();
        }

        // Tìm kiếm theo tên
        System.out.print("Nhập tên người cần tìm: ");
        String tenTimKiem = sc.nextLine();
        boolean found = false;

        for (SoHoKhau soHoKhau : danhSachSoHoKhau) {
            soHoKhau.timKiemTheoTen(tenTimKiem);
        }
    }
}