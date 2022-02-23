package ExceptionHandling;

public class Test2_Exception 
{
	public static void main(String[] args)
	{
		int a=2,b=0;
		try {
			try 
		    {
				System.out.println(a/b);
			} 
		    catch (ArithmeticException e)
		    {
				
				System.out.println("Division by Zero");
			}
			throw new UnsupportedOperationException();
		}
		 catch(UnsupportedOperationException e)
		{
			 System.out.println("You Can't Divide by Zero");
			
		}
	}
}
