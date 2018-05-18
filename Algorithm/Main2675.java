package algorithm;

/*
* author donghaeng
*
*/

import java.util.Scanner;
 
public class Main2675 {
  public static void main(String[] args){
    char[] second;
    Scanner sc = new Scanner(System.in);
 
    int testCount = Integer.parseInt(sc.nextLine());
   
    for( int i=1; i<=testCount; i++){
      second = sc.nextLine().toCharArray();
      int num = Integer.parseInt(String.valueOf(second[0]));
    		  

      for(int j=2; j<second.length; j++){
        char a = second[j];
        for(int k=0; k<num; k++){
          System.out.print(a);
        }
      }
      System.out.println();
    }
  }
}