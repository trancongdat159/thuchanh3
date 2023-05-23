import java.util.Scanner;
public class KhachHang{
    protected int MaKH,SoLuong;
    protected double DonGia,ThanhTien;
    protected String NgayHD,HoTenKH;
    /**
     *
     */
    Scanner in =new Scanner(System.in);
    public Scanner getIn() {
        return in;
    }
protected KhachHang()
{
    this.MaKH=0;
    this.DonGia=0;
    this.NgayHD="";
    this.HoTenKH="";
    this.SoLuong=0;
}
protected KhachHang (int ma, double dgia,String ngay, String hoten,int sl,double ttien){
    this.MaKH=ma;
    this.DonGia=dgia;
    this.NgayHD=ngay;
    this.HoTenKH=hoten;
    this.SoLuong=sl;
    this.ThanhTien=ttien;
}
protected int getMaKH(){
    return MaKH;
}
protected void setMaKH(int maKH){
    MaKH=maKH;
}
protected double getDonGia(){
    return DonGia;
}
protected void setDonGia(double donGia){
    DonGia=donGia;
}
protected String getNgayHD(){
    return NgayHD;
}
protected void setNgayHD(String ngayHD){
    NgayHD=ngayHD;
}
protected String getHovaTenKH(){
    return HoTenKH;
}
protected void setHoTenKH(String hoTenKH){
    HoTenKH=hoTenKH;
}

protected int getSoLuong(){
    return SoLuong;
}

protected void setSoLuong (int sl ){
    SoLuong=sl;
}
protected double getThanhTien(){
    return ThanhTien;


}
protected void setThanhTien (double thanhTien){
    ThanhTien=thanhTien;
}
protected void nhap (){
    System.out.println("Nhập Mã Khách Hàng");
    MaKH=in.nextInt();
    System.out.println("Họ và tên khách hàng:");
    HoTenKH =in.next();
    System.out.println("ngày lập hóa đơn ");
    NgayHD=in.next();
    System.out.println("So lương (KW):");
    SoLuong=in.nextInt();
    System.out.println("Don gia:");
    DonGia=in.nextDouble();
}
public String toString(){
    return"[MaKH:"+MaKH+",HoTenKH:"+HoTenKH+",NgayHD:"+ NgayHD+",DonGia:"+DonGia+",SoLuong:"+SoLuong+"]";
}
}