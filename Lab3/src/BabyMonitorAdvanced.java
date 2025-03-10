
public class BabyMonitorAdvanced implements Observer {

	private Subject mdata, cdata;
	private String babyname;
	private String name;
	private boolean crying;
	private int level;
	
	public BabyMonitorAdvanced(String name, Baby m, Baby c) {
		this.name = name;
		this.mdata = m;
		this.cdata = c;
		mdata.registerObserver(this);
		cdata.registerObserver(this);
		crying = false;
	}
		
	public void update(String babyname, boolean crying, int level) {
		this.crying = crying;
		this.babyname = babyname;
		this.level = level;
		display();


	}
	
	public void display() {
		System.out.println("Baby name : " + babyname);
		System.out.println("Baby crying, at " + name + " level " + level);
	}


}
