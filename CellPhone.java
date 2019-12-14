public class CellPhone{
String name;
int price;
int serialNo ;
String os ;
String compName ;

public CellPhone(){
System.out.println("default const...");
}
public CellPhone(String name,int price, int serialNo,String os , String compName ){

this.name = name;
this.price=price;
this.serialNo=serialNo;
this.os=os;
this.compName=compName;
}
public static void main(String[] args) {
CellPhone m1 = new CellPhone("Samsung J7", 200,1201,"Android","Samsung");
CellPhone m2 = new CellPhone("Nokia 2100", 20,1202,"Windows","Nokia");
CellPhone m3 = new CellPhone("IPhone X", 800,1207,"iOS","IPhone");
CellPhone m4 = new CellPhone("Motorola g6", 350,1211,"Android","Motorola");

System.out.println(m1.name + " " + m1.price + " "+m1.serialNo + " " + m1.os + " " + m1.compName);
System.out.println(m2.name + " " + m2.price + " "+m2.serialNo + " " + m2.os + " " + m2.compName);
System.out.println(m3.name + " " + m3.price + " "+m3.serialNo + " " + m3.os + " " + m3.compName);
System.out.println(m4.name + " " + m4.price + " "+m4.serialNo + " " + m4.os + " " + m4.compName);

m1.doCall();
m2.sendMessage();
m3.createTiktok();
}
public void doCall(){
System.out.println(" Call from contact list");	
}
public void takePicture(){
System.out.println(" I love to take selfie");	
}
public void createTiktok(){
System.out.println("Tiktok is fun");	
}
public void sendMessage(){
System.out.println(" Type message");	
}
}



