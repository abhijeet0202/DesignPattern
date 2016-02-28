/**
 * 
 */
package AbstractFactory;

/**
 * @author abhibane
 *
 */
public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PizzaStore store = new CaliforniaPizzaFactory();
		
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("Abhijeet Orderd"+ pizza.getName()+ "\n");
		
		}
}

