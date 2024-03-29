package ExceptionHandling;

import java.util.*;
class SavingsAccount {
	static long id;
	static double balance;
	public SavingsAccount(long id, double balance) {
		SavingsAccount.id = id;
		SavingsAccount.balance = balance;
	}
	public static double withDraw(double Amount) {
		return balance-Amount;
	}
	@SuppressWarnings("unused")
	private static double deposit(double Amount) {
		return balance+Amount;
	}
	
}
@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
@SuppressWarnings("serial")
class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException(String msg) {
		super(msg);
	}
}
public class Test3_Exception {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		SavingsAccount acc =new SavingsAccount(998877, 2000);
		try(Scanner sc=new Scanner(System.in)) {
			System.out.print("Enter withDraw Amount :");
			double withDrawAmount = sc.nextDouble();
			if(withDrawAmount>SavingsAccount.balance) {
				throw new InsufficientBalanceException("Insufficent Balance");
			}
			else if(withDrawAmount<-1) {
				throw new IllegalBankTransactionException("Illegal Bank Transaction");
			}
			else
			{
				System.out.println("Remaining Balance: "+SavingsAccount.withDraw(withDrawAmount));
			}
				
		} catch (InsufficientBalanceException e) {
			System.out.println(e);
		}
		catch (IllegalBankTransactionException e) {
			System.out.println(e);
		}

	}

}