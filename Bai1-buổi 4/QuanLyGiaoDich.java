package Bai1;
import java.util.*;
public class QuanLyGiaoDich {
    ArrayList <GiaoDich> gd ;
    public void themGiaoDich(GiaoDich g){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong giao dich can them:");
        int n = sc.nextInt();
        for ( int i = 1 ; i <= n; i++){
            System.out.println("Nhap giao dich thu " + i);
            if ( g instanceof GiaoDichDat ){
                g = new GiaoDichDat();
                g.nhap();
            }else if ( g instanceof GiaoDichNha ){
                g = new GiaoDichNha();
                g.nhap();
            }
            gd.add(g);
        }
    }
    public void xuatGiaoDich(){
        System.out.println("|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        System.out.format("%- 15s %-30s %-30s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n",
                        "| Ma GD :",
                        "| Ngay GD :",
                        "| Don gia :",
                        "| Loai dat :",
                        "| Thanh tien :",
                        "| Loai nha :",
                        "| Dien tich :",
                        "| Dia chi :",
                        "| Thanh tien :",
                        "|");
        System.out.println("|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        for ( GiaoDich g : gd){
            System.out.format("%-15s %-30s %-30s %-20s %-20s %-20s %-20s %-20s \n",
                        g.getMaGiaoDich(),
                        g.getNgayGiaoDich(),
                        g.getDonGia(),
                        g.getGiaoDichDat().getLoaiDat(),
                        g.getGiaoDichDat().getThanhTien(),
                        g.getGiaoDichNha().getLoaiNha(),
                        g.getDienTich(),
                        g.getGiaoDichNha().getDiaChi(),
                        g.getGiaoDichNha().getThanhTien(),
                        "| ");
            System.out.println("|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        }
    }
    public void MENU(){
        System.out.printf("----MENU----\n" +
        "1.Nhap\n" +
        "2.Xuat\n" +
        "Nhap lua chon: ");
    }

}
