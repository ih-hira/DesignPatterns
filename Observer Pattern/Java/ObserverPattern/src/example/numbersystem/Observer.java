package example.numbersystem;

public abstract class Observer {
	public Subject subject; //will use in every observer
	public abstract void updated(int value);
}
