public class ObesityRisk{
public static void main(String [] args){
int weight =75;
String patientName = "Mike";
String condition = null;
if(weight>= 80){
condition ="At risk";
}
else if(weight>= 70 && weight<= 79){
condition ="Be careful";
}
else if(weight< 70){
condition ="You are in a good health";
}
System.out.println(patientName + " " +weight + " " +condition);
}
}
