package day05;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//하나의 숫자를 입력받아, 1~입력받은 수까지의 합 출력
		int sum = 0;
		System.out.print("숫자를 더합니다. 숫자입력> ");
		
		int num = sc.nextInt();
		for(int i=1;num >= i;i++)
			sum = sum+i;
		System.out.println(sum);
		
		
		
		
		
		
		// 하나의 숫자를 입력받아, 3의배수, 5의배수, 3과5의배수, 둘다아님 출력

//		while (true) {
//			System.out.print("숫자를 입력하세요. 숫자입력>");
//			int num = sc.nextInt();
//			if (num == 0) {
//				System.out.println("0");
//			} else if (num % 15 == 0) {
//				System.out.println("3과5의배수");
//			} else if (num % 3 == 0) {
//				System.out.println("3의배수");
//			} else if (num % 5 == 0) {
//				System.out.println("5의배수");
//			} else {
//				System.out.println("둘다아님");
//			}
//			System.out.println();
//		}

	}

}
