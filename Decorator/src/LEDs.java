
public class LEDs extends Decoration {

	public LEDs(Tree t) {
		this.mytree = t;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return mytree.description() + ", LEDs";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mytree.cost() + 10.00;
	}

}
