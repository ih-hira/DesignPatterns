package example.numbersystem;

public class OctalObserver extends Observer {

	private int value;
	public OctalObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void updated(int value) {
		// TODO Auto-generated method stub
		this.value = value;
		System.out.println( "Octal String: " + Integer.toOctalString( this.value ) ); 

	}

}
