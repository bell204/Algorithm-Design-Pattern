package makingQueue;

/*
 * ArrayList �̿��ؼ� ������ ť �����ϱ�
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
		// arrayList�� isEmpty ����� �̿���
		return queue.isEmpty();
	}

}
