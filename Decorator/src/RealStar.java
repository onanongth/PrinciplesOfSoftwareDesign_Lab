
public class RealStar extends Decoration {

	public RealStar(Tree t) {
		this.mytree = t;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return mytree.description() + ", a star";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 4.00 + mytree.cost();
	}

}
