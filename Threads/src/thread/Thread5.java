package thread;

import java.util.Scanner;

class Alien implements Runnable
{

	public void calc()
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
	@Override
	public void run() 
	{
		String tName = Thread.currentThread().getName();
		
		if(tName.equals("CALC"))
		{
			calc();
		}
		else message();
		
	}
	public void message() 
	{
		System.out.println("Displaying important message started");
		
		for(int i=0; i< 4;i++)
		{
			System.out.println("Focus is important to master any skill");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Displaying important message ended");
	}
}
	


public class Thread5 {

	public static void main(String[] args) 
	{
		Alien a1 = new Alien();
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		
		t1.setName("CALC");
		t2.setName("Message");
		
		t1.start();
		t2.start();
		

	}

}

//Multiple threads can execute single/common resource.
