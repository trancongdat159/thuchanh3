import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SinhVien {
    private int ma;
    private String hoTen;
    private int namSinh;

    public SinhVien(int ma, String hoTen, int namSinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", hoTen=" + hoTen + ", namSinh=" + namSinh + '}';
    }
    
}