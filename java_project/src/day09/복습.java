package day09;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {

		// 자판기 만들기

		Scanner sc = new Scanner(System.in);
		int balance = 10000;

		while (true) {

			System.out.println("======자판기======  " + "현재잔액: " + balance + "원");
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
			System.out.print("메뉴선택> ");

			int menu = sc.nextInt();
			if (menu == 1) {
				if (balance >= 1000) {
					balance -= 1000;
					System.out.println("콜라제공");
				}else {
					System.out.println("잔액이 부족합니다.");
				}

			} else if (menu == 2) {
				if (balance >= 1200) {
					balance -= 1200;
					System.out.println("사이다제공");
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			} else if (menu == 3) {
				if (balance >= 1500) {
					balance -= 1500;
					System.out.println("우유제공");
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			} else if (menu == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("0~3까지의 숫자를 입력해 주세요.");
			}

		}

	}

}
