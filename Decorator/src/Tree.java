
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
		// เช็คว่ามีดาวดวงเดียวบนต้นไม้
		onestar = true;
	}
	
	public abstract double cost();
}
