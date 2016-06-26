package Observer;

/*
 * The Observer Interface is implemented by all observers, so they all have 
 * to implant the update() method
 */
public interface Observer {
	
	public void update (float temp, float humidity, float pressure);

}
