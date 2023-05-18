import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author HP
 */
public class DSSV {
    private List<SinhVien> danhSach;
    
    public DSSV(){
        danhSach = new ArrayList<>();
    }

    public List<SinhVien> getDanhSach() {
        return danhSach;
    }
    
    public void themSinhVien(SinhVien sinhVien){
        danhSach.add(sinhVien);
    }
    
    public void xoaSinhVien(int ma){
        SinhVien sinhVien = timSinhVienTheoMa(ma);
        if (sinhVien != null){
            danhSach.remove(sinhVien);
        }
    }
   public void suaThongTinSinhVien(int ma, String hoTen, int namSinh){
       SinhVien sinhVien = timSinhVienTheoMa(ma);
       if (sinhVien != null){
           sinhVien.setHoTen(hoTen);
           sinhVien.setNamSinh(namSinh);
       }
   } 
   public SinhVien timSinhVienTheoMa(int ma){
       for(SinhVien sinhVien : danhSach){
           if(sinhVien.getMa()== ma){
               return sinhVien;
           }
       }
       return null;
   }
   public List<SinhVien> timSinhVienTheoTen(String ten){
       List<SinhVien> ketQua = new ArrayList<>();
       for(SinhVien sinhVien : danhSach){
           if(sinhVien.getHoTen().equals(ten)){
               ketQua.add(sinhVien);
           }
       }
       return ketQua;
   }
   public void sapXepTheoMaTangDan(){
       Collections.sort(danhSach, Comparator.comparingInt(SinhVien ::getMa));
   }
}