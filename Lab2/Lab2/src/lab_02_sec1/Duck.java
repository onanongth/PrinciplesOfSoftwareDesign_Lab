package lab_02_sec1;

public abstract class Duck {
	// Favor composition over inheritance
	FlyBehavior flyBehave;
	QuackBehavior quackBehave;
	public abstract void display();
	
	public void performFly() {
		//delegation
		this.flyBehave.fly();
	}
	public void performQuack() {
		//delegation
		this.quackBehave.quack();
	}
	public void setFlyBehavior(FlyBehavior f) {
		this.flyBehave = f;
	}
	public void setQuackBehavior(QuackBehavior q) {
		this.quackBehave = q;
	}
}
