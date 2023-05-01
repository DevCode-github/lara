package pack2_Vector_PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class M4_priorityqueue_reverse_sort {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue(Collections.reverseOrder());
		queue.add(90);
		queue.add(91);
		queue.add(92);
		queue.add(93);
		queue.add(94);
		queue.add(95);
		queue.add(96);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
