package BuilderWithClassHierarchies;

import BuilderWithClassHierarchies.NyPizza.Size;
import BuilderWithClassHierarchies.Pizza.Topping;

public class BuilderSimulator {


	public static void main(String[] args) {
		NyPizza pizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
		Calzone calzone = new Calzone.Builder().addTopping(Topping.HAM).sauceInside().build();

	}

}
