/**
 * 
 */
package Factory;

/**
 * @author abhibane
 *
 */
public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(simplePizzaFactory);
		
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("Abhijeet Orderd"+ pizza.getName()+ "\n");
		
		}
}

