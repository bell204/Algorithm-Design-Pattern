package algorithm;


/*
 * author donghaeng
 * 
 */


import java.util.Scanner;

public class Main2577 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int A= sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");	
		int B=sc.nextInt();
		
		System.out.println("세번째 숫자를 입력하세요");
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
