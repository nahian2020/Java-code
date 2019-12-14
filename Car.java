public class Car {
	
String name;
int price;
String color;
static int wheels = 4;
	
public static void main(String[] args) {

Car c1 = new Car();
c1.name = "Audi Q5";
c1.price = 40000;
c1.color = "Black";
c1.wheels = 5;
		
System.out.println(c1.name);
System.out.println(wheels);