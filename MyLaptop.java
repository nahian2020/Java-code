pulic class MyLaptop{
String brand;
String model;
static int price;
static int warranty

public static void main(String [] args){
MyLaptop laptop = new MyLaptop();
laptop.brand= "HP";
laptop.model = ""G17";
price = 350;
warranty=3;
laptop.checkWarranty(warranty);
laptop.checkPrice(price);
laptop.holdCharge();



}
public void checkWarranty(int warranty){
if(warranty=<2){
System.out.println(" please extend your warranty");
}
else if (warranty>2){
System.out.println(" You dont need to extend warranty ");
}
}
public void checkPrice(int price){
if(price=<200){
System.out.println(" price is ok");
}
else if (warranty>200){
System.out.println("Price is high");
}
}
public void holdCharge(){
	System.out.println("This laptop has good battery life");
}
}
}