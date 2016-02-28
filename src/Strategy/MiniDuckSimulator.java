/**
 * 
 */
package Strategy;

/**
 * @author abhibane
 *
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

	}

}
