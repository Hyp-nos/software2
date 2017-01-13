package ch.fhnw.richards.lecture02.exercises.Observer;
// Represents each Observer that is monitoring changes in the subject

public class StockObserver implements Observer{
	
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;
	
	private static int observerIDTracker = 0;
	
	private int observerId;
	 // Will hold reference to the StockGrabber object
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		 // Store the reference to the stockGrabber object so I can make calls to its methods

		this.stockGrabber= stockGrabber;
		// Assign an observer ID and increment the static counter

		this.observerId= ++observerIDTracker;
		
		System.out.println("new Observer"+ observerId);
		stockGrabber.register(this);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {
		 this.ibmPrice =ibmPrice;
		 this.applePrice= applePrice;
		 this.googlePrice= googlePrice;
		 
		 printThePrices();
		
	}
	private void printThePrices() {
		System.out.println(observerId + "\nIBM " + ibmPrice +"\nAPPLE " + applePrice + "\nGoogle " + googlePrice+"\n");
		
	}

}
