package makingQueue;

/*
 * ArrayList �̿��ؼ� ������ ť �����ϱ�
 * author donghaeng
 */

public class Main {

	public static void main(String[] args) {
		Queue1 q = new Queue1();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		while (!q.isEmpty()) {
			System.out.println("q���� ���� ����" + q.dequeue());
		}

	}

}
