

public class BarProducer extends Thread {
	Factory wonka;
	public int count = 0;
	public int id;
	
	public BarProducer(int identifier) {
		id=identifier;
		System.out.println("Creating new Bar Producer with ID: "+id);
	}
	  
	public void run() {     	
		while (count<50) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				
			}
			count++;
			WonkaBarFactory.getInstance().create(id);
		}
    }
}
