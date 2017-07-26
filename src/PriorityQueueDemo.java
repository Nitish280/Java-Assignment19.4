import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// here we are creating an instance of PriorityQueue in Java
		// we are defining the initial capacity
		// because it is backed by array

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(16);
		pq.add(3);
		pq.add(7);
		pq.add(2);
		pq.add(4);
		pq.add(1);
		pq.add(5);
		// here we use the peek method
		// peek() returns the head of the queue

		Integer head = pq.peek();
		System.out.println("head of the PriorityQueue : " + head);

		// here we using the poll Method
		// for removing the head
		// poll() method is use to remove the head
		head = pq.poll(); // 1
		head = pq.peek();

		System.out.println("Current value of head : " + head);

		// Iterating over PriorityQueue

		Iterator<Integer> itr = pq.iterator();
		System.out.println("Iterating over PriorityQueue");

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}
