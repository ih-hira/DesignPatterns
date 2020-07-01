package Composition;

import java.util.ArrayList;
import java.util.List;

public class Home {
	private List<Room> rooms = new ArrayList<Room>();
	
	public void addRoom(Room r)
	{
		rooms.add(r);
	}
	public int numOfRooms()
	{
		return rooms.size();
	}
	
	public double totalArea()
	{
		double totalArea = 0;
		for(int i=0;i<rooms.size();i++)
		{
			totalArea += rooms.get(i).getRoomArea();
		}
		return totalArea;
	}
}
