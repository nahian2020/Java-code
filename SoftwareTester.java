public class SoftwareTester{
String name;
int salary;
int experience ;
String environment;
String compName ;


public SoftwareTester(){
System.out.println("default const...");
}
public SoftwareTester(String name,int salary, int experience,String environment , String compName ){

this.name = name;
this.salary=salary;
this.experience=experience;
this.environment=environment;
this.compName=compName;
}
public static void main(String[] args) {
SoftwareTester tester1 = new SoftwareTester("Nahian", 80000,3,"QA","Jp Morgan");
SoftwareTester tester2 = new SoftwareTester("Alex", 110000,8,"UAT","HP");
SoftwareTester tester3 = new SoftwareTester("Susant", 80000,4,"QA","Geico");
SoftwareTester tester4 = new SoftwareTester("Jack ", 90000,6,"Prod","Motorola");

System.out.println(tester1.name + " " + tester1.salary + " "+tester1.experience + " " + tester1.environment + " " + tester1.compName);
System.out.println(tester2.name + " " + tester2.salary + " "+tester2.experience + " " + tester2.environment + " " + tester2.compName);
System.out.println(tester3.name + " " + tester3.salary + " "+tester3.experience + " " + tester3.environment + " " + tester3.compName);
System.out.println(tester4.name + " " + tester4.salary + " "+tester4.experience + " " + tester4.environment + " " + tester4.compName);

tester1.createTestcase();
tester2.attendScrum();
tester3.maintainFramework();
tester4.doWhiteBox();
}
public void createTestcase(){
System.out.println(" Change testcase by requirement");	
}
public void doWhiteBox(){
System.out.println(" WhiteBOX testing for selenium code");	
}
public void maintainFramework(){
System.out.println("use java for framework");	
}
public void attendScrum(){
System.out.println(" attend Scrum Meeting");	
}
}



