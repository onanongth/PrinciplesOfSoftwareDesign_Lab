
public class Main {

	public static void main(String[] args) {
		Baby baby = new Baby("Job");
		Baby baby2 = new Baby("Jack");
		
		//Observer observer = new BabyMonitorSimple("Bedroom", baby);
		BabyMonitorSimple livingRoom = new BabyMonitorSimple("Bedroom ", baby);
		//baby.setData(true, 1);
		
		//baby.registerObserver(new BabyMonitorSimple("Bedroom", baby));
		//baby.registerObserver(new BabyMonitorAdvanced("Livingroom", baby, baby));

		
		BabyMonitorAdvanced kitchen = new BabyMonitorAdvanced("Living room ", baby, baby2);
		baby.setData(true, 2);
		baby2.setData(true,1);
	}

}
