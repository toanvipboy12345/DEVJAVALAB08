package BTL1;
public class GiangVienCoHuu extends GiangVien {
    private double luongThoaThuan;
    private static final int GIO_QUY_DINH = 40; // Số giờ quy định trong tháng
    private static final double LUONG_THEM_MOI_GIO = 50000; // Lương cộng thêm trên giờ vượt

    public GiangVienCoHuu(String tenGiangVien, String email, String diaChi, String dienThoai,
                          int soGioGiangDay, double luongThoaThuan) {
        super(tenGiangVien, email, diaChi, dienThoai, soGioGiangDay);
        this.luongThoaThuan = luongThoaThuan;
    }

    @Override
    public double tinhLuong() {
        if (soGioGiangDay > GIO_QUY_DINH) {
            return luongThoaThuan + (soGioGiangDay - GIO_QUY_DINH) * LUONG_THEM_MOI_GIO;
        }
        return luongThoaThuan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lương thỏa thuận: " + luongThoaThuan + ", Lương tháng: " + tinhLuong();
    }
}