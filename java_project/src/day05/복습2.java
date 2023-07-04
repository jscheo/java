package day05;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int balance = 0;

		while (true) {
			System.out.printf("=====자판기=====[잔액:%d원]\n", balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
			System.out.print("메뉴선택> ");
			int num = sc.nextInt();
			if (num == 1) {
				if (balance >= 1000) {
					System.out.println("콜라제공");
					balance -= 1000;
				} else {
					System.out.println("잔액부족");
				}
			} else if (num == 2) {
				if (balance >= 1200) {
					System.out.println("사이다제공");
					balance -= 1200;
				} else {
					System.out.println("잔액부족");
				}
			} else if (num == 3) {
				if (balance >= 1500) {
					System.out.println("우유제공");
					balance -= 1500;
				} else {
					System.out.println("잔액부족");
				}
			} else if (num == 0) {
				System.out.println("자판기 시스템 종료");
				break;
			} else if (num == 4) {
				System.out.println("충전할 금액을 투입해주세요.");
				System.out.print("충전금액> ");
				int money = sc.nextInt();
				balance += money;
			}

			else {
				System.out.println("0~4까지 올바른 숫자를 입력해 주세요.");
			}

		}

	}

}
