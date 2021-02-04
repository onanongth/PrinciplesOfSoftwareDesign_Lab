
public class Star extends Decoration {

	public Star(Tree t) {
		// ����ҵ�����մ����������������
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
