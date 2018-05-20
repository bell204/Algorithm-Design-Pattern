import java.util.Scanner;

/*
 * author donghaeng
 * 
 */

	public class Main2490 {
		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);
			
			char number[]= new char[4];
			
			int count =3;
			
			for(int j=0; j<count; j++){
				number=sc.nextLine().toCharArray();				
			
			int ZeroCount=0;
			 
				for(int i=0; i<number.length; i++){
				if(number[i]-'0'==0){
					ZeroCount++;
				}
			}
			
			if(ZeroCount==0){
				System.out.println('E');
			}else if(ZeroCount==3){
				System.out.println('C');
			}else if(ZeroCount==2){
				System.out.println('B');
			}else if(ZeroCount==1){
				System.out.println('A');
			}else{
				System.out.println('D');
			}
			
		}
			
			
	}
	}

 

	 