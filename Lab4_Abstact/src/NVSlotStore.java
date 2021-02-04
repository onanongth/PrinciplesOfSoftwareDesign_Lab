
public class NVSlotStore extends SlotStore {
	protected Slot makeSlot(Slottype type) {
		if (type.equals(Slottype.progressive)) {
			return new NVSlotProgressive();
		} else {
			return null;
		}
	
	}
}