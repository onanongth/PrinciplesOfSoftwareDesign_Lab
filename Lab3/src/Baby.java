import java.util.ArrayList;

public class Baby implements Subject {
	
	private ArrayList observers;
	private boolean crying;
	private int level;
	private String babyname;

	public Baby(String name) {
		this.babyname = name;
		observers = new ArrayList();
	}
	
	
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >=0) {
			observers.remove(i);
		}

	}
	
	public void notifyObserver() {
		for(int i=0 ; i<observers.size() ; i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(babyname,crying,level);
		}
		
	}
	
	public void setData(boolean crying, int level) {
		this.crying = crying;
		this.level = level;
		notifyObserver();
	}
	

}
