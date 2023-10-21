package exhandle;


import java.util.Scanner;

public class ExceptionHandling1 {
    
        public static void main(String[] args) 
        {
            System.out.println("Welcome to my application");
            try 
            {
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Please enter the Numerator");
	            int num1 = scan.nextInt();
	
	            System.out.println("Please enter the Denominator");
	            int num2 = scan.nextInt();
	            
	            
	
	            int res = num1/num2;
	            System.out.println("Result is " + res);
	            
	            System.out.println("kindly enter the size of array");
	            int size = scan.nextInt();
	            
	            int ar[] = new int[size];
	            
	            System.out.println("kindly enter the elements of array");
	            
	            int elem = scan.nextInt();
	            
	            System.out.println("Kindly enter the position at which element has to be inserted");
	            
	            int pos = scan.nextInt();
	            ar[pos] = elem;
	            System.out.println("inserted at position " +pos);
	         
	            System.out.println("Data inserted successfully");
	            scan.close();

            }
            catch(ArithmeticException e)//catch block is the handler of exception
            {
            	System.out.println("Please give non zero denominator");
            } 
            
            catch(ArrayIndexOutOfBoundsException e)// handler of exception for array here
            {
            	System.out.println("Please enter within the array size");
            }
            catch(NegativeArraySizeException e)
            {
            	System.out.println("Please enter positive size for array");
            }
            catch(Exception e) //Generic exception should be placed after all the specific exceptions
            {
            	System.out.println("Invalid input");
            }
            
            
            System.out.println("Thank you for using my app");

        }
}


//Java exception handling is a mechanism to handle runtime errors,otherwise application crashes abruptly
//try and catch is called user defined Exception handler
//suspicious code which could be responsible for an exception at runtime should be enclosed in try block
//catch block is the actual exception handler
//Based on type of exception , we should give same name or parent type
//statements after the exception are skipped until the catch block that handles the exception
//Statements after catch block can be executed normally
//If user defined exception is handler is in the code, jvm hands over the exception  object to catch block
//If not , it is handed over to default exception handler which leads to abnormal program termination
//In whichever method exception occurs,in that stack frame exception object is created
//one try block can have multiple catch blocks handling the exceptions
//Only error specific catch block will be executed


