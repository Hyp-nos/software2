package ch.fhnw.richards.lecture02.exercises.Observer;

//The Observers update method is called when the Subject changes

public interface Observer {
	
	public void update (double ibmPrice, double applePrice, double googlePrice);
		
	
}
