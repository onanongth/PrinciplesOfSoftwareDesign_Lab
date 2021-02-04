
public class BallsRed extends Decoration {

	public BallsRed(Tree t) {
		this.mytree = t;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return mytree.description() + ", Balls Red";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mytree.cost() + 1;
	}

}
