public class Main {
	public static void main(String[] args) {
		SlotStore NVStore = new NVSlotStore();
		SlotStore NJStore = new NJSlotStore();
		Slot slot = NVStore.orderSlot(Slottype.progressive);
		System.out.println("Taj Mahal ordered a " + slot.getName());
		slot = NJStore.orderSlot(Slottype.progressive);
		System.out.println("Borgata ordered a " + slot.getName());
	}

}
