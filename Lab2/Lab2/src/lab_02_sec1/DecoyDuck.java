package lab_02_sec1;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		this.flyBehave = new FlyWithWing();
		this.quackBehave = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Decoy Duck.");

	}

}
