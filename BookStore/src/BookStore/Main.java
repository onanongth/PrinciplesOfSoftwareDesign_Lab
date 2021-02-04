package BookStore;

public class Main {

	public static void main(String[] args) {
		Integer price;
	    //Integer testPrice=500;
	    Integer quatity;
	    
		InventoryDecorators invent = new InventoryDecorators();
		
	    invent.addBook(new Books("MIB-1", 500, 5));
		price = invent.findPriceByName("MIB-1");
		System.out.println("Price is : " + price);
		
		invent.addBook(new Books("Math",250,10));
		invent.sellBook("Math");
		invent.sellBook("Math");
		
		price = invent.findPriceByID(2);
		System.out.println("Quatiry is " + price);
		
		invent.changePrice("Math",450);
		price = invent.findPriceByName("Math");
		System.out.println("New Price : "+ price);
		
		
		invent.addCopy("Math",30);
		quatity = invent.findQuantityByName("Math");
		System.out.println("Quantity is : " + quatity);
	    
		}
}
