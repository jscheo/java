package day04;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자입력> ");
			int number = sc.nextInt();
			
			if (number > 0) {
				System.out.println("양수");
			}else if(number < 0) {
				System.out.println("음수");
			}else if(number == 0) {
//				System.out.println("0");
				break;
			}
			
		}System.out.println("반복문종료");
		
		
		
		
//		System.out.print("숫자입력> ");
//		int a = sc.nextInt();
//		int sum = 0;
//		
//		for(int i=1;i<=a;i++) {
//			sum +=i;
//		}
//		System.out.println("1~"+a+"까지의 합: "+sum);
//		
		
		
//		int sum = 0;
//		for(int i = 1; i<=100;i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		
//		//1부터 10까지 출력하는 문구
//		for(int i = 1; i<=10;i++) {
//			System.out.println(i);
//		}
//		for(int i = 10; i>=1;i--)
//			System.out.println(i);
//		
		
		
		
	}

}
