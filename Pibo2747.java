package fizzBuzz;

import java.util.Scanner;

/**
 * @author donghaeng
 */

public class Pibo2747 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		
		if(num ==0){
			System.out.println(a);
			return;
			
		}
		else if(num ==1){
			System.out.println(b);
			return;
			
		}else{
			for (int i = 0; i < num-1; i++) {
				if(b>a){
					a+=b;
				}else{
					b+=a;
				}
				 
			}
			if(b>a) System.out.println(b);
			else System.out.println(a);
		}
 
	}
	}

		
	 
