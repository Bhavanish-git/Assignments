import java.util.Scanner;

class Sici {
	public static double simpleInterest(double principalAmount,int time,double interestRate){
		double SimpleIntrest = (principalAmount*interestRate*time)/100;
		return SimpleIntrest;
	}
    public static double compoundInterest(double principalAmount,int time,double interestRate){
    	double CompundInterest = (principalAmount* Math.pow(1+(interestRate),(time))-principalAmount);
    	return CompundInterest;
    }
}
public class Assignment1Q3 {
	public static void main (String args[]) 
	{
    	Scanner scanner=new Scanner(System.in);
    	double principalAmount = scanner.nextDouble();
    	int time=scanner.nextInt();
    	double interestRate=scanner.nextDouble();
    	scanner.close();
    	System.out.println(Sici.simpleInterest(principalAmount,time,interestRate));
    	System.out.println(Sici.compoundInterest(principalAmount,time,interestRate));
    }

}
