package ex01;

import java.util.Scanner;

public class Repeat {
	public static void run() {
		//반복문 (while, for)
		Scanner s = new Scanner(System.in);
		boolean run = true;

		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.100까지의합 | 2.100까지 짝수합 | 3.100까지 홀수합 | 0.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("메뉴선택> ");
			String menu = s.nextLine();
			int sum = 0;
			
			switch(menu) {
			case "0":
				System.out.println("프로그램 종료");
				run = false;
				break;
			case "1":
				for(int i = 1; i <=100; i++) {
					sum += i;
				}
				System.out.println("1~100까지의 합:"+sum);
				break;
			case "2":
				for(int i = 2; i <=100; i+=2) {
					sum += i;
				}
				System.out.println("1~100까지의 짝수합:"+sum);
				break;
			case "3":
				for(int i = 1; i <=100; i+=2) {
						sum += i;
				}
				System.out.println("1~100까지의 홀수합:"+sum);
				break;
			default:
				System.out.println("다시입력");
			}
		}
	}
}
