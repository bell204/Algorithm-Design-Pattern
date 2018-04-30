package fizzBuzz; 

/**
 * @author donghaeng
 */

import java.util.Scanner;
 
public class OrderBy{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[8];
        
        // 8개 입력 값 받고
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        // 객체 종료 시킴
        sc.close();
          
        // 3가지 경우이므로 3가지 변수 생성 및 초기화
        int asc=0;
        int dsc=0;
        int mix=0;
        
        // 
        for (int i = 0; i < input.length-1; i++) {
        	// 뒤부터
        	if(input[i]== input[i+1]-1){
			asc=1;
        	}
        	else if(input[i]== input[i+1]+1){
        		dsc=1;
        	}
        	else
        		mix=1;
        	break;
        	}
 
        
     //출력
        if(asc==1){
        	System.out.println("asc");
        }else if(dsc==1){
        	System.out.println("dsc");
        }else if(mix==1){
        	System.out.println("mix");
        }
  
    }
}