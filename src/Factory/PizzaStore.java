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
	
	public PizzaStore(){
		simplePizzaFactory = new SimplePizzaFactory();
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
