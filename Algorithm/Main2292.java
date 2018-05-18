package algorithm;


/*
 * author donghaeng
 */

import java.util.Scanner;

public class Main2292 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 7¿ª ≥÷¿Ω.
         
        int roomNum=1;
        int addNum=6;
        int result=1;
        
        while(true){
        	if(n<=roomNum){
        		break;
        	}
        		roomNum+=addNum;
        		addNum+=6;
        		result++;
        	}
        	System.out.println(result);
        }
        
    }
