package model;

import model.FlyBehavior;
import model.QuackBehavior;

public abstract class Duck {
 QuackBehavior quackbehavior;
 FlyBehavior flybehavior;
 
 public Duck(QuackBehavior quackbehavior,FlyBehavior flybehavior){
		this.quackbehavior=quackbehavior;
		this.flybehavior=flybehavior;
	}
     public void performQuack(){
    	 quackbehavior.performQuack();
     }
     
     public void performFly(){
    	 
    	 flybehavior.performFly();
    	 
     }
     
     public void swim(){
    	 System.out.println("会游泳");
     }
     public void display(){
    	 
     }
     public void setQuackBehavior(QuackBehavior quackbehavior){
    	 this.quackbehavior=quackbehavior;
    	 
     }
     public void setFlyBehavior (FlyBehavior flybehavior){
    	 this.flybehavior =flybehavior;
     }
     }

