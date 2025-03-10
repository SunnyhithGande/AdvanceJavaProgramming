import java.util.*;
class HashSetExample
{
	public static void main(String args[])
    {
		HashSet<String> set = new HashSet<>();
		
		set.add("CSN1");
		set.add("CSN2");
		set.add("CSO2");
		set.add("CSO1");
		
		set.remove("CSN1");
		
		System.out.println("Contains CSN1? " + set.contains("CSN2"));
		
		for(String dept: set)
		{
			System.out.println(dept);
		}
		
		System.out.println("HashSet: "+set);
	}
}