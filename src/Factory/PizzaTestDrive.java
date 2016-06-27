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
		
		PizzaStore store = new PizzaStore();
		
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("Abhijeet Orderd: "+ pizza.getName()+ "\n");
		
		}
}

