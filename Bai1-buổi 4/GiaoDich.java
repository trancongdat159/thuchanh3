package Bai1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GiaoDich {
    protected String maGiaoDich;
    protected LocalDate ngayGiaoDich;
    protected double donGia;
    protected double dienTich;
    protected double thanhTien;
    public GiaoDich() {
    }
    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, double thanhTien) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.thanhTien = thanhTien;
    }
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public String getMaGiaoDich() {
        return this.maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return this.ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return this.dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma giao dich: ");
        this.maGiaoDich = sc.nextLine();
        System.out.println("Nhap ngay giao dich: ");
        this.ngayGiaoDich = LocalDate.parse(sc.nextLine(), dtf);
        System.out.println("Nhap don gia: ");
        this.donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap dien tich: ");
        this.dienTich = Double.parseDouble(sc.nextLine());

    }
    public void xuat(){
        System.out.println("Ma giao dich: " + this.maGiaoDich);
        System.out.println("Ngay giao dich: " + this.ngayGiaoDich.format(dtf));
        System.out.println("Don gia: " + this.donGia);
        System.out.println("Dien tich: " + this.dienTich);
    }

    @Override
    public String toString() {
        return "{" +
            " maGiaoDich='" + getMaGiaoDich() + "'" +
            ", ngayGiaoDich='" + getNgayGiaoDich().format(dtf) + "'" +
            ", donGia='" + getDonGia() + "'" +
            ", dienTich='" + getDienTich() + "'" +
            "}";
    }
    public GiaoDichDat getGiaoDichDat() {
        return getGiaoDichDat();
    }
    public GiaoDichNha getGiaoDichNha() {
        return getGiaoDichNha();
    }



}
