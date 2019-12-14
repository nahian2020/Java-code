public class SamsungModel{
String model;
int price;
String color;
public static void main (String [] args){
SamsungModel samsongx = new SamsungModel();
samsongx. price= 600 ;
samsongx.model = "Samsung J3";
samsongx.color = "Black";
System.out.println(price);
samsongx.doCall();

}
public void doCall(){
System.out.println("Please call using contacts");

}
}