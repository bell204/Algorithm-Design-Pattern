package makingStack;
 
/*
 * 배열 이용해서 간단히 스택 구현하기
 * author donghaeng
 */

public class Main {

	public static void main(String[] args) {
		
		Stack1 st = new Stack1(3);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}

}
