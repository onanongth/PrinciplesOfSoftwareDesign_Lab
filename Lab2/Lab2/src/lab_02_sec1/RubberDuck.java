package lab_02_sec1;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		this.flyBehave = new FlyNoWing();
		this.quackBehave = new MuteQuack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Rubber Duck.");

	}

}
