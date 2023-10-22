package exhandle;

import java.util.Scanner;

class Alpha
{
	public void alpha() throws ArithmeticException
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
	
}

public class ExceptionHandling3 {

	public static void main(String[] args) 
	//{
		//Alpha a1= new Alpha();
		//a1.alpha();
		//Input:  10 and 0
		//Output: 
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at ExceptionHandling/exhandle.Alpha.alpha(ExceptionHandling3.java:20)
		//at ExceptionHandling/exhandle.ExceptionHandling3.main(ExceptionHandling3.java:34)

	//}
	{
		try {
		System.out.println("Connection established in Main method");
		Alpha a1= new Alpha();
		a1.alpha();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is caught in main method");
		}
		System.out.println("Main connection terminated");
	}

}


//Whenever there is an exception in one stack frame/method  and exception is not handled in that block
//Then whoever has called that method, exception object goes to them

//***Ducking the exception using 'throws' keyword:
  //Whenever we are not handling the exception in the method body itself, 
  //then we have to mention it in methods' signature so programmer is aware that it could lead to exception
 
//***Re-throwing the exception using 'throw' keyword in the catch block
  // Statements after throw keyword are not executed, it acts similar to return statement









