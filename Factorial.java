package fizzBuzz;

import java.util.Scanner;

/**
 * @author donghaeng
 */

public class Factorial {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int result = 1;
        
          for(int i=1;i<=n;i++) {
          
          result=result*i; 
   
          }
        System.out.println(result);
    }
}

 