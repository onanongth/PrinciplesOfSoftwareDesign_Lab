
public abstract class SlotStore {
	public Slot orderSlot(Slottype type) {
		Slot slot;
		slot = makeSlot(type);
		slot.collectParts();
		slot.assembleParts();
		slot.test("hardware");
		slot.uploadSoftware();
		slot.ship();
		return slot;
	}
	
	protected abstract Slot makeSlot(Slottype type); 
}