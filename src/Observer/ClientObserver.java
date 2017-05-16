/**
 * 
 */
package Observer;

/**
 * @author abhibane
 *
 */
public class ClientObserver implements Observer {

	private float temperature;
	private float humidity;
	private float pressure;
	
	//@SuppressWarnings("unused")
	//private Subject weatherData;
	
	
	public ClientObserver(Subject weatherData){
		//this.weatherData = weatherData;
		System.out.println("Registering Myself With Subject");
		weatherData.registerObserver(this);
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}		
	
	
	
	public void display(){
		System.out.println("Current Temperature: "+ temperature+ "\nCurrent Humidity :"+humidity+ "\nCurrent Presure: "+pressure);
	}
}
