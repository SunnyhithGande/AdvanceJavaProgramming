import java.util.*;
public class CSNList
{
	public static void main(String args[])
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("Welcome");
		str.add("To");
		str.add("KITS");
		str.add("method1");
		
		System.out.println("ArrayList is" + str);
		
		ArrayList<String> method2 = new ArrayList<String>(Arrays.asList("Welcome","To","KITSW","method2"));
		System.out.println("ArrayList is : :"+method2);
		
		ArrayList<String> method3 = new ArrayList<>(List.of("Welcome","To","KITSW","method3"));
		System.out.println("ArrayList is : "+method3);
	}
}