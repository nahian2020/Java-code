public class PcoExam{
public  static void main(String [] args){
int score =85;
String senario = null ;
 if(score= 100){
senario ="You will get the job";
}
else if(score>= 90 && score<= 95){
senario ="You will get canvas  letter no job Guarranty";
}
else if(score>= 70 && score<= 90){
senario ="Not this time try search other job";
}
else if(score< 70){
senario ="Man!! how could any one get failed in this exam ";
}
System.out.println(score + " " +senario);
}
}
