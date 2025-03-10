
public class BabyMonitorSimple implements Observer {

	private Subject mdata;
	private String loc;
	private boolean crying;
	
	public BabyMonitorSimple(String location, Baby name) {
		this.loc = location;
		this.mdata = name;
		mdata.registerObserver(this);

	}
	
	
	public void turnoff() {
		mdata.removeObserver(this);
	}

	public void display() {
		if (crying) {
			System.out.println("Baby is crying at " + loc);
		}
	}

	public void update(String name, boolean crying, int level) {
		this.crying = crying;
		display();
		
	}

}
