
public class BallsBlue extends Decoration {

	public BallsBlue(Tree t) {
		this.mytree = t;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return mytree.description() + ", Balls Blue";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mytree.cost() + 2;
	}

}
