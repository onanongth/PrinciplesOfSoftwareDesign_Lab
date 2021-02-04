package lab_02_sec1;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		this.flyBehave = new FlyWithWing();
		this.quackBehave = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a red Head duck.");

	}

}
