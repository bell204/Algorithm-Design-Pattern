package algorithm;
 
/*
 * author donghaeng
 */

import java.util.Scanner;

public class Reverse2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// String[]reverse= new String[2];
		// �̷��� �ϸ� null 2���� ��� �־ 
		//input �� ���ڿ� �������Ƿ� �Ʒ��� ���� �ؾ� �� ������ ��.
		String []reverse= new String[]{"",""};
		
		for (int i = 0; i < 2; i++) {
			System.out.println("���ڸ� �Է��ϼ���");
			int input = sc.nextInt(); // �ι� �Է¹���.
		
			// i�� 1�� �� 			// i�� 2�� �� 
		while(input>0){
			reverse[i]+=input%10; 
			input=input/10;
		}
		}
		
		// �ٽ� int�� ��ȯ
	 if(Integer.valueOf(reverse[0])>Integer.valueOf(reverse[1]))
		 System.out.println(reverse[0]);
	 else{
		 System.out.println(reverse[1]);
	 }
	
	}

}
