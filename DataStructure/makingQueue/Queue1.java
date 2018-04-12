package makingQueue;

/*
 * ArrayList 이용해서 간단히 큐 구현하기
 * author donghaeng
 */

import java.util.ArrayList;
import java.util.List;

public class Queue1 {

	public List<Integer> queue = new ArrayList<Integer>();

	public void enqueue(int i) {
		queue.add(i);
	}

	public int dequeue() {

		if (queue.isEmpty()) {
			System.out.println("queue is empty");
			throw new java.util.NoSuchElementException();
		}
		return queue.remove(0);
	}

	public boolean isEmpty() {
		// arrayList의 isEmpty 기능을 이용함
		return queue.isEmpty();
	}

}
