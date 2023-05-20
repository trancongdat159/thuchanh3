import java.time.LocalDate;
import java.util.Scanner;

public class HangSanhSu extends HangHoa {
    private String nhasanxuat;
    private LocalDate ngaynhapkho = LocalDate.now();
    private double vat = 0.1;

    public HangSanhSu() {

    }

    public HangSanhSu(String mahang, String tenhang, int soluongton, double dongia, String nhasanxuat,
            LocalDate ngaynhapkho) {
        super(mahang, tenhang, soluongton, dongia);
        this.nhasanxuat = nhasanxuat;
        this.ngaynhapkho = ngaynhapkho;
    }

    public String getNhasanxuat() {
        return this.nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public LocalDate getNgaynhapkho() {
        return this.ngaynhapkho;
    }

    public void setNgaynhapkho(LocalDate ngaynhapkho) {
        this.ngaynhapkho = ngaynhapkho;
    }

    public double getVat() {
        return this.vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public double tinhTien() {
        return getDongia() + getDongia() * this.vat;
    }

    @Override
    public void danhGia() {
        if (getSoluongton() > 50 && this.ngaynhapkho.isBefore(ngaynhapkho.plusDays(10)) == true) {
            System.out.println("ban cham");
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nha san xuat: ");
        nhasanxuat = sc.nextLine();
        int ngaynk, thangnk, namnk;
        do {
            System.out.println("nhap ngay nhap kho: ");
            ngaynk = sc.nextInt();
            if (ngaynk < 0 || ngaynk > 31) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (ngaynk < 1 || ngaynk > 31);
        do {
            System.out.println("nhap thang nhap kho: ");
            thangnk = sc.nextInt();
            if (thangnk < 1 || thangnk > 12) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (thangnk < 1 || thangnk > 12);
        do {
            System.out.println("nhap nam nhap kho: ");
            namnk = sc.nextInt();
            if (namnk < 1940 || namnk > 2050) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (namnk < 1940 || namnk > 2050);
        ngaynhapkho = LocalDate.of(ngaynk, thangnk, namnk);
    }

    @Override
    public String toString() {
        return "{" +
                " nhasanxuat='" + getNhasanxuat() + "'" +
                ", ngaynhapkho='" + getNgaynhapkho() + "'" +
                ", vat='" + getVat() + "'" +
                "}";
    }

}