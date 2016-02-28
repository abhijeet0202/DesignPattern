/**
 * 
 */
package AbstractFactory;


/**
 * @author abhibane
 *
 */
public abstract class Pizza {
	String name;
	String sause;
	String dough;
	
	void prepare() {
		System.out.println("Preparing " +name);
		System.out.println("Tossing dough....");
		System.out.println("Adding sauce....");
		System.out.println("Adding Toppings ");
		
				
	}
	
	void bake() {
		System.out.println("Bake For 25 minutes at 350C");
	}
	
	void cut() {
		System.out.println("Cutting The pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
}
