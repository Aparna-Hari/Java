package exhandle;

import java.util.Scanner;

class Alpha1
{
	public void alpha1() throws ArithmeticException
	{
		try 
		{
			System.out.println("Welcome to my app");
		
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the Numerator");
            int num1 = scan.nextInt();

            System.out.println("Please enter the Denominator");
            int num2 = scan.nextInt();
            
            

            int res = num1/num2;
            System.out.println("Result is " + res);
            
            scan.close();
            System.out.println("Thank you for using oiur app!");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception is caught in Alpha method itself");
			
			throw e; //re-throwing the handled exception object to the caller method
			
		}
		//System.out.println("Thank you for using the app");
		finally 
		{
			System.out.println("Thank you for using the app");
				
		}
		
		
	}
	
}

public class ExceptionHandling4 
{
	public static void main(String[] args) 
	{
		try {
			System.out.println("Connection established in Main method");
			Alpha1 a2= new Alpha1();
			a2.alpha1();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception is caught in main method");
			}
			System.out.println("Main connection terminated");
		
	}

}


//***Re-throwing the handled exception object using 'throw' keyword in the catch block
// Statements after throw keyword are not executed, it acts similar to return statement -line 35 is skipped


//if 'finally' block is used after throw keyword, it gets executed irrespective of the exception