
public class Ribbons extends Decoration {

	public Ribbons(Tree t) {
		this.mytree = t;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return mytree.description() + ", Ribbons";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mytree.cost() + 2;
	}

}
