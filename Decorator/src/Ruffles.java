
public class Ruffles extends Decoration {
	
	public Ruffles(Tree t) {
		this.mytree = t;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return mytree.description() + ", Ruffle";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mytree.cost() + 1.00;
	}

}
