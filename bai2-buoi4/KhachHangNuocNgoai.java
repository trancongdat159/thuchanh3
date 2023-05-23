public class KhachHangNuocNgoai extends KhachHang{
    private String QuocTich;
    /**
     * 
     */
    public KhachHangNuocNgoai()
    {
        super();
        this.QuocTich="";
    }
    public KhachHangNuocNgoai (int ma, double dgia,String ngay,String hoten,int sl, double ttien,String qt){
        super(ma, dgia,ngay,hoten,sl,ttien);
        this.QuocTich=qt;
    }
    public void setQuocTinh(String quocTich){
        QuocTich=quocTich;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Quoc tich:");
        QuocTich =in.next();
    }
    public double TTien()
    {
        return this.ThanhTien=this.SoLuong*this.DonGia;
    }
    public String toString(){
        return " Khach Hang Nuoc Ngoai :"+super.toString()+"QuocTich:"+ QuocTich+",ThanhTien:"+ThanhTien;
    }
}
    

