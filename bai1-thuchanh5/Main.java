import java.util.Scanner;

public class Main {
    private static QuanLyPhongHoc quanLyPhongHoc;
    private static Scanner scanner;

    /**
     * @param args
     */
    public static void main(String[] args) {
        quanLyPhongHoc = new QuanLyPhongHoc();
        scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println(" MENU ");
            System.out.println("1. Them phong hoc");
            System.out.println("2. Tim kiem phong  theo ma phong");
            System.out.println("3. In danh sach phong hoc");
            System.out.println("4. In  phong hoc dat chuan");
            System.out.println("5. Sap xep danh sach phong hoc theo day nha");
            System.out.println("6. Sap xep danh sach phong hoc giam dan theo dien tich");
            System.out.println("7. Sap xep danh sach phong hoc tang dan theo so bong den");
            System.out.println("8. capNhatSoMayTinh");
            System.out.println("9. xoa phong hoc");
            System.out.println("10.inTongSoPhongHoc ");
            System.out.println("11.inDanhSachPhongMay60May ");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    themPhongHoc();
                    break;
                case 2:
                    timPhongHocTheoMaPhong();
                    break;
                case 3:
                    inDanhSachPhongHoc();
                    break;
                case 4:
                    inDanhSachPhongHocDatChuan();
                    break;
                case 5:
                    sapXepTheoDayNha();
                    break;
                case 6:
                    sapXepTheoDienTichGiamDan();
                    break;
                case 7:
                    sapXepTheoSoBongDenTangDan(); 
                    break;
                    case 8:
                    capNhatSoMayTinh();
                    break;
                case 9:
                    xoaPhongHoc();
                    break;
                case 10:
                    inTongSoPhongHoc();
                    break;
                case 11:
                    inDanhSachPhongMay60May();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
                case 0:
                    System.out.println("Ket thuc");
                    break;
                

            }
        } while (choice != 0);
    }

    private static void inDanhSachPhongMay60May() {
        quanLyPhongHoc.inDanhSachPhongMay60May();
    }

    private static void inTongSoPhongHoc() {
        quanLyPhongHoc.inTongSoPhongHoc();
    }

    private static void xoaPhongHoc() {
        scanner.nextLine(); // Đọc bỏ dòng new line trước đó
        System.out.print("Nhập mã phòng cần xóa: ");
        String maPhong = scanner.nextLine();

        System.out.print("Bạn có chắc chắn muốn xóa phòng " + maPhong + "? (true/false): ");
        boolean xacNhanXoa = scanner.nextBoolean();

        if (xacNhanXoa) {
            quanLyPhongHoc.xoaPhongHoc(maPhong);
        } else {
            System.out.println("Hủy xóa phòng " + maPhong);
        }
    }
    

    private static void capNhatSoMayTinh() { scanner.nextLine(); // Đọc bỏ dòng new line trước đó
        System.out.print("Nhập mã phòng cần cập nhật: ");
        String maPhong = scanner.nextLine();

        System.out.print("Nhập số máy tính mới: ");
        int soMayTinhMoi = scanner.nextInt();

        quanLyPhongHoc.capNhatSoMayTinh(maPhong, soMayTinhMoi);
    }
    }

    private static void themPhongHoc() {
        scanner.nextLine(); // Đọc bỏ dòng new line trước đó
        System.out.print("nhap ma phong: ");
        String maPhong = scanner.nextLine();

        System.out.print("Nhap day nha: ");
        String dayNha = scanner.nextLine();

        System.out.print("Nhap dien tich: ");
        double dienTich = scanner.nextDouble();

        System.out.print("Nhap bong den: ");
        int soBongDen = scanner.nextInt();

        System.out.println(" Loại phòng học ");
        System.out.println("1. Phong ly thuyet");
        System.out.println("2. Phòng may tinh");
        System.out.println("3. Phòngthi nghiem");
        System.out.print("lua chon cua ban: ");
        int typeChoice = scanner.nextInt();

        switch (typeChoice) {
            case 1:
                System.out.print("Có máy chiếu (true/false): ");
                boolean coMayChieu = scanner.nextBoolean();
                PhongHocLyThuyet phongLyThuyet = new PhongHocLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
                quanLyPhongHoc.themPhongHoc(phongLyThuyet);
                break;
            case 2:
                System.out.print("nhap so may tinh: ");
                int soMayTinh = scanner.nextInt();
                PhongHocMayTinh phongMayTinh = new PhongHocMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
                quanLyPhongHoc.themPhongHoc(phongMayTinh);
                break;
            case 3:
                scanner.nextLine(); // Đọc bỏ dòng new line trước đó
                System.out.print("Nhap chuyen nganh: ");
                String chuyenNganh = scanner.nextLine();

                System.out.print("Nhap sua chua: ");
                int sucChua = scanner.nextInt();

                System.out.print("Có bồn rửa (true/false): ");
                boolean coBonRua = scanner.nextBoolean();
                PhongHocThiNghiem phongThiNghiem = new PhongHocThiNghiem(maPhong, dayNha, dienTich, soBongDen,
                        chuyenNganh, sucChua, coBonRua);
                quanLyPhongHoc.themPhongHoc(phongThiNghiem);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    private static void timPhongHocTheoMaPhong() {
        scanner.nextLine(); // Đọc bỏ dòng new line trước đó
        System.out.print("Nhập mã phòng cần tìm: ");
        String maPhong = scanner.nextLine();
        PhongHoc phongHoc = quanLyPhongHoc.timPhongHoc(maPhong);
        if (phongHoc != null) {
            System.out.println("Thông tin phòng học:");
            System.out.println(phongHoc);
        } else {
            System.out.println("Không tìm thấy phòng học với mã phòng " + maPhong);
        }
    }

    private static void inDanhSachPhongHoc() {
        System.out.println("Danh sách phòng học:");
        quanLyPhongHoc.inDanhSachPhongHoc();
    }

    private static void inDanhSachPhongHocDatChuan() {
        System.out.println("Danh sách phòng học đạt chuẩn:");
        quanLyPhongHoc.inDanhSachPhongHocDatChuan();
    }

    private static void sapXepTheoDayNha() {
        quanLyPhongHoc.sapXepTheoDayNha();
        System.out.println("Danh sách phòng học sau khi sắp xếp theo dãy nhà:");
        quanLyPhongHoc.inDanhSachPhongHoc();
    }

    private static void sapXepTheoDienTichGiamDan() {
        quanLyPhongHoc.sapXepTheoDienTichGiamDan();
        System.out.println("Danh sách phòng học sau khi sắp xếp giảm dần theo diện tích:");
        quanLyPhongHoc.inDanhSachPhongHoc();
    }

    private static void sapXepTheoSoBongDenTangDan() {
        quanLyPhongHoc.sapXepTheoSoBongDenTangDan();
        System.out.println("danh sach phong hoc sap xep theo thu tu tang dan so bong den:");
        quanLyPhongHoc.inDanhSachPhongHoc();
    }
    
}