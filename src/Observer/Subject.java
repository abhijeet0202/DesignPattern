package Observer;

public interface Subject {
	
	/*
	 * Both of these methods takes an Observer as an argument to register/remove
	 */
	public void registerObserver(Observer obj);
	public void removeObserver (Observer obj);
	
	public void notifyObservers();

}
