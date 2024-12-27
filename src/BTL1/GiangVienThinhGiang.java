package BTL1;

public class GiangVienThinhGiang extends GiangVien {
    private String coQuanLamViec;
    private static final double LUONG_MOI_GIO = 200000; // Lương mỗi giờ

    public GiangVienThinhGiang(String tenGiangVien, String email, String diaChi, String dienThoai,
                               int soGioGiangDay, String coQuanLamViec) {
        super(tenGiangVien, email, diaChi, dienThoai, soGioGiangDay);
        this.coQuanLamViec = coQuanLamViec;
    }

    @Override
    public double tinhLuong() {
        return soGioGiangDay * LUONG_MOI_GIO;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cơ quan làm việc: " + coQuanLamViec + ", Lương tháng: " + tinhLuong();
    }
}