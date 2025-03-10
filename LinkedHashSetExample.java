import java.util.*;
public class LinkedHashSetExample
{
	public static void main(String args[])
	{
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.add("B22CN001");
		set.add("B22CN002");
		set.add("B22CN003");
		set.add("B22CN004");
		set.add("B22CN005");
		
		System.out.println("LinkedHasSet Elements: "+set);
		
		System.out.println("Iterating Over elements: ");
		for(String dept:set)
		{
			System.out.print(dept+" ");
		}
		System.out.println("\nIterating Using iterator:");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}