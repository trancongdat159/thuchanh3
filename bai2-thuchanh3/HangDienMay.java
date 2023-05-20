import java.time.LocalDate;
import java.util.Scanner;

public class HangDienMay extends HangHoa {
    private int baohanh;
    private double congsuat;
    private double vat = 0.05;

    public HangDienMay() {

    }

    public HangDienMay(String mahang, String tenhang, int soluongton, double dongia, int baohanh, double congsuat) {
        super(mahang, tenhang, soluongton, dongia);
        this.baohanh = baohanh;
        this.congsuat = congsuat;
    }

    public int getBaohanh() {
        return this.baohanh;
    }

    public void setBaohanh(int baohanh) {
        if (this.baohanh < 0) {
            System.out.println("khong hop le! nhap lai");
        } else {
            this.baohanh = baohanh;
        }
    }

    public double getCongsuat() {
        return this.congsuat;
    }

    public void setCongsuat(double congsuat) {
        if (this.congsuat < 0) {
            System.out.println("khong hop le! nhap lai");
        } else {
            this.congsuat = congsuat;
        }
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
        if (this.getSoluongton() < 3) {
            System.out.println("ban duoc");
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap thang bao hanh: ");
            this.baohanh = sc.nextInt();
            if (this.baohanh < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (this.baohanh < 0);
        do {
            System.out.println("nhap cong suat: ");
            this.congsuat = sc.nextDouble();
            if (this.congsuat < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (this.congsuat < 0);
    }

    @Override
    public String toString() {
        return "{" +
                " baohanh='" + getBaohanh() + "'" +
                ", congsuat='" + getCongsuat() + "'" +
                ", vat='" + getVat() + "'" +
                "}";
    }

}