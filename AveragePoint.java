package fizzBuzz;

import java.util.Scanner;

/**
 * @author donghaeng
 */

public class AveragePoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		// 여러개라면 배열의 크기를 미리 초기화 해두자.
		int input[]= new int[5];
		
		// 평균 구하는 경우 합을 미리 초기화 해두자. // sum 초기화를 안해서
		int sum=0;
 
		
		for (int i = 0; i < input.length; i++) {
			input[i]= sc.nextInt();
		if(input[i]< 40)
			input[i]=40;		
			sum +=input[i];
		}
		sum=sum/5;
		System.out.println(sum);
		
	}

}
