
public class ProgressiveNewJersey extends Slot {
	
	public ProgressiveNewJersey() {
		name = "Progressive";
		software = "Windows XP";
		
		components.add("Small");
		components.add("bills");
		components.add("CRT");
		components.add("X86");
	}
	
	void ship() {
		System.out.println("having uncle vinnie drop it off");
	}

}
