package model;

public class RubberDuck extends Duck{

	public RubberDuck(QuackBehavior quackbehavior, FlyBehavior flybehavior) {
		super(quackbehavior, flybehavior);
		// TODO Auto-generated constructor stub
	}
	public void display(){
		
			System.out.println("我是一只橡胶鸭");
			performQuack();
			performFly();
		}
	}


