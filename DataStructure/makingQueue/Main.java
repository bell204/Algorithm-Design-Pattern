package makingQueue;

/*
 * ArrayList 이용해서 간단히 큐 구현하기
 * author donghaeng
 */

public class Main {

	public static void main(String[] args) {
		Queue1 q = new Queue1();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		while (!q.isEmpty()) {
			System.out.println("q에서 나온 순서" + q.dequeue());
		}

	}

}
