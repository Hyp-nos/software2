package ch.fhnw.richards.lecture02.exercises.Observer;

import java.util.ArrayList;
//Uses the Subject interface to update all Observers

public class StockGrabber implements Subject{    //this is like PostOffice class
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;
	
	public StockGrabber(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void unregister(Observer delObserver) {
		int observerIndex= observers.indexOf(delObserver);
		System.out.println("observer" + (observerIndex+1)+ "Deleted");
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		// Cycle through all observers and notifies them of
	    // price changes


		for (Observer observer: observers){
			observer.update(ibmPrice, applePrice, googlePrice);
		}
		
	}
	// Change prices for all stocks and notifies observers of changes
	public void setIBMPrice(double newIBMPrice){
		this.ibmPrice= newIBMPrice;
		notifyObserver();
	}
	public void setapplePrice(double newIBMPrice){
		this.applePrice= newIBMPrice;
		notifyObserver();
	}
	public void setgooglePrice(double newIBMPrice){
		this.googlePrice= newIBMPrice;
		notifyObserver();
	}
}
