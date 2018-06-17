package test;

import org.junit.BeforeClass;
import org.junit.Test;


import model.FlyWithWings;
import model.MarllardDuck;

import model.Quack;


public class MarllardDuckTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Quack quack=new Quack();
		FlyWithWings flyWithWings=new FlyWithWings ();
		MarllardDuck mallardduck=new MarllardDuck(quack,flyWithWings);
		mallardduck.display();
		
		
	}
}
