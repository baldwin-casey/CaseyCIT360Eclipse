package caseyfinal;


public class thread extends Thread{
	
	public void run() {
		for(int i = 0; i < 4; i++) {
			System.out.println("Thread Number: " + Thread.currentThread().getId()+ " Thread value: " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	
}

}
