/**
 * 
 */
package Strategy;

/**
 * @author abhibane
 *
 */
public abstract class Duck {
	
	/*
	 * Declare both reference variables for the behavior interface
	 * types. All duck subclasses inherit these.
	 */
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void setFlyBehaviour(FlyBehavior fb){
		flyBehavior =fb;
	}
	
	public void setQuackBehaviour(QuackBehavior qb){
		quackBehavior =qb;
	}
}
