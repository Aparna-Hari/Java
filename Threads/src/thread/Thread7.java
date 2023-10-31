package thread;

class Library implements Runnable
{
	String res1 =new String("Java");
	String res2 =new String("DSA");
	String res3 =new String("SpringBoot");
	
	
	@Override
	public void run() 
	{
		String tName  = Thread.currentThread().getName();
		
		if("Student-1".equals(tName))
			{
				try 
				{
					Thread.sleep(5000);
					synchronized(res1)
					{
						System.out.println("Student1 has acquired res1: " + res1);
						Thread.sleep(4000);
						synchronized (res2) 
						{
							System.out.println("Student1 has acquired res2: " + res2);
							Thread.sleep(4000);
							synchronized(res3)
							{
								System.out.println("Student 1 has acquired res3: " + res3);
								Thread.sleep(4000);
								
							}
						}
					
					}
				} 
				catch (Exception e) 
				{
	
					System.out.println("Problem occured for Student1");
				}
				System.out.println("Resource acquiring completed");

			}
		else 
			{
			
				try 
				{
					Thread.sleep(5000);
					synchronized(res3)
					{
						System.out.println("Student2 has acquired res3: " + res3);
						Thread.sleep(4000);
						synchronized (res2) 
						{
							System.out.println("Student2 has acquired res2: " + res2);
							Thread.sleep(4000);
							synchronized(res1)
							{
								System.out.println("Student2 has acquired res1: " + res1);
								Thread.sleep(4000);
								
							}
						}
						
					}
				} 
				catch (Exception e) 
				{
	
					System.out.println("Problem occured for Student2");
				}
				System.out.println("Resource acquiring completed");
			}
			
		
	}
	
}	



public class Thread7 {

	public static void main(String[] args) 
	{
		Library library = new Library();
		
		Thread t1 = new Thread(library);
		Thread t2 = new Thread(library);
		
		t1.setName("Student-1");
		t2.setName("Student-2");
		
		t1.start();
		t2.start();

	}

}

//synchronized is used to lock the resource to make it thread safe, i.e one thread executes at a time instead of concurrent threads
//Deadlock : when one thread is waiting for a resource that is locked thru synchronized by another thread , that situation is called deadlock
                           //(or)
//Deadlock in Java is a part of multithreading. 
  //Deadlock can occur in a situation when a thread is waiting for an object lock, 
  //that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread. 
  //Since, both threads are waiting for each other to release the lock, the condition is called deadlock.

//But we can avoid them by following basic rules as follows:

   //Avoid Nested Locks: We must avoid giving locks to multiple threads, this is the main reason for a deadlock condition. It normally happens when you give locks to multiple threads.
   //Avoid Unnecessary Locks: The locks should be given to the important threads. Giving locks to the unnecessary threads that cause the deadlock condition.
   //Using Thread Join: A deadlock usually happens when one thread is waiting for the other to finish. In this case, we can use join with a maximum time that a thread will take.