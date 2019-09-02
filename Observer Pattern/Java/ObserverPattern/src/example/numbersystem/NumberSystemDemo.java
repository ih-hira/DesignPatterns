package example.numbersystem;

public class NumberSystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectNumberSys subject = new SubjectNumberSys();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);

	}

}
