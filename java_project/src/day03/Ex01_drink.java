package day03;

import java.util.Scanner;

//앞으로 작성할 때 클래스이름은 무조건 대문자이다.
public class Ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0; // 잔액
		System.out.print("금액을 투입해주세요. 투입금액 :");
		balance += sc.nextInt();
		
		while(run) {
			System.out.println("=====자판기===== 잔액 : "+balance+"원");
			//잔액 넣는기능 추가하기
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.잔액반환 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if (balance >= 1000) {
					balance -= 1000; // balance -= 1000
					System.out.println("콜라선택");
					break;
				}else {
					System.out.println();
					System.out.println("잔액부족");
					System.out.print("금액을 투입해주세요. 투입금액 : ");
					balance += sc.nextInt();
					break;
				}
			case 2:
				if (balance >= 1200) {
					balance -= 1200; // balance -= 1000
					System.out.println("사이다선택");
					break;
				}else {
					System.out.println();
					System.out.println("잔액부족");
					System.out.print("금액을 투입해주세요. 투입금액 : ");
					balance += sc.nextInt();

					break;
				}
			case 3:
				if (balance >= 1500) {
					balance -= 1500; // balance -= 1000
					System.out.println("우유선택");
					break;
				}else {
					System.out.println();
					System.out.println("잔액부족");
					System.out.print("금액을 투입해주세요. 투입금액 : ");
					balance += sc.nextInt();
					break;
				}
				
			case 4:
				System.out.print("잔액을 반환합니다. 반환금액 :");
				balance -= sc.nextInt();
				System.out.print("현재잔액: "+ balance+"원");
				break;
				
			case 0:
				run = false;
				break;
				default:
					System.out.println("0~3까지 입력가능");
			
			}
			System.out.println();
			
			
		}System.out.println("종료합니다.");

		
		
		
		
		
	}

}
