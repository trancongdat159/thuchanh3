import java.util.Scanner;

abstract class HangHoa {
    private String mahang, tenhang;
    private int soluongton;
    private double dongia;

    public HangHoa() {

    }

    public HangHoa(String mahang, String tenhang, int soluongton, double dongia) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.soluongton = soluongton;
        this.dongia = dongia;
    }

    public String getMahang() {
        return this.mahang;
    }

    public void setMahang(String mahang) {
        if (this.mahang != "") {
            this.mahang = mahang;
        } else {
            this.mahang = "chua nhap ma hang";
        }
    }

    public String getTenhang() {
        return this.tenhang;
    }

    public void setTenhang(String tenhang) {
        if (this.tenhang != "") {
            this.tenhang = tenhang;
        } else {
            this.tenhang = "chua nhap ten hang";
        }
    }

    public int getSoluongton() {
        return this.soluongton;
    }

    public void setSoluongton(int soluongton) {
        if (this.soluongton >= 0) {
            this.soluongton = soluongton;
        } else {
            System.out.println("so luong khong hop le");
        }
    }

    public double getDongia() {
        return this.dongia;
    }

    public void setDongia(double dongia) {
        if (this.soluongton > 0) {
            this.soluongton = soluongton;
        } else {
            System.out.println("so luong khong hop le");
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap ma hang: ");
            this.mahang = sc.nextLine();
            if (this.mahang == "") {
                System.out.println("ma hang rong! nhap lai");
            }
        } while (this.mahang == "");
        do {
            System.out.println("nhap ten hang: ");
            this.tenhang = sc.nextLine();
            if (this.tenhang == "") {
                System.out.println("ten hang rong! nhap lai");
            }
        } while (this.tenhang == "");
        do {
            System.out.println("nhap so luong ton: ");
            this.soluongton = sc.nextInt();
            if (this.soluongton < 0) {
                System.out.println("so luong khong hop le! nhap lai");
            }
        } while (this.soluongton < 0);
        do {
            System.out.println("nhap don gia: ");
            this.dongia = sc.nextDouble();
            if (this.dongia < 0) {
                System.out.println("don gia khong hop le! nhap lai");
            }
        } while (this.dongia < 0);
    }

    abstract double tinhTien();

    abstract void danhGia();

    @Override
    public String toString() {
        return "{" +
                " mahang='" + getMahang() + "'" +
                ", tenhang='" + getTenhang() + "'" +
                ", soluongton='" + getSoluongton() + "'" +
                ", dongia='" + getDongia() + "'" +
                "}";
    }

}