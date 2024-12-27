package BTL1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyGiangVien {
    private static ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChon;
        do {
            System.out.println("\n--- QUẢN LÝ GIẢNG VIÊN ---");
            System.out.println("1. Nhập thông tin giảng viên");
            System.out.println("2. Xuất danh sách toàn bộ giảng viên");
            System.out.println("3. Xuất danh sách giảng viên cơ hữu");
            System.out.println("4. Xuất danh sách giảng viên thỉnh giảng");
            System.out.println("5. Tính tổng số tiền lương của toàn bộ giảng viên");
            System.out.println("6. Tìm giảng viên có tổng lương cao nhất");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    nhapThongTinGiangVien();
                    break;
                case 2:
                    xuatDanhSachToanBoGiangVien();
                    break;
                case 3:
                    xuatDanhSachGiangVienCoHuu();
                    break;
                case 4:
                    xuatDanhSachGiangVienThinhGiang();
                    break;
                case 5:
                    tinhTongLuong();
                    break;
                case 6:
                    timGiangVienLuongCaoNhat();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (luaChon != 0);
    }

    private static void nhapThongTinGiangVien() {
        System.out.println("1. Nhập giảng viên cơ hữu");
        System.out.println("2. Nhập giảng viên thỉnh giảng");
        int loai = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua dòng newline

        System.out.print("Tên giảng viên: ");
        String ten = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Điện thoại: ");
        String dienThoai = scanner.nextLine();
        System.out.print("Số giờ giảng dạy trong tháng: ");
        int soGio = scanner.nextInt();

        if (loai == 1) {
            System.out.print("Lương thỏa thuận: ");
            double luong = scanner.nextDouble();
            danhSachGiangVien.add(new GiangVienCoHuu(ten, email, diaChi, dienThoai, soGio, luong));
        } else if (loai == 2) {
            scanner.nextLine(); // Nhập lại dòng mới
            System.out.print("Cơ quan làm việc: ");
            String coQuan = scanner.nextLine();
            danhSachGiangVien.add(new GiangVienThinhGiang(ten, email, diaChi, dienThoai, soGio, coQuan));
        } else {
            System.out.println("Loại giảng viên không hợp lệ.");
        }
    }

    private static void xuatDanhSachToanBoGiangVien() {
        System.out.println("\n--- DANH SÁCH TOÀN BỘ GIẢNG VIÊN ---");
        for (GiangVien gv : danhSachGiangVien) {
            System.out.println(gv);
        }
    }

    private static void xuatDanhSachGiangVienCoHuu() {
        System.out.println("\n--- DANH SÁCH GIẢNG VIÊN CƠ HỮU ---");
        for (GiangVien gv : danhSachGiangVien) {
            if (gv instanceof GiangVienCoHuu) {
                System.out.println(gv);
            }
        }
    }

    private static void xuatDanhSachGiangVienThinhGiang() {
        System.out.println("\n--- DANH SÁCH GIẢNG VIÊN THỈNH GIẢNG ---");
        for (GiangVien gv : danhSachGiangVien) {
            if (gv instanceof GiangVienThinhGiang) {
                System.out.println(gv);
            }
        }
    }

    private static void tinhTongLuong() {
        double tongLuong = 0;
        for (GiangVien gv : danhSachGiangVien) {
            tongLuong += gv.tinhLuong();
        }
        System.out.println("Tổng lương của toàn bộ giảng viên: " + tongLuong + " VND");
    }

    private static void timGiangVienLuongCaoNhat() {
        if (danhSachGiangVien.isEmpty()) {
            System.out.println("Danh sách giảng viên rỗng.");
            return;
        }

        GiangVien maxLuongGV = danhSachGiangVien.get(0);
        for (GiangVien gv : danhSachGiangVien) {
            if (gv.tinhLuong() > maxLuongGV.tinhLuong()) {
                maxLuongGV = gv;
            }
        }
        System.out.println("Giảng viên có lương cao nhất: ");
        System.out.println(maxLuongGV);
    }
}