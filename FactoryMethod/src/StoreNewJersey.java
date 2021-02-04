
public class StoreNewJersey extends Store {

	@Override
	protected Slot makeSlot(SlotType type) {

		Slot temp = null;
		
		if (type.equals(SlotType.progressive)) {
		temp = new ProgressiveNewJersey();
		}
		else if (type.equals(SlotType.straight)) { 
			temp = new StraightNewJersey();
		}
		else if (type.equals(SlotType.bonus)) { 
			temp = new BonusNewJersey();
		}
		
		return temp;
	}

}
