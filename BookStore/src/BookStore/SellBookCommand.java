
package BookStore;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@SuppressWarnings("serial")
public class SellBookCommand extends Command implements java.io.Serializable{

	private String bookName;
	private String fileName = "Command.ser";
	
	public SellBookCommand(String bookName){
	this.bookName = bookName; 
	}


	@Override
	public void execute(Inventory newInvent) {
		
			  newInvent.sellBook(bookName);
			  

		try
	      {
	         FileOutputStream fileOut = new FileOutputStream(fileName,true);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(fileName);
	         out.close();
	         fileOut.close();
	        
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	        
	      }
	
	}

}


