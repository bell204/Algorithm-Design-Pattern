import java.util.Scanner;

/*
 * author donghaeng
 * 
 */

public class Main2609{

	public static void main(String args[]) {
 
		Scanner sc = new Scanner(System.in);
	 
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int temp;
		
		if(b>a){
			temp=b; // 큰 것을 temp에 넣고 
			b=a; // b에 작은 것을 넣고
			a=temp; // a에 temp를 넣고
			
		}
		
		System.out.println(gcd(a,b));
		System.out.println(a*b/gcd(a,b));
		
	}
	public static int gcd(int a, int b){
		if(a%b==0){
			return b;
		}
		
		return gcd(b, a%b);
	}
	  
}
