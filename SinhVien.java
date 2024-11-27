public class SinhVien {
    private String maSV;
    private String tenSV;
    private double diemTB;

    public SinhVien(String maSV, String tenSV, double diemTB) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Mã SV: " + maSV + ", Tên: " + tenSV + ", Điểm TB: " + diemTB;
    }
}
