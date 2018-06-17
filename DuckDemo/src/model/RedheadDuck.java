package model;

public class RedheadDuck extends Duck{

	public RedheadDuck(QuackBehavior quackbehavior, FlyBehavior flybehavior) {
		super(quackbehavior, flybehavior);
		// TODO Auto-generated constructor stub
	}
	public void display(){
		System.out.println("我是一只红头鸭");
		performQuack();
		performFly();
	}

}
