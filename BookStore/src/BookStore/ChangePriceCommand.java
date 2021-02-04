package BookStore;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ChangePriceCommand extends Command implements java.io.Serializable{

	private String bookName;
	private Integer numberOfCopy;
	private String fileName = "Command.ser";
	
	ChangePriceCommand(String newbookName, Integer newNumberOfCopy){
		this.bookName = newbookName; 
		this.numberOfCopy = newNumberOfCopy;
	}
	
	@Override
	public void execute(Inventory newInvent) {
		
		    newInvent.changePrice(bookName,numberOfCopy);
		
		

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
