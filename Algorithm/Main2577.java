package algorithm;


/*
 * author donghaeng
 * 
 */


import java.util.Scanner;

public class Main2577 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int A= sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");	
		int B=sc.nextInt();
		
		System.out.println("����° ���ڸ� �Է��ϼ���");
		int C=sc.nextInt();
		
		int result=A*B*C;
		int number[]=new int[10];
	
		while(result>0){
			number[result%10]++;
			result/=10;	
		
		}
		
		for(int a : number){
			System.out.println(a);
		}
		
 
	}

}
