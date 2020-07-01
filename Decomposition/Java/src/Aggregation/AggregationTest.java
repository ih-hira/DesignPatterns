package Aggregation;
import java.util.*;

public class AggregationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrewMember m1 = new CrewMember("Mia", 1); 
		CrewMember m2 = new CrewMember("Priya", 2); 
		CrewMember m3 = new CrewMember("John", 1); 
		CrewMember m4 = new CrewMember("Rahul", 2); 
		
		List <CrewMember> members = new ArrayList<CrewMember>(); 
		members.add(m1); 
		members.add(m2);
		members.add(m3);
		members.add(m4);
		
		Airliner airliner = new Airliner("Biman Bangladesh", members);
		airliner.printCrewMemberName();
	}

}
