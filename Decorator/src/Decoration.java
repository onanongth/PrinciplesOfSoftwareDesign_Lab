
public abstract class Decoration extends Tree {

	public Tree mytree; //����ͧ�� Override
	
	public abstract String description();
	public abstract double cost();
	
	public void setStar() {
		mytree.setStar();
	}
	
	public boolean oneStar() {
		return mytree.oneStar();
	}

}
