package BTH2;


import java.util.Scanner;

public class SoHoKhau {
    private int soNguoi;
    private HoKhau[] danhSachHoKhau;

    // Hàm tạo không tham số
    public SoHoKhau() {
        soNguoi = 0;
        danhSachHoKhau = new HoKhau[10]; // Giả định tối đa 10 người trong một sổ
    }

    // Hàm nhập thông tin sổ hộ khẩu
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số người trong sổ hộ khẩu: ");
        soNguoi = sc.nextInt();
        sc.nextLine(); // Xóa bộ nhớ đệm

        danhSachHoKhau = new HoKhau[soNguoi];
        for (int i = 0; i < soNguoi; i++) {
            System.out.println("Nhập thông tin cho người thứ " + (i + 1) + ":");
            danhSachHoKhau[i] = new HoKhau();
            danhSachHoKhau[i].nhapThongTin();
        }
    }

    // Hàm hiển thị thông tin sổ hộ khẩu
    public void hienThiThongTin() {
        System.out.println("Số người trong sổ hộ khẩu: " + soNguoi);
        for (int i = 0; i < soNguoi; i++) {
            System.out.println("Thông tin người thứ " + (i + 1) + ":");
            danhSachHoKhau[i].hienThiThongTin();
        }
    }

    // Hàm tìm kiếm theo tên
    public void timKiemTheoTen(String ten) {
        boolean found = false;
        for (int i = 0; i < soNguoi; i++) {
            if (danhSachHoKhau[i].getHoTen().equalsIgnoreCase(ten)) {
                System.out.println("Người có tên \"" + ten + "\" được tìm thấy:");
                danhSachHoKhau[i].hienThiThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy người có tên \"" + ten + "\" trong sổ hộ khẩu.");
        }
    }
}