import java.util.*;
public class StackOperations
{
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("Stack after push operations: "+ stack);
		
		System.out.println("Top element (peek): " + stack.peek());
		
		System.out.println("Popped element: " + stack.pop());
		
		System.out.println("Stack after pop: " + stack);
		
		int position = stack.search(20);
		if(position != -1)
		{
			System.out.println("Element 20 found at position: "+ position);
		}
		else
		{
			System.out.println("Element 20 found in the stack");
		}
		System.out.println("Is stack empty? " + stack.isEmpty());
	}
}