package model;

public class MarllardDuck extends Duck{

	public MarllardDuck(QuackBehavior quackbehavior, FlyBehavior flybehavior) {
		super(quackbehavior, flybehavior);
		// TODO Auto-generated constructor stub
		
	}
	
	public void display(){
		System.out.println("我是一只绿头鸭!");
		performQuack();
		performFly();
	}
	}

