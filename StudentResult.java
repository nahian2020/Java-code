public class StudentResult {

public static void main(String[] args) {

String student[] = new String[3];
student[0] = "Lisa";
student[1] = "Nahian";
student[2] = "Kamal";

for (int count = 0; count < student.length; count++) {
System.out.println(student[count]);
if (student[count].equals("Nahian")) {
System.out.println("total marks : 80");
}
}