package exhandle;

import java.util.Scanner;

public class ExceptionHandling2 
{
	public static void main(String[] args) 
	{
		try 
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the Numerator");
            int num1 = scan.nextInt();

            System.out.println("Please enter the Denominator");
            int num2 = scan.nextInt();
            
            

            int res = num1/num2;
            System.out.println("Result is " + res);
            
            scan.close();
        }
		catch(ArithmeticException e)
		{
			System.out.println("getMessage()" +e.getMessage());//Exception contains this info
			
			System.out.println("toString()" +e.toString());
			
			System.out.println("Please give non zero denominator");
		}
		System.out.println("Thanks you using this app");
	}



}
