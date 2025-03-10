import java.util.*;
public class ReverseListIterator
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Cherry","Date"));
		System.out.println("Reverse order using ListIterator:");
		ListIterator<String> listIterator = list.listIterator(list.size());
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
		Collections.reverse(list);
		System.out.println("reverse order using Collections.reverse():");
		System.out.println(list);
	}
}