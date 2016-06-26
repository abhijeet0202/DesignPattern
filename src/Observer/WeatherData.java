/**
 * 
 */
package Observer;

import java.util.ArrayList;

/**
 * @author abhibane
 *
 */
public class WeatherData implements Subject {
	
	// ArrayList to hold the Observers
	private ArrayList<Observer> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}

	// When an Observer registers, we just add it to the end of the list
	@Override
	public void registerObserver(Observer obj) {
		System.out.println("Adding New Observer :" +obj);
		observers.add(obj);
		
	}
	//When an Observer un-registers, we just remove it to the end of the list
	@Override
	public void removeObserver(Observer obj) {
		int i = observers.indexOf(obj);
		if (i>0)
			observers.remove(i);
	}
	//We tell all the observers about the state changed, Because we know all the observers implemented
	// update(), so we know how to notify them
	@Override
	public void notifyObservers() {
		for (int i =0; i < observers.size();i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementChanged(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
	
}
