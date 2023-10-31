package thread;

import java.util.Scanner;

class Calc extends Thread
{
	public void run()
	{
		System.out.println("Calculation task started...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly enter the first number");
		int num1 = scan.nextInt();
		System.out.println("Kindly enter the second number");
		int num2 = scan.nextInt();
		
		int res = num1+num2;
		System.out.println("Result is " + res);
		
		System.out.println("Calculation task is completed");
		
	}
	
}

class Message extends Thread
{
	public void run()
	{
		System.out.println("Displaying important message started");
		
		for(int i=0; i< 4;i++)
		{
			System.out.println("Focus is important to master any skill");
		}
		System.out.println("Displaying important message ended");
	}
}

public class Thread4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Calc calc = new Calc();
		
		Message message = new Message();
		
		System.out.println(calc.isAlive());
		System.out.println(message.isAlive());
		
		calc.start();
		message.start();
		
//		Thread t1 = new Thread(calc);
//		Thread t2 = new Thread(message);
//		
//		t1.start();
//		t2.start();
		
		System.out.println(calc.isAlive());
		System.out.println(message.isAlive());
		
		calc.join();
		message.join();
		
		System.out.println("Main thread task is done");
		
	}

}


//Thread scheduler manages the threads in java

//Thread scheduler utilizes CPU time cycles efficiently

//Thread scheduler decides which thread need to be executed when start( )is invoked

//If we invoke run() manually, it behaves as single threaded program