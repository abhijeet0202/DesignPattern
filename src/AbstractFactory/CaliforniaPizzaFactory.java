/**
 * 
 */
package AbstractFactory;

/**
 * @author abhibane
 *
 */
public class CaliforniaPizzaFactory extends PizzaStore{
	
	public  CaliforniaPizzaFactory(){
		System.out.println("Welcome To California Pizza");
	}
	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if (type.equals("cheese")){
			pizza = new CheesePizza();
		}
		else if (type.equals("pepperoni")){
			pizza = new PepporonPizza();
		}
		else if (type.equals("clam")){
			pizza = new ClamPizza();
		}
		else if (type.equals("veggie")){
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
