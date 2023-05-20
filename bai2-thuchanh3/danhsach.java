import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    ArrayList<HangHoa> dshh;

    public DanhSach() {
        dshh = new ArrayList<>();
    }

    public void them(HangHoa hh) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            if (hh instanceof HangDienMay) {
                hh = new HangDienMay();
                hh.nhap();
            } else if (hh instanceof HangThucPham) {
                hh = new HangThucPham();
                hh.nhap();
            } else if (hh instanceof HangDienMay) {
                hh = new HangDienMay();
                hh.nhap();
            }
            dshh.add(hh);
        }
    }

    public void xuatHH() {
        System.out.println(
                "|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        System.out.format("%-15s %-30s %-30s \n",
                "| Ma HH",
                "| Ten HH",
                "| So luong ton",
                "| Don gia");
        System.out.println(
                "|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        for (HangHoa hh : dshh) {
            System.out.format("%-15s %-30s %-30s %-1s\n",
                    "| " + hh.getMahang(),
                    "| " + hh.getTenhang(),
                    "| " + hh.getSoluongton(),
                    "| " + hh.getDongia(),
                    "     |");
            System.out.println(
                    "|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        }
    }

    public void MENU() {
        System.out.printf("MENU\n" +
                "0.Thoat\n" +
                "1.Xuat\n" +
                "2.Nhap\n");
    }
}