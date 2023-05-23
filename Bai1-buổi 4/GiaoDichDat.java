package Bai1;

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    private double thanhTien;
    public GiaoDichDat() {

    }
    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loatDat, double thanhTien) {
        super();
        this.loaiDat = loatDat;
    }

    public String getLoaiDat() {
        return this.loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double getThanhTien() {
        return this.thanhTien;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai dat: ");
        if(sc.nextLine().equals("A")){
            this.loaiDat = "A";
        }
        else if(sc.nextLine().equals("B")){
            this.loaiDat = "B";
        }else if( sc.nextLine().equals("C")){
            this.loaiDat = "C";
        }else{
            System.out.println("Nhap lai loai dat: ");
        }

    }
    public void xuat(){
        super.xuat();
        System.out.println("Loai dat: " + this.loaiDat);
        System.out.println("Thanh tien: " + this.thanhTien);
    }
    public void setThanhTien() {
        if (this.loaiDat.equals("A")){
            this.thanhTien = this.dienTich * 3/2 * this.donGia;
        } else if (this.loaiDat.equals("B") && this.loaiDat.equals("C")){
            this.thanhTien = this.dienTich * this.donGia;
        }  
    }

    @Override
    public String toString() {
        return "{" +
            " loaiDat='" + getLoaiDat() + "'" +
            ", thanhTien='" + getThanhTien() + "'" +
            "}";
    }


}
