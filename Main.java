import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== QUAN LY SINH VIEN ===");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Sua sinh vien");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Sap xep sinh vien");
            System.out.println("5. Tim kiem sinh vien");
            System.out.println("6. Hien thi danh sach sinh vien");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    qlsv.themSinhVien();
                    break;
                case 2:
                    qlsv.suaSinhVien();
                    break;
                case 3:
                    qlsv.xoaSinhVien();
                    break;
                case 4:
                    qlsv.sapXepSinhVien();
                    break;
                case 5:
                    qlsv.timKiemSinhVien();
                    break;
                case 6:
                    qlsv.hienThiSinhVien();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);
    }
}
