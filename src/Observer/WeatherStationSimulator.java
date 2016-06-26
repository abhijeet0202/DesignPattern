/**
 * 
 */
package Observer;

/**
 * @author abhibane
 *
 */
public final class WeatherStationSimulator {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		Observer obs = new ClientObserver(weatherData);	
		
		weatherData.measurementChanged(12,11,13);
	}

}
