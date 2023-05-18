package class OrderDetail {
    private int quantily;
    private Product product;
}
public OrderDetail(int quantily,Product product){
    super();
    this.quantily = quantily;
    this.product = product;
}
public int getQuntily (){
    return quantily ;
}
public void setQuantily (int quantily){
    this.quantily=quantily;
}
public Product getProduct(){
    return product;
}
public voide setProduct(){
    this.product=product;
}
@Override
public String toString(){
    return "OrderDateil [ quantily="+quantily+",product="+product+"]";
}
public double calcTotalPrice(){
    return quantily*product.getPrice();
}
