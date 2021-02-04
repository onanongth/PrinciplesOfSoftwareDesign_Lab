
public abstract class Decoration extends Tree {

	public Tree mytree; //ไม่ต้องมี Override
	
	public abstract String description();
	public abstract double cost();
	
	public void setStar() {
		mytree.setStar();
	}
	
	public boolean oneStar() {
		return mytree.oneStar();
	}

}
