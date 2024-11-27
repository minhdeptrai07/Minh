import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    private ArrayList<SinhVien> danhSachSV = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 1. Thêm sinh viên
    public void themSinhVien() {
        System.out.print("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        String tenSV = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        double diemTB = Double.parseDouble(scanner.nextLine());
        danhSachSV.add(new SinhVien(maSV, tenSV, diemTB));
        System.out.println("Them sinh vien thanh cong.");
    }

    // 2. Sửa sinh viên
    public void suaSinhVien() {
        System.out.print("Nhap ma sinh vien can sua: ");
        String maSV = scanner.nextLine();
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                System.out.print("Nhap ten moi: ");
                sv.setTenSV(scanner.nextLine());
                System.out.print("Nhap diem TB moi: ");
                sv.setDiemTB(Double.parseDouble(scanner.nextLine()));
                System.out.println("Sua thong tin thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien.");
    }

    // 3. Xóa sinh viên
    public void xoaSinhVien() {
        System.out.print("Nhap ma sinh vien can xoa: ");
        String maSV = scanner.nextLine();
        danhSachSV.removeIf(sv -> sv.getMaSV().equals(maSV));
        System.out.println("Xoa sinh vien thanh cong.");
    }

    // 4. Sắp xếp sinh viên (Bubble Sort theo điểm TB)
    public void sapXepSinhVien() {
        for (int i = 0; i < danhSachSV.size() - 1; i++) {
            for (int j = 0; j < danhSachSV.size() - i - 1; j++) {
                if (danhSachSV.get(j).getDiemTB() > danhSachSV.get(j + 1).getDiemTB()) {
                    SinhVien temp = danhSachSV.get(j);
                    danhSachSV.set(j, danhSachSV.get(j + 1));
                    danhSachSV.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sap xep sinh vien thanh cong.");
    }

    // 5. Tìm kiếm sinh viên theo mã
    public void timKiemSinhVien() {
        System.out.print("Nhap ma sinh vien can tim: ");
        String maSV = scanner.nextLine();
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                System.out.println("Thong tin sinh vien: " + sv);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien.");
    }

    // Hiển thị danh sách sinh viên
    public void hienThiSinhVien() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sach sinh vien trong.");
        } else {
            System.out.println("Danh sach sinh vien:");
            for (SinhVien sv : danhSachSV) {
                System.out.println(sv);
            }
        }
    }
}
