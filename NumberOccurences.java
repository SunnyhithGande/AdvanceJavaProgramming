import java.util.*;
class NumberOccurences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> numberCount = new HashMap<>();
        
        System.out.println("Enter numbers  (enter -1 to stop):");
        while(true)
		{
			int num = sc.nextInt();
			if(num == -1) break;
			
			numberCount.put(num,numberCount.getOrDefault(num,0) + 1);
		}			
		sc.close();
		
		System.out.println("\nOccurences of each number:");
		for(Map.Entry<Integer,Integer> entry : numberCount.entrySet())
		{
			System.out.println(entry.getKey() + "appears" + entry.getValue() + "times");
		}
	}
}