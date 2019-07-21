package Decorator;
interface Cake{
	void flavour();
	int getAmount();
}

class BasicCake implements Cake{
	@Override
	public void flavour() {
		System.out.println("Basic Cake");
	}

	@Override
	public int getAmount() {
		return 50;
	}	
}

abstract class CakeDecorator implements Cake{
	private Cake cake;
	
	CakeDecorator(Cake cake){
		this.cake = cake;
	}
	
	@Override
	public void flavour() {
		cake.flavour();
	}

	@Override
	public int getAmount() {
		return cake.getAmount();
	}	
}

class Vanilla extends CakeDecorator{

	Vanilla(Cake cake) {
		super(cake);
	}
	
	@Override
	 public void flavour() {
	  super.flavour();
	  System.out.println("Adding Vanilla falvour");
	 }
	  
	 @Override
	 public int getAmount() {
	  return super.getAmount() + 10;
	 }
	
}

class Strawberry extends CakeDecorator{

	Strawberry(Cake cake) {
		super(cake);
	}
	
	@Override
	 public void flavour() {
	  super.flavour();
	  System.out.println("Adding Strawberry falvour");
	 }
	  
	 @Override
	 public int getAmount() {
	  return super.getAmount() + 20;
	 }
	
}
public class CakeDecoratorSimu {

	public static void main(String[] args) {
		Vanilla cake = new Vanilla(new Strawberry(new BasicCake()));
		cake.flavour();
		System.out.println("Total Price: "+cake.getAmount());

	}

}
