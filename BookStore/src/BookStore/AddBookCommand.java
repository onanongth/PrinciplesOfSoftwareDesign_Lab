
package BookStore;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AddBookCommand extends Command implements java.io.Serializable{

	private Books book;
	private String fileName = "Command.ser";
	
	AddBookCommand(Books newBook){
	this.book = newBook; 
	}
	
	@Override
	public void execute(Inventory newInvent) {
		
		newInvent.addBook(book);
		
		try
	      {
	         FileOutputStream fileOut = new FileOutputStream(fileName,true);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	        // out.writeObject(this);
	         out.writeObject(fileName);
	         out.close();
	         fileOut.close();
	        
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	        
	      }
		
	}

}
