package makingStack;
 
/*
 * �迭 �̿��ؼ� ������ ���� �����ϱ�
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
