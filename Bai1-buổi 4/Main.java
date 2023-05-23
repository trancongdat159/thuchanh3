package Bai1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       QuanLyGiaoDich ql = new QuanLyGiaoDich();
       Scanner sc = new Scanner(System.in); 
       GiaoDich gd =  new GiaoDich() ;
       GiaoDichDat gdd = new GiaoDichDat();
         GiaoDichNha gdn = new GiaoDichNha();
       int luaChon = 0 ;
       do {
        ql.MENU();
        luaChon = sc.nextInt();
        if ( luaChon == 2 ){
            System.out.println("1. In tat ca giao dich\n"+
                                "2. In giao dich dat\n "+
                                "3. In giao dich nha\n "+
                                " Nhap lua chon: " );
            int i = sc.nextInt();
            if ( i == 1 ){
                ql.xuatGiaoDich(); 
            } else if ( i == 2){
                gdd.xuat();
            } else if ( i == 3){
                gdn.xuat();
            }
        }else if (luaChon == 1){
            System.out.println("1. Them giao dich dat\n "+
                                "2. Them giao dich nha\n "+
                                " Nhap lua chon: " );
            int i = sc.nextInt();
            if ( i == 1 ){
                gd = new GiaoDichDat();
                gd.nhap();
            }else if ( i == 2 ){
                gd = new GiaoDichNha();
                gd.nhap();
            }
        }
    } while ( luaChon != 0);
}
}
