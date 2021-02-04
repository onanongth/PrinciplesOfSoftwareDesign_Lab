package BookStore;

public interface InventoryInterfaces {

	public void addBook(Books book);
	public void sellBook(String bookName);
	public void addCopy(String bookName, Integer NumberOfCopy ) ;
	public void changePrice(String bookName,Integer newPrice);
	public Integer findPriceByName(String bookName) ;
	public Integer findQuantityByName(String bookName) ;
	public Integer findQuantityByID(Integer bookID) ;
	public Integer findPriceByID(Integer bookID) ;
	public void saveState();
	public void getState();
}
