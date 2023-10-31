package thread;


class CarShare implements Runnable
{

	@Override
	public void run() 
	//we can use synchronized keyword at method to control/lock the resource
	//synchronized public void run()
	{
		
		
		try 
		{
			System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
			Thread.sleep(5000);
			
			
			
			synchronized(this)
			{
			System.out.println(Thread.currentThread().getName() + " has got into the car");
				
			Thread.sleep(5000);
			
			System.out.println(Thread.currentThread().getName() + " has started driving the car");
			
			Thread.sleep(5000);
			
			System.out.println(Thread.currentThread().getName() + " came back from drive and parked in  the parking lot");
			
			Thread.sleep(5000);
			
			System.out.println(Thread.currentThread().getName() + " came out of the parking lot");
			
			Thread.sleep(5000);
			}
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
	}
	
}
public class Thread6 {

	public static void main(String[] args) 
	{
		CarShare cShare = new CarShare();
		
		Thread t1= new Thread(cShare);
		Thread t2= new Thread(cShare);
		Thread t3= new Thread(cShare);
		
		t1.setName("Child-1");
		t2.setName("Child-2");
		t3.setName("Child-3");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}



//output
//
//Child-1has entered the parking lot
//Child-3has entered the parking lot
//Child-2has entered the parking lot
//Child-3has got into the car
//Child-1has got into the car
//Child-2has got into the car
//Child-1has started driving the car
//Child-3has started driving the car
//Child-2has started driving the car
//Child-1came back from drive and parked in  the parking lot
//Child-3came back from drive and parked in  the parking lot
//Child-2came back from drive and parked in  the parking lot
//Child-1came out of the parking lot
//Child-2came out of the parking lot
//Child-3came out of the parking lot

//So, whenever multiple threads have to use a common resource, we can use synchronized keyword to lock the resource

//Multiple threads racing for single resource without considering CPU time cycles is called race condition..

//Synchronized keyword can be applied  to either method or to a specific block

//At synchronized environment, only one thread can be executed
