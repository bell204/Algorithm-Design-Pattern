package algorithm;

import java.util.Scanner;

public class Main8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 5개
		int num=sc.nextInt();
		
		// 5개의 OX
		String arr[]=new String[num];
		
		for(int i=0; i<num; i++){
			arr[i]=sc.next();
		}
		sc.close();
		
		// 최종 점수
		//배열의 길이가 아니라 배열 요소의 깅이를 구해야 한다.
		
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
