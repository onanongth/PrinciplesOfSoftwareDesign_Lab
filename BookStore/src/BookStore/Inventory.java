package BookStore;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Inventory implements InventoryInterfaces{

	private ArrayList<Books> book = new ArrayList<Books>();
	private Memento memento = new Memento();
	private InventoryDecorators invent ;
	private String CommandFileName = "Command.ser";
	private Integer numberOfState=0, timeToSave =3;
	private Integer quality;
	private Integer price;
	
	public ArrayList<Books> getBookCollection() {
		return book;
	}

	public void setBookCollection(ArrayList<Books> bookCollection) {
		this.book = bookCollection;
	}
	
	
	@Override
	public void addBook(Books book) {
		this.book.add(book);
		
		if(++numberOfState == timeToSave){
	    	this.saveState();
	    	numberOfState=0;
		}
		
	}

	@Override
	public void sellBook(String bookName) {
		for(Books book : book){
			
			if(book.getName().equals(bookName) && book.getQuantity() > 0){
				book.changeQuantity(-1);
				if(++numberOfState == timeToSave){
			    	this.saveState();
			    	numberOfState=0;
			    }
				return ;
			}	
			
		}
		
		
	}

	@Override
	public void addCopy(String bookName, Integer NumberOfCopy) {
		for(Books book : book){
			
			if(book.getName().equals(bookName)){
				book.changeQuantity(NumberOfCopy);
				if(++numberOfState == timeToSave){
			    	this.saveState();
			    	numberOfState=0;
			    }
				return ;	
			}
			
			
		}
		
		
	}

	@Override
	public void changePrice(String bookName, Integer newPrice) {
		for(Books book : book){
			
			if(book.getName().equals(bookName)){
				book.setPrice(newPrice);
				if(++numberOfState == timeToSave){
			    	this.saveState();
			    	numberOfState=0;
			    }
				return ;
			}
		}
		
		
	}

	@Override
	public Integer findPriceByName(String bookName) {
		for(Books book : book){
			
			if(book.getName().equals(bookName)){
				this.price =  book.getPrice();
			}
				
		}
		return this.price;
	}

	@Override
	public Integer findQuantityByName(String bookName) {
		for(Books book : book){
			
			if(book.getName().equals(bookName)){
				this.quality =  book.getQuantity();
			}
				
		}
		return this.quality;
		
	}

	@Override
	public Integer findQuantityByID(Integer bookID) {
		for(Books book : book){
			
			if(book.getUniqueID().equals(bookID)){
				this.quality =  book.getQuantity();
			}
				
		}
		return this.quality;
	}

	@Override
	public Integer findPriceByID(Integer bookID) {
		for(Books book : book){
			
			if(book.getUniqueID().equals(bookID)){
				this.price  =  book.getPrice();
			}
		}
		return this.price;
	}

	@Override
	public void saveState() {
		 memento.saveState(book);
		 File file = new File(CommandFileName);
		 file.delete();
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		
	}

	@Override
	public void getState() {
		invent.getState(); 
		book = (invent.getInvent().getBookCollection());
		
	}

}
