import java.util.LinkedList;
import java.util.Queue;
public class QueueOperations
{
	public static void main(String args[])
    {
		Queue<Integer> q = new LinkedList<>();
		q.offer(100);
		q.offer(200);
		q.offer(300);
		q.offer(400);
		
		System.out.println("Queue after offer operations : " + q);
		System.out.println("Front element(peek): " + q.peek());

        System.out.println("Dequeued Elememt: "+q.poll());
		System.out.println("Queue after poll: " +q);
		
		System.out.println("Is Queue Empty? " + q.isEmpty());
		System.out.println("Queue Size : "+q.size());
	}
}