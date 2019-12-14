public class ElectricBill{
static int finalBill;
public static void main(String[] args){
int billTotal=900;
if (billTotal >1000){
finalBill=billTotal+200;
}
else if (billTotal < 100) {// false
finalBill = billTotal + 10;
}

else if (billTotal >= 100 && billTotal <= 1000) {
finalBill = billTotal + 100;
}

System.out.println("final bill is: " + finalBill);

}

}