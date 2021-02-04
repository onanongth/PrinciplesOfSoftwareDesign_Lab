import java.util.ArrayList;

public abstract class Slot {

	String name;
	String software;
	ArrayList components = new ArrayList();
	
	void collectParts() {
		System.out.print("fetching components:");
		for (int i=0; i< components.size(); i++) {
			System.out.print("  " + components.get(i));
			if (i==0) {
				System.out.print(" Cabinet,");
			}
			if (i==1) {
				System.out.print(" Payment,");
			}
			if (i==2) {
				System.out.print(" Dispaly,");
			}
			if (i==3) {
				System.out.print(" GPU,");
			}
		}
		System.out.println();
	}
	
	void assembleParts() {
		System.out.println("assembling components");
	}
	
	void test(String type) {
		if (type.equals("hardware")) { 
			System.out.println("testing hardware");
		}
		else {
			System.out.println("testing software");
		}
	}
	
	void uploadSoftware() {
		System.out.println("uploading software:" + software);
	}
	
	void ship() {
		System.out.println("wrapping the slot machine in Ceran Wrap and shipping it with UPS");
	}
	
	public String getName() {
		return name;
	}
	
}
