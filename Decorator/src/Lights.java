
public class Lights extends Decoration {

	public Lights(Tree t) {
		this.mytree = t;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return mytree.description() + ", Lights";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mytree.cost() + 5.00;
	}

}
