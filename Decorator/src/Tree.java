
public abstract class Tree {
	
	boolean onestar = false;
	String description = "Treeless..";
	
	public String description() {
		return description;
	}
	
	public boolean oneStar() {
		return onestar;
	}
	
	public void setStar() {
		// ������մ�Ǵǧ���Ǻ������
		onestar = true;
	}
	
	public abstract double cost();
}
