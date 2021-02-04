
public class main {

	public static void main(String[] args) {
		
		Store StoreNevada = new StoreNevada();
		
		Slot slot = StoreNevada.orderSlot(SlotType.progressive);
		System.out.println("\nOrdered a "+ slot.getName());
		
		
		Store StoreNewJersey = new StoreNewJersey();
		
		slot = StoreNewJersey.orderSlot(SlotType.straight);
		System.out.println("\nOrdered a "+ slot.getName());
		
		
		Store StoreWashington = new StoreWashington();
		
		slot = StoreWashington.orderSlot(SlotType.bonus);
		System.out.println("\nOrdered a "+ slot.getName());
		
		slot = StoreWashington.orderSlot(SlotType.progressive);
		System.out.println("\nOrdered a "+ slot.getName());

	}

}
