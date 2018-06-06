package zxa;

class subThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread thread running");
	}
 // This method is called when the thread runs
}

public class ThreadTest
{
	public static void main(String []argv)
	{	// Create and start the thread
		Thread thread = new Thread(new subThread());
		thread.setName("zhang");
		thread.start();
	}
}
