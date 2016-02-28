/**
 * 
 */
package Factory;

/**
 * @author abhibane
 *
 */
public class PizzaStore {
	SimplePizzaFactory simplePizzaFactory;
	
	public PizzaStore(SimplePizzaFactory simplePizzaFactory){
		this.simplePizzaFactory = simplePizzaFactory;
	}
	
	public Pizza orderPizza(String Pizzatype){
		Pizza pizza;
		
		pizza = simplePizzaFactory.createPizza(Pizzatype);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;				
	}
}
