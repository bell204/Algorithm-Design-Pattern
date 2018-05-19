import java.util.Scanner;

/*
 * author donghaeng
 * 
 */

	public class Main1978 {
		public static void main(String args[]) {

			
			Scanner sc = new Scanner(System.in);
			
			int input=sc.nextInt();
			int sosu=1;
			int count=0;
		
			for(int i=1; i<=input; i++){	
				int num=sc.nextInt();
				sosu=1;
								
				// 1~num까지 계속 나누어서 나누어떨어지는지 확인해야 함.
				for(int j=2; j<=num; j++){
					if(num%j==0)
						sosu++;
				} // 2차 for문끝
				
					if (sosu == 2)
						count++;
				}
			System.out.println(count);
		}
	}
 

	 