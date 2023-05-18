package bai1;
import java.time.LocaDate;

public class Test {
    public stactic void main (String[] args){
        Scanner scanner =new Scanner (System.in);
        System.out.print ("Mã Hóa Đơn :");
        int orderID = scanner.nextInt();
        System.out.print(" nhập ngày lập hóa đơn: ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofpattern("d/m/yyy");
        LocalDate orderDate =LocaDate.parse (orderDateStr,dateTimeFormatter);
        Order order =new Order (orderID,orderDate);
        boolean continueAdding =true;
        while (continueAdding){
            System.out.print(" nhập tên sản phẩm: ");
            String productName =scanner.next();
            scanner.nextLine();
            System.out.print (" nhập mã sản phẩm :");
            String productID=scanner.next();
            System.out.print( " nhập đơn giá :");
            double price =scanner.nextDouble();
            System.out.print(" nhập số lượng:");
            int quantity =scanner.nextInt();
            Product product= new Product(productName,productID,price);
            order.addLineItems(product,quantity);
            System.out.print("tiếp tục thêm sản phẩm(y/n) :");
            String choice =scanner.next();
            continueAdding=choice.equalsIgnoreCase("y");

        }
        System.out.println ("Mã hóa hóa :"+order.getOrderID());
        String fomatteDate=order.getPOrderDate().format(dateTimeFormatter);
        System.out.prinln (" Ngày lập hóa đơn :"+ fomatteDate);
        System.out.prinln ("Stt    | Ma Sp    | Mo ta   | Don gia   |  So Luong  | Thanh tien ");
        DecimalFormat DecimalFormat=new DecimalFormat("#,### VND");
        List <OrderDetail> lineItems = order.getLineItems();
        for (OrderDetail orderDetail: lineItems){
            System.out.printf ("%-10s | %-8s| %-20s|%-15s|%-15s|%-15s\n",
            stt,
            orderDetail.getProduct().getProductID(),
            orderDetail.getProduct().getDes(),
            DecimalFormat.format (orderDetail.getProduct().getPrice()),
            orderDetail.getQuantily(),
            DecimalFormat.format(orderDetail.calcTotalPrice()));
            stt++;
        }
        System.out.prinln("Tong tien thanh toan:"+DecimalForma.format(order.calcTotalCharge(0)));
        
    }
}