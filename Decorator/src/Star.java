
public class Star extends Decoration {

	public Star(Tree t) {
		// เช็คว่าต้นไม้มีดาวอยู่แล้วรึเปล่า
		if (!t.oneStar()) {
			t.setStar();
			this.mytree = new RealStar(t);
		}
		else {
			System.out.println("Tree already has a star!");
			this.mytree = t;
		}
	}

	public double cost() {
		return mytree.cost();
    }

	public String description() {
		return mytree.description();
	}
	
}
