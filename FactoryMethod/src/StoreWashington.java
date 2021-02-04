
public class StoreWashington extends Store {

	@Override
	protected Slot makeSlot(SlotType type) {
		
		Slot temp = null;
		
		if (type.equals(SlotType.progressive)) {
		temp = new ProgressiveWashington();
		}
		else if (type.equals(SlotType.straight)) { 
			temp = new StraightWashington();
		}
		else if (type.equals(SlotType.bonus)) { 
			temp = new BonusWashington();
		}
		
		return temp;
	}

}
