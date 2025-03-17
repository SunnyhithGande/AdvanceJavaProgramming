import java.util.*;
public class MapOperations
{
	public static void main(String args[])
	{
		Map<String,Integer> hashMap = new HashMap<>();
		
		hashMap.put("Arjun",1);
		hashMap.put("Prabhas",2);
		hashMap.put("Sanjeevan",3);
		
		System.out.println("HashMap: " + hashMap);
		
		hashMap.remove("Prabhas");
		System.out.println("HashMap after deletion: " + hashMap);
		String searchKey="Sanjeevan";
		if(hashMap.containsKey(searchKey))
		{
			System.out.println("Key " + searchKey + "found with value: " + hashMap.get(searchKey));
		}
		else
		{
			System.out.println("Key "+ searchKey + "not found");
		}
		System.out.println("Traversing HashMap:");
		for(Map.Entry<String,Integer> entry : hashMap.entrySet())
		{
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		/////TREEMAP
		Map<Integer,String>  treeMap= new TreeMap<>();
		
		treeMap.put(1,"Sunny");
		treeMap.put(2,"Rishi");
		treeMap.put(3,"SHankar");
		
		System.out.println("TreeMap: " + treeMap);
		
		treeMap.remove(2);
		System.out.println("TreeMap after deletion: " + treeMap);
		int search = 2;
		if(treeMap.containsKey(search))
		{
			System.out.println("Key " + search + "found with value: " + treeMap.get(search));
		}
		else
		{
			System.out.println("Key "+ search + "not found");
		}
		for(Map.Entry<Integer,String> entry : treeMap.entrySet())
		{
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
	}
}