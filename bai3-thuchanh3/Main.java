import java.util.List;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[]args){
        DSSV danhSachSinhVien = new DSSV();
        
        danhSachSinhVien.themSinhVien(new SinhVien(1,"Nguyen Van A", 2003));
        danhSachSinhVien.themSinhVien(new SinhVien(2,"Tran Thi B", 2003));
        danhSachSinhVien.themSinhVien(new SinhVien(3,"Nguyen Van D", 2003));
        danhSachSinhVien.themSinhVien(new SinhVien(4,"Tran Van E", 2003));
        danhSachSinhVien.themSinhVien(new SinhVien(5,"Nguyen Thi C", 2003));
        
        List<SinhVien> dsSinhVien = danhSachSinhVien.getDanhSach();
        System.out.println("Danh sach sinh vien : ");
        for(SinhVien sinhVien : dsSinhVien){
            System.out.println(sinhVien);
        }
        
        danhSachSinhVien.themSinhVien(new SinhVien(6,"Tran Van F",2003));
        
        danhSachSinhVien.xoaSinhVien(3);
        
        danhSachSinhVien.suaThongTinSinhVien(2, "Tran Van B", 2003);
        
        SinhVien svTheoMa = danhSachSinhVien.timSinhVienTheoMa(4);
        if(svTheoMa != null){
            System.out.println("Sinh vien theo ma : ");
            System.out.println(svTheoMa);
        }
        
        List<SinhVien> svTheoTen = danhSachSinhVien.timSinhVienTheoTen("Tran Van B");
        if(!svTheoTen.isEmpty()){
            System.out.println("Sinh vien theo ten : ");
            for(SinhVien sinhVien : svTheoTen){
                System.out.println(sinhVien);
            }
        }
        
        danhSachSinhVien.sapXepTheoMaTangDan();
        
        System.out.println("Danh sach sinh vien sau khi sap xep : ");
        for(SinhVien sinhVien : dsSinhVien){
            System.out.println(sinhVien);
        }
    }

    private static class list<T> {

        public list() {
        }
    }
}