public class JobStatus{
public static void main(String [] args){
String status ="Permanent";
if (status.equals("Permanent")) {
System.out.println("The status  is secure: " + status);
}
else if (status.equals("Temporary")) {
System.out.println("The status  is not secure : " + status);
}
else if (status.equals("Perdiem")) {
System.out.println("Man!! get some IT training  : " + status);
}
else {
System.out.println("status " + status + " is not found");
}
}
}