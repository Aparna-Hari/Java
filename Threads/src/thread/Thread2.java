package thread;

import java.util.Scanner;

//class Alpha
class Alpha implements Runnable
{
	//public void banking()
	public void run()
	{
		System.out.println("Banking Activity started...");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the account number");
		int accNo=scan.nextInt();
		System.out.println("please enter the password");
		int password=scan.nextInt();
		
		System.out.println("Login success!");
		System.out.println("Banking Activity ended...");
		
		scan.close();
		
		System.out.println("********************");
	}
}

//class Beta 
class Beta implements Runnable
{
	//public void printingNumber()
	public void run()
	{
		System.out.println("printing number Activity started...");
		for(int i=0;i<5;i++)
		{
			System.out.println("The new generated number is : "+ i);
		}
		System.out.println("printing number Activity ended...");
		
		
		System.out.println("********************");
	}
}

//class Gamma
class Gamma implements Runnable

{
	//public void printingMessage() 
	public void run()
	{
		System.out.println("displaying important message Activity started...");
		for(int i=0;i<4;i++)
		{
			System.out.println("Focus is the key");
			
		}
		System.out.println("displaying important message activity ended...");
		
	}
	
	
}
public class Thread2 
{
	public static void main(String[] args) 
	{
		Alpha alpha = new Alpha();
		Beta beta = new Beta();
		Gamma gamma = new Gamma();
		
		//alpha.banking();
		//beta.printingNumber();
		//gamma.printingMessage();
		
		Thread thread1 = new Thread(alpha);
		Thread thread2 = new Thread(beta);
		Thread thread3 = new Thread(gamma);
		
		//Thread starts running only when we use start()
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
//Multi threading can be achieved by following two ways: 

//1.Runnable interface : By implementing runnable interface, multi threading can be achieved..
//2.Thread class : By extending Thread class , multi threading can be achieved..

//since java doesn't support multiple inheritance but supports multiple interface,its ideal to use Runnable interface to achieve multithreading

//Thread scheduler : Decides which thread should be executed
//start method is used to hand over the thread to thread scheduler