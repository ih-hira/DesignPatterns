package Aggregation;
import java.util.*;

public class Airliner {
	private String name;
	
	// Airliner has crew members
	private List<CrewMember> crewMembers;
	Airliner(String name, List<CrewMember> crewMembers)
	{
		this.name = name;
		this.crewMembers = crewMembers;
	}
	public void printCrewMemberName()
	{
		System.out.println("Airliner: "+this.name);
		System.out.println("::::Crew Members::::");
		if(this.crewMembers != null)
		{
			for(CrewMember m:this.crewMembers)
			{
				System.out.println(m.getName());
			}
		}
	}
}
