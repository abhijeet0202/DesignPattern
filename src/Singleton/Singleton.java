/**
 * 
 */
package Singleton;

/**
 * @author abhibane
 *
 */
public class Singleton {
	private volatile static Singleton objInstance;
	private Singleton(){}
	public static Singleton getInstance(){
		if (objInstance == null){
			synchronized (Singleton.class) {
				if (objInstance == null){
					System.out.println("Instantiating new Singleton");
					objInstance =new Singleton();
				}
			}
			
		}
		System.out.println(objInstance);
		return objInstance;
	}

}
