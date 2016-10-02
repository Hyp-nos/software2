package ch.fhnw.richards.lecture02.exercises.Observer;

//This interface handles adding, deleting and updating
//all observers

public interface Subject {
	
	public void register(Observer o); // it can be addObserver
	public void unregister(Observer o);  // it can be removeObserver
	public void notifyObserver();
	
}
