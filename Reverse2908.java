package algorithm;
 
/*
 * author donghaeng
 */

import java.util.Scanner;

public class Reverse2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// String[]reverse= new String[2];
		// 이렇게 하면 null 2개가 들어 있어서 
		//input 된 숫자와 합쳐지므로 아래와 같이 해야 빈 공간이 됨.
		String []reverse= new String[]{"",""};
		
		for (int i = 0; i < 2; i++) {
			System.out.println("숫자를 입력하세요");
			int input = sc.nextInt(); // 두번 입력받음.
		
			// i가 1일 때 			// i가 2일 때 
		while(input>0){
			reverse[i]+=input%10; 
			input=input/10;
		}
		}
		
		// 다시 int로 변환
	 if(Integer.valueOf(reverse[0])>Integer.valueOf(reverse[1]))
		 System.out.println(reverse[0]);
	 else{
		 System.out.println(reverse[1]);
	 }
	
	}

}
