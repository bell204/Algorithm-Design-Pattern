package algorithm;

import java.util.Scanner;

public class Main8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 5��
		int num=sc.nextInt();
		
		// 5���� OX
		String arr[]=new String[num];
		
		for(int i=0; i<num; i++){
			arr[i]=sc.next();
		}
		sc.close();
		
		// ���� ����
		//�迭�� ���̰� �ƴ϶� �迭 ����� ���̸� ���ؾ� �Ѵ�.
		
		int total=0;
		int count=0;
		
		for(String cas : arr){
			for(int i=0; i<cas.length(); ++i){
				if(cas.charAt(i)=='O'){
					total+= ++count;
				}else{
					count=0;
				}
			}
			System.out.println(total);
		}
		
		
		
		
	}

}
