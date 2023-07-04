package day03;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		//입력받으면서 짝수홀수 0이되면 반복문 빠져나오기
		
		while(true) {
			System.out.println("숫자입력> ");
			int a = sc.nextInt();
			if (a == 0) {
				System.out.println("반복문 종료");
				break;
			}else if (a % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}
		
		
		
		
		//while
		
//		while(true) {
//			System.out.println("숫자입력> ");
//			int a = sc.nextInt();
//			if (a == 0) {
//				System.out.println("0입니다.");
//				break;
//			}else if (a > 0 ) {	
//			System.out.println("양수");
//			}else if (a < 0) {
//				System.out.println("음수");
//			}
//			
//		}
//		System.out.println("반복문 종료");
//		
//		
//		
//		
		
		
		
		
		
//		System.out.println("숫자입력>");
//		int a = sc.nextInt();
		
		
	
		
//		if(a > 0) {
//			System.out.println("양수");
//		}
//		
		
		
		
//		
//		while(true) {
//			if(a > 0) {
//				System.out.println("양수");
//			}
//		}
//		
		
		
		
		
		
		
		
		
		
		

		//구구단 dan = 단, break(반복문중지), continue(건너뛰기)
//		
//		int dan = 7;
//		System.out.println(dan+"단");
//		
//		
//		for (int i=1;i<=9;i++) {
//			if (i == 5) {
//				System.out.println();
//				continue;
//			}
//			System.out.println(dan+" * "+i+" = "+(dan*i));
//		}
//		System.out.println(dan+"단 끝");
//		
		
		
		
		
//		//1~1000까지 7의배수 갯수 출력
//		int cnt = 0;
//		for (int i=1;i<=1000;i++) {
//			if (i % 7 == 0) {
//				cnt = cnt+1;
//			}
//		}System.out.println("1~100까지 7의배수 갯수 : "+cnt);
		
		
//		// 1~10까지 합출력	
//		int sum = 0;
//		for(int i=1; i<=10; i++){
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		
//		// 1~10까지 가로로 출력
//		for (int i=1;i<=10;i++) {
//			if (i == 10) {
//				System.out.print(i);
//			}else {
//				System.out.print(i+",");
//			}
//		}
		
		
		
		
//		//i가 줄어들 경우
//		for(int i=10 ;i>0; i--) {
//			System.out.println(i);
//		}
//		
		
	
		//for 문 안에 (변수선언;조건식;)
		
//		for(int i=1;i<=5;i++) {
//			System.out.println("안녕하세요");
//		}
//		// 1부터 10까지 출력
//		
//		for(int i=1; i<=10;i=i+1) {
//			System.out.println(i);
//	}

		
		
		
		
	}
}