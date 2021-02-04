package lab_02_sec1;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		this.flyBehave = new FlyWithWing();
		this.quackBehave = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am mallard duck.");
	}

}
