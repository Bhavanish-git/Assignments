import java.util.Scanner;

class TaxAmount{
    public static double calculateTaxAmount(int ctc){
        double tax = 0;
        if(ctc<=180000)
        {
            tax = 0;
        }
        else if(ctc>=181001 && ctc<=300000){
            tax = (ctc*10)/100;
        }
        else if(ctc>=300001 && ctc<=500000){
            tax = (ctc*20)/100;
        }
        else if(ctc>=500001&& ctc<=1000000){
            tax = (ctc*30)/100;
        }
		return tax;
        
    }
}
public class Assignment1Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the ctc:");
        int ctc = scan.nextInt();
        System.out.print("Taxable Amount:"+TaxAmount.calculateTaxAmount(ctc));

	}

}
