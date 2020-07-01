package Composition;

public class CompositionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r1 = new Room(12.0,14.0);
		Room r2 = new Room(10,11);
		Room r3 = new Room(8,7);
		Room r4 = new Room(11,12);
		
		Home myHome = new Home();
		myHome.addRoom(r1);
		myHome.addRoom(r2);
		myHome.addRoom(r3);
		myHome.addRoom(r4);
		
		System.out.println("Number of rooms: " + myHome.numOfRooms());
		System.out.println("Total Area: " + myHome.totalArea()+" sqf");
	}

}
