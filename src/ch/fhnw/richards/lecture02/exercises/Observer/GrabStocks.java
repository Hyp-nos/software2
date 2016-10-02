package ch.fhnw.richards.lecture02.exercises.Observer;

public class GrabStocks {

	public static void main(String[] args) {
		
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setapplePrice(201.00);
		stockGrabber.setgooglePrice(60.00);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.unregister(observer1);
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setapplePrice(201.00);
		stockGrabber.setgooglePrice(60.00);
		
		// my tests
		
		stockGrabber.setapplePrice(100.00);
	
	}

}
