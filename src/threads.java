
public abstract class threads implements Runnable{
	
public static class thread {
		
		public void run() {
			int time = 0;
			System.out.println("The class has " + time);
			try {
				while (time < 10) {
					System.out.println(time + "seconds.");
					Thread.sleep(1000);
					time++;
				}
				System.out.println("All done");
		}
			catch(Exception e) {
				
			}
		}
	}
	
public static void multithreads() throws InterruptedException {
System.out.println("Threads!");
new thread();
Thread.sleep(1000);
new thread();
System.exit(0);
}
}
