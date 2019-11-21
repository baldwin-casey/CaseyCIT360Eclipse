import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class execute {
	public static int x = 1;
public static void execute() {
	ExecutorService executorService = Executors.newFixedThreadPool(3);
	for(int i=0; i<=10; i++) {
		executorService.execute(new Runnable() {
			public void run() {

				System.out.println("Some stuff " + x);
				try {
					Thread.sleep(1000);
					
					//I am not sure why this  is not giving perfect increment numbers (1, 2, 3 etc)
					x++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	});
	}
}

}
