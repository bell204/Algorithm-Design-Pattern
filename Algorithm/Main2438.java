package algorithm;


/*
 * author donghaeng
 */

import java.util.Scanner;

public class Main2438 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i=0; i<num; i++){
        	for(int j=num-i; j<=num; j++){
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        
    }
}