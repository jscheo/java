package day07;

import java.util.Scanner;

public class 복습2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000;
		String[] product = new String[100];
		//,를 붙인다는것은 돈단위를 셀때 콤마를 써준다. 
		int cnt = 0;
		int cola = 0;
		int cider = 0;
		int milk = 0;
		while (true) {
			System.out.printf("=====자판기=====[%,d]원\n", balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.구매목록 0.종료");
			System.out.print("메뉴선택> ");
			
			int menu = sc.nextInt();
			
			//콜라선택 or 사이다선택 or 우유선택 or 반복문 종료
			
			if (menu == 1) {
				System.out.println("콜라선택");
				if (balance>=1000) {
				balance -= 1000;
				product[cnt] = "콜라";
				cnt++;
				cola++;
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			}else if (menu == 2) {
				System.out.println("사이다선택");
				if (balance>=1200) {
				balance -= 1200;
				product[cnt] = "사이다";
				cider++;
				cnt++;
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			}else if (menu == 3) {
				System.out.println("우유선택");
				if (balance>=1500) {
					milk++;
					balance -= 1500;
					product[cnt] = "우유";
					cnt++;
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			}else if(menu==4){
				System.out.println("구매목록\t수량");
				System.out.println("======================================");
				System.out.printf("콜라\t%d\n",cola);
				System.out.printf("사이다\t%d\n",cider);
				System.out.printf("우유\t%d\n",milk);

				
				//결과물 출력시 콜라 사이다 우유 없으면 0
				
			}else if (menu == 0){
				break;
			}else {
				System.out.println("올바른 번호를 입력해 주세요");
			}
			}
			System.out.println();
			
			
			
			System.out.println("종료합니다");
	}

		
		
	}