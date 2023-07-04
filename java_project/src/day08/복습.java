package day08;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		
		while(true) {
			System.out.printf("=====자판기===== [현재잔액:%d원]\n",balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.잔돈넣기 0.종료");
			System.out.print("메뉴입력> ");
			int menu = sc.nextInt();
			
			if (menu==1) {
				if (balance>=1000) {
				System.out.println("콜라를 주문합니다.");
				balance -= 1000;
				}else {
					System.out.println("잔액이 부족합니다.");
				}
				
			}else if (menu==2) {
				if (balance>=1200) {
					System.out.println("콜라를 주문합니다.");
					balance -= 1200;
					}else {
						System.out.println("잔액이 부족합니다.");
					}
			}else if (menu==3) {
				if (balance>=1500) {
					System.out.println("콜라를 주문합니다.");
					balance -= 1500;
					}else {
						System.out.println("잔액이 부족합니다.");
					}
			}else if (menu==4) {
				System.out.println("잔액을 충전합니다. 원하시는 금액을 입력해 주세요.");
				System.out.print("금액입력 >");
				int balance1 = sc.nextInt();
				balance += balance1;
				
			}else if (menu==0) {
				System.out.println("종료합니다.");
				break;
				
			}else
				System.out.println("0~4까지의 번호를 입력해 주세요.");
			
			
			
			
		}
		

		
		
		
	}
}
//		while (true) {
//			System.out.print("숫자를 입력해주세요.> ");
//			int num1 = sc.nextInt();
//
//			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//			System.out.print("메뉴선택> ");
//
//			int menu = sc.nextInt();
//
//			System.out.print("숫자를 입력해주세요.> ");
//			int num2 = sc.nextInt();
//
//			if (menu == 1) {
//				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
//			} else if (menu == 2) {
//				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
//			} else if (menu == 3) {
//				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
//			} else if (menu == 4) {
//				System.out.printf("%d / %d = %.2f\n", num1, num2, num1 / (double) num2);
//			} else if (menu == 5) {
//				System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
//			}
//		}
//
//	}


