
public class thread {
	
	public void run() {
		int time = 0;
		System.out.println("The class has ");
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
		finally {
			
		}
	}
}
