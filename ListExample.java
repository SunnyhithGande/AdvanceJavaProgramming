import java.util.*;
public class ListExample
{
	public static void main(String args[])
	{
		List<String> arrayList = new ArrayList<>();
		arrayList.add("CSN");
		arrayList.add("CSO");
		arrayList.add("CSE");
		System.out.println("ArrayList: " + arrayList);
		
		System.out.println("First element in ArrayList: " + arrayList.get(0));
		
		arrayList.set(1,"IT");
		System.out.println("Modified ArrayList: " + arrayList);
		
		arrayList.remove("CSN");
		System.out.println("ArrayList after removal: "+arrayList);
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Mech");
		linkedList.add("EEE");
		linkedList.add("ECI");
		System.out.println("LinkedList: " + linkedList);
	}
}