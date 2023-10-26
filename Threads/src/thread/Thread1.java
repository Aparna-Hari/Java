package thread;

public class Thread1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main  thread started");
		
		//Thread.sleep(5000);
		
		Thread thread  = Thread.currentThread();
		String threadName = thread.getName();
		
		System.out.println(threadName + thread.getPriority());
		
		System.out.println("Main  thread execution completed");
		
		thread.setName("Telusko");
		thread.setPriority(4);
		
		System.out.println(thread.getName() + thread.getPriority());
		
	} 

}

//An independent line of action in a program is called Thread.

//In order to execute a program, thread is given by Jvm as soon as we create a program

//'main' thread is the thread created by jvm to execute the program in runtime stack area.
  //In order to execute any program, it needs to be brought to stack area for execution.

//Thread class is the inbuilt class used to use threads

//we can define name and set priority etc to the thread created by us using setName,setPriority properties 
