
public class main {

	public static void main(String[] args) {


		Tree mytree = new ColoradoBlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		
		System.out.println(mytree.description() + 
							"\ncosts $" + 
							mytree.cost());



	}

}
