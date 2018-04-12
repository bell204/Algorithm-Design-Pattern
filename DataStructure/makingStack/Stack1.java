package makingStack;

/*
 * �迭 �̿��ؼ� ������ ���� �����ϱ�
 * author donghaeng
 */

public class Stack1 {

	// ��� ���� �迭 ����
	int[] arr;
	int index = 0;

	// ���� ����� �����ڿ��� ����������.
	public Stack1(int size) {
		this.arr = new int[size];
	}

	public void push(int i) {

		// ���� ���� �÷ο�
		if (index< arr.length) { // �󸶱��� Ǫ���� ���ư����ϳ�  <3  
			arr[index++] = i; 
			System.out.println("���ÿ� �� ��" + i);

		} else { // index�� 3�̻��̸�
			System.out.println("stack is full");

		}
	}

	public int pop() {

		// ���� ����÷ο�
		if (index < 0) {
			throw new java.util.NoSuchElementException();
		} else {
			return this.arr[--index];
		}
	}

}
