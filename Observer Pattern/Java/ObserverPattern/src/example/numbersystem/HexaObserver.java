package example.numbersystem;

public class HexaObserver extends Observer {

	private int value;
	public HexaObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void updated(int value) {
		// TODO Auto-generated method stub
		this.value = value;
		System.out.println( "Hex String: " + Integer.toHexString( this.value ).toUpperCase() );

	}

}
