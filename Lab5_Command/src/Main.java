
public class Main {
	public static void main(String[] args) {
	DocumentInvoker myDocument = new DocumentInvoker ("callmemaybe");
	 myDocument.Write("Hey I just met you");
	 myDocument.Write("And this is crazy");
	 myDocument.Write("But here’s my number");
     myDocument.Undo(2);
	 System.out.println(myDocument.Read());
	 myDocument.printCommandBuffer();
	}

}
