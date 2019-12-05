package caseyfinal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class execute extends Thread{
	public static int x = 1;
public static void execute() throws InterruptedException {
	ExecutorService executorService = Executors.newFixedThreadPool(5);
	for(int i=0; i<=10; i++) {
		executorService.execute(new Runnable() {
			public void run() {

				
				try {
					System.out.println("Some stuff " + x);
					Thread.currentThread().sleep(500);
					x++;
					
					//WE ARE GOING FOR SUPER THREADING!
					
					//Notice that we are creating a new thread here
					thread thread = new thread();
					thread.start();
					//Notice that we are referencing a different way to use the same thread. In theory, we could use as many threads as we want, this also creates new threads
					threads.thread();
					threads.thread();
					threads.thread();
					threads.thread();
					threads.thread();
					threads.thread();
					threads.thread();
					threads.thread();
					threads.thread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
					

				}
			
	});
	}
}

}
