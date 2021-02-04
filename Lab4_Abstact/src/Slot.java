
import java.util.ArrayList;

public abstract class Slot {
	float cost;
	String name;
	String software;
	ArrayList components = new ArrayList();
	
	void collectParts() {
		System.out.print("Fetching components: ");
		for (int i=0; i< components.size(); i++) {
			System.out.print("  " + components.get(i));
			if (i==0) System.out.print(" Cabinet,");
			if (i==1) System.out.print(" Validator,");
			if (i==2) System.out.print(" Display,");
			if (i==3) System.out.print(" CPU");
		}
		System.out.println();
	}
	
	void assembleParts() {
		System.out.println("Assembling components");
	}
	
	void test(String type) {
		if (type.equals("Hardware")) {
			System.out.println("Testing Hardware");
		} else {
			System.out.println("Testing Software");
		}
	}
	
	void uploadSoftware() {
		System.out.println("Uploading Software: " + software);
	}
	
	void ship() {
		System.out.println("Wrapping the slot machine in Ceran Wrap and shipping it with UPS");
	}
	
	public String getName() {
		return name;
	}
	
	public float cost() {
		return cost; 
	}
}
		

