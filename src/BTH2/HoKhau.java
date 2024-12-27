package BTH2;

import java.util.Scanner;

public class HoKhau extends NhanKhau {
    private String diaChi;
    private String noiCongTac;

    // Hàm tạo không tham số
    public HoKhau() {
        super();
    }

    // Hàm tạo có tham số
    public HoKhau(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String noiCongTac) {
        super(hoTen, ngaySinh, gioiTinh);
        this.diaChi = diaChi;
        this.noiCongTac = noiCongTac;
    }

    // Hàm nhập thông tin (gọi hàm nhập của lớp cha)
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập địa chỉ hiện nay: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập nơi công tác: ");
        noiCongTac = sc.nextLine();
    }

    // Hàm hiển thị thông tin (gọi hàm hiển thị của lớp cha)
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Địa chỉ hiện nay: " + diaChi);
        System.out.println("Nơi công tác: " + noiCongTac);
    }
}