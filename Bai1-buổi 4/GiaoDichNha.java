package Bai1;

import java.time.LocalDate;
import java.util.*;

public class GiaoDichNha extends GiaoDich  {
    private String loaiNha;
    private String diaChi ;
    public GiaoDichNha() {

    }
    public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha, double thanhTien, String diaChi){
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return this.loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public double getThanhTien() {
        return this.thanhTien;
    }
    public void setthanhTien(){
        if (this.loaiNha.equals("Cao cap")){
            this.thanhTien = this.dienTich *  this.donGia;
        } else if (this.loaiNha.equals("Thuong")){
            this.thanhTien = this.dienTich * this.donGia * 90/100;
        }
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai nha: ");
        if (sc.nextLine().equals("Cao cap")){
            this.loaiNha = "Cao cap";
        } else if (sc.nextLine().equals(" Thuong")){
            this.loaiNha = "Thuong";
        }
    }
    public void xuat(){
        super.xuat();
        System.out.println("Loai nha: " + this.loaiNha);
        System.out.println("Thanh tien: " + this.thanhTien);
        System.out.println("Dia chi: " + this.diaChi);
    }

    @Override
    public String toString() {
        return "{" +
            " loaiNha='" + getLoaiNha() + "'" +
            ", thanhTien='" + getThanhTien() + "'" +
            ", diaChi='" + getDiaChi() + "'" +
            "}";
    }
    


}
