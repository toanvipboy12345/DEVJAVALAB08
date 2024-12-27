package BTH2;

import java.util.Scanner;

public class NhanKhau {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;

    // Hàm tạo không tham số
    public NhanKhau() {
    }

    // Hàm tạo có tham số
    public NhanKhau(String hoTen, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    // Hàm nhập thông tin
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
    }

    // Hàm hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
    }

    // Getter cho họ tên (để tìm kiếm)
    public String getHoTen() {
        return hoTen;
    }
}