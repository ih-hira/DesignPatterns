package Composition;

public class Room {
	private double height,width; //in feet
	public Room(double h, double w)
	{
		this.height = h;
		this.width = w;
	}
	
	public double getRoomArea()
	{
		return (height*width);
	}
}
