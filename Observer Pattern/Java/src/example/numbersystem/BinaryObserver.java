package example.numbersystem;

public class BinaryObserver extends Observer {
	
	private int value;
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void updated(int value) {
		// TODO Auto-generated method stub
		this.value = value;
		System.out.println( "Binary String: " + Integer.toBinaryString( this.value ) );
	}
}