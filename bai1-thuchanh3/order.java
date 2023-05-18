package bai1;

import java.time.LocalDate;
 public class Order {
    private int orderID;
    private LocalDate orderDate;
    private List <OrderDetail> lineItems;
 }
 public Order(){
    lineItems = new ArrayList<>();
 }
 public Order (int orderID,LocaDate orderDate){
    this.orderID =orderID;
    this.orderDate =orderDate;
    lineItems =new ArrayList<>();
 }
public int getOrderID (){
    return orderID;
}
public voide setOrderID (int orderID){
    this.orderID = orderID;
}
public LocalDate getOrderDate () {
    return orderDate;
}
public voide setOrderDate (LocaDate orderDate){
    this.orderDate = orderDate ;
}
public void setOrderDate (LocaDate orderDate) {
    this.orderDate = orderDate;
}
public List<OrderDetail> getlineItems(){
    return lineItems;
}
public void addLineItems (Product Product,int quantity){
    lineItems.add (new OrderDetail(quantity,product));
}
public double calcTotaCharge(int n) {
    double calcTotaCharge=0;
    int count = 0;
    for (int i =n; count <lineItems.size();i++){
        OrderDetail OrderDetail =lineItems.get(count);
        totalCharge + = orderDetail.calcTotalPrice ();
        count++;
    }
    return totalCharge;
}

@Override
public String toString(){
    return"Order [ orderId="+orderId+",orderDate="+orderDate+",lineItems="+lineItems+"]";
}