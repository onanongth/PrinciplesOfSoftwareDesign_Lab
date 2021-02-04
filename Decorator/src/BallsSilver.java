
public class BallsSilver extends Decoration {

	public BallsSilver(Tree t) {
		this.mytree = t;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return mytree.description() + ", Balls Silver";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mytree.cost() + 3;
	}

}
