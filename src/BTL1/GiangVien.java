package BTL1;

public abstract class GiangVien {
    protected String tenGiangVien;
    protected String email;
    protected String diaChi;
    protected String dienThoai;
    protected int soGioGiangDay;

    public GiangVien(String tenGiangVien, String email, String diaChi, String dienThoai, int soGioGiangDay) {
        this.tenGiangVien = tenGiangVien;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.soGioGiangDay = soGioGiangDay;
    }

    public abstract double tinhLuong(); // Phương thức tính lương (trừu tượng)

    @Override
    public String toString() {
        return "Tên: " + tenGiangVien + ", Email: " + email + ", Địa chỉ: " + diaChi +
                ", Điện thoại: " + dienThoai + ", Số giờ giảng dạy: " + soGioGiangDay;
    }
}