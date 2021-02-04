import com.sun.jdi.ShortType;

public abstract class Store {
	
	public Slot orderSlot(SlotType type) {
		Slot slot;
		slot = makeSlot(type);
		slot.collectParts();
		slot.assembleParts();
		slot.test("hardware");
		slot.uploadSoftware();
		slot.ship();
		return slot;
	}
	
	protected abstract Slot makeSlot(SlotType type); 

}
