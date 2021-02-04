public class NJSlotProgressive extends Slot {
	public NJSlotProgressive() {
		name = "Progressive";
		software = "Android";
		components.add("Small");
		components.add("coins");
		components.add("CRT");
		components.add("X77");
	}
	
	void ship() {
		System.out.println("Having uncle vinnie drop it off");
	}
}