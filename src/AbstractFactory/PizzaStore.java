/**
 * 
 */
package AbstractFactory;

/**
 * @author abhibane
 *
 */
public abstract class PizzaStore {
	
	public Pizza orderPizza(String Pizzatype){
		Pizza pizza;
		
		pizza = createPizza(Pizzatype);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;				
	}
	
	abstract Pizza createPizza(String Pizzatype);
}
