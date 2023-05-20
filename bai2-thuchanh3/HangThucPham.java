import java.time.LocalDate;
import java.util.Scanner;

public class HangThucPham extends HangHoa {
    private LocalDate nsx, nhh = nsx;
    private String ncc;
    private double vat = 0.1;

    public HangThucPham() {

    }

    public HangThucPham(String mahang, String tenhang, int soluongton, double dongia, String ncc, LocalDate nsx,
            LocalDate nhh) {
        super(mahang, tenhang, soluongton, dongia);
        this.ncc = ncc;
        this.nsx = nsx;
    }

    public LocalDate getNsx() {
        return this.nsx;
    }

    public void setNsx(LocalDate nsx) {
        this.nsx = nsx;
    }

    public LocalDate getNhh() {
        return this.nhh;
    }

    public void setNhh(LocalDate nhh) {
        this.nhh = nhh;
    }

    public String getNcc() {
        return this.ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
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
        if (getSoluongton() != 0 && this.nhh.isAfter(nsx)) {
            System.out.println("kho ban");
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nha cung cap: ");
        ncc = sc.nextLine();
        int ngaysx, thangsx, namsx;
        int ngayhh, thanghh, namhh;
        do {
            System.out.println("nhap ngay san xuat: ");
            ngaysx = sc.nextInt();
            if (ngaysx < 0 || ngaysx > 31) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (ngaysx < 1 || ngaysx > 31);
        do {
            System.out.println("nhap thang san xuat: ");
            thangsx = sc.nextInt();
            if (thangsx < 1 || thangsx > 12) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (thangsx < 1 || thangsx > 12);
        do {
            System.out.println("nhap nam san xuat: ");
            namsx = sc.nextInt();
            if (namsx < 1940 || namsx > 2050) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (namsx < 1940 || namsx > 2050);
        nsx = LocalDate.of(ngaysx, thangsx, namsx);
        do {
            System.out.println("nhap ngay het han: ");
            ngayhh = sc.nextInt();
            if (ngayhh < 0 || ngayhh > 31) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (ngayhh < 1 || ngayhh > 31);
        do {
            System.out.println("nhap thang het han: ");
            thanghh = sc.nextInt();
            if (thanghh < 1 || thanghh > 12) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (thanghh < 1 || thanghh > 12);
        do {
            System.out.println("nhap nam het han: ");
            namhh = sc.nextInt();
            if (namhh < 1940 || namhh > 2050) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (namhh < 1940 || namhh > 2050);
        nhh = LocalDate.of(ngayhh, thanghh, namhh);
    }

    @Override
    public String toString() {
        return "{" +
                " nsx='" + getNsx() + "'" +
                ", nhh='" + getNhh() + "'" +
                ", ncc='" + getNcc() + "'" +
                ", vat='" + getVat() + "'" +
                "}";
    }

}