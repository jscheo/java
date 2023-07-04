package day02;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(변수선언;조건식;증강값) {
//			
//		}
//		
//		int a = 9;
//		
//		while(true) {
//			System.out.println("반복");

//		}
//		
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//			
//		}

//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.println("숫자입력>");
//			int num = sc.nextInt();
//			if (num == 0) {
//				break;
//			}
//		}
		
//		System.out.println("반복종료");

		
		// 반복해서 숫자를 입력받아 출력하는데, 3의 배수는 피즈, 5의 배수는 버즈, 3,5의 배수는 피즈버즈 출력
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자입력>");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("반복종료");
				break;
			}if (num % 15 == 0) {
				System.out.println("피즈버즈");
			}else if (num % 3 == 0) {
				System.out.println("피즈");
			}else if (num % 5 == 0) {
				System.out.println("버즈");
			}else {
				System.out.println(num);
			}
		}
		
		
		
	}

}
