public class Marriage{
public static void main(String [] args){
int age =75;
String brideName = "Shaann";
String assumption = null;
if(age>= 45){
assumption ="Its difficult to get a girl in this age";
}
else if(age> 33 && age<= 44){
assumption ="Be serious you are getting old";
}
else if(age>= 22 && age<= 33){
assumption ="You are in a perfect age";
}
else if(age< 22){
assumption ="You are still a kid do hard work to get marrige";
}
System.out.println(brideName + " " +age + " " +assumption);
}
}
