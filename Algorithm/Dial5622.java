package algorithm;

/*
 * author donghaeng
 * �밡�ٶ� �ٽ� Ǯ �ʿ� x
 */

import java.util.Scanner;
public class Dial5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = 0 ;

		// �ϴ� ��Ʈ������ �Է°� ����.
		String input = scan.nextLine();
		
		//���ڿ��� ���� ���ؼ� �ݺ�.
		for(int i = 0 ; i < input.length(); i ++) {

			// char ������ ����
			char charIndex = input.charAt(i);

			// 0��°���� 
			if( charIndex >='A' && charIndex <= 'C' ) {

				time += 3;

			} else if( charIndex >='D' && charIndex <= 'F' ) {

				time += 4;

			} else if( charIndex >='G' && charIndex <= 'I' ) {

				time += 5;

			} else if( charIndex >='J' && charIndex <= 'L' ) {

				time += 6;

			} else if( charIndex >='M' && charIndex <= 'O' ) {

				time += 7;

			} else if( charIndex >='P' && charIndex <= 'S' ) {

				time += 8;

			} else if( charIndex >='T' && charIndex <= 'V' ) {

				time += 9;

			} else if( charIndex >='W' && charIndex <= 'Z' ) {

				time += 10;

			}

			

		}

		System.out.println(time);

	}



}