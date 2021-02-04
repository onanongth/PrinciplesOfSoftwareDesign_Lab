package BookStore;

import java.util.ArrayList;

/**
 * This class used to save/get state of inventory
 */

public class Memento implements java.io.Serializable{
	
	private ArrayList<Books> bookCollection;
	
	public void saveState(ArrayList<Books> newBookCollection){
		
		this.bookCollection = new ArrayList<Books>(newBookCollection);
		
	}
	
	public ArrayList<Books> getState(){
		
		return this.bookCollection;
		
	}
}
