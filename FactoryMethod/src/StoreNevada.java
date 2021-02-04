
public class StoreNevada extends Store {

	@Override
	protected Slot makeSlot(SlotType type) {
		Slot temp = null;
		
		if (type.equals(SlotType.progressive)) {
		temp = new ProgressiveNevada();
		}
		else if (type.equals(SlotType.straight)) { 
			temp = new StraightNevada();
		}
		else if (type.equals(SlotType.bonus)) { 
			temp = new BonusNevada();
		}
		
		return temp;
	}

}
