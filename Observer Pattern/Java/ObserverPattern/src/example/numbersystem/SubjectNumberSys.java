package example.numbersystem;

import java.util.ArrayList;

public class SubjectNumberSys implements Subject {
	
	private ArrayList<Observer> observers;
	private int value = 0;
	
	public SubjectNumberSys() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.updated(value);
		}
	}

	public void setState(int i) {
		// TODO Auto-generated method stub
		this.value = i;
		notifyObservers();
	}

}
