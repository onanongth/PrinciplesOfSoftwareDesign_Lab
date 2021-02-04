package lab_02_sec1;

import java.util.ArrayList;
import java.util.List;

public class Lab_02_sec1_Main {

	public static void main(String[] args) {
		
		Duck d = new MallardDuck();
		d.display();
		d = new RedHeadDuck();
		d.display();
		d = new RubberDuck();
		d.display();
		d = new DecoyDuck();
		d.display();
		
		List<Duck> dList = new ArrayList<>();
		dList.add(new MallardDuck());
		dList.add(new RedHeadDuck());
		dList.add(new RubberDuck());
		dList.add(new DecoyDuck());
		
		for(var e :dList) {
			e.display();
			e.performFly();
			e.performQuack();
			System.out.println("----------");
		}

	}

}
