
public class NJSlotStore extends SlotStore {

	protected Slot makeSlot(Slottype type) {
		Slot tmp = null;
		if (type.equals(Slottype.progressive)) { 
			tmp = new NJSlotProgressive();
			tmp.cost=(float) (tmp.cost*1.1);
		}
		return tmp;
	}
}
