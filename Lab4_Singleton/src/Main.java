
public class Main {
	public static void main(String[] args) {
		BarProducer bar1 = new BarProducer(1);
		BarProducer bar2 = new BarProducer(2);
		bar1.start();
		bar2.start();
	}
}
