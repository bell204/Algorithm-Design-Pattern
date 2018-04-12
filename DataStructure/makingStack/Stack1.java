package makingStack;

/*
 * 배열 이용해서 간단히 스택 구현하기
 * author donghaeng
 */

public class Stack1 {

	// 사용 전에 배열 선언만
	int[] arr;
	int index = 0;

	// 스택 사이즈를 생성자에서 고정시켜줌.
	public Stack1(int size) {
		this.arr = new int[size];
	}

	public void push(int i) {

		// 스택 오버 플로우
		if (index< arr.length) { // 얼마까지 푸쉬로 돌아가야하나  <3  
			arr[index++] = i; 
			System.out.println("스택에 들어간 것" + i);

		} else { // index가 3이상이면
			System.out.println("stack is full");

		}
	}

	public int pop() {

		// 스택 언더플로우
		if (index < 0) {
			throw new java.util.NoSuchElementException();
		} else {
			return this.arr[--index];
		}
	}

}
