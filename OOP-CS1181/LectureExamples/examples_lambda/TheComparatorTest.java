//----
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator; 


public class TheComparatorTest { 
	private static String[] names={"mike", "jack", "helen", "peter", 
		"elli", "mark", "gary", "alex", "harry"}; 
	public static void main(String[] args)   { 
		
		ArrayList<Member> list = new ArrayList<Member>(); 
		for (String e: names ) { 
			list.add(new Member(e)); 
		} 
		
		Comparator<Member> sCom = (m1,m2) -> m1.getName().compareTo(m2.getName());
		
		Collections.sort(list, sCom);

		// Print Members 
		for(Member m: list)
			System.out.println(m.getName());
		
	}
}

//----
class Member { 
	private String name; 
	public Member(String name){ 
		this.name = name; 
	} 
	public String getName(){ 
		return name; 
	} 
}	 
