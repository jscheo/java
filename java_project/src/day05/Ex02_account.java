package day05;

import java.util.Scanner;

public class Ex02_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		int balanceTry = 5;
		while(true) {
			System.out.println("=====인천일보은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목룍 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			//예금주 계좌번호 초기잔액
			if (menu == 1) {
				System.out.print("예금주> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("초기 입금할 금액> ");
				balance[cnt] = sc.nextInt();
				System.out.println("계좌생성이 완료되었습니다.");
				cnt++;
				
			}else if(menu == 2) {
					System.out.print("입금할 계좌번호를 입력해 주세요.");
					String account1 = sc.next();
					boolean find = false;
					for (int i = 0; i <= cnt ;i++) {
						if (account[i].equals(account1)){
							System.out.print("입금 금액을 입력해 주세요.> ");
							balance[i] += sc.nextInt();
							System.out.println("입금이 완료되었습니다.");
							System.out.printf("현재잔액> %d원\n",balance[i]);
							find = true;
							break;
						}
						
				}
					if(find==false) {
						System.out.println("없는 계좌번호입니다.");

					}


				
				//입금할계좌
				//입금 금액
			}else if(menu == 3) {
				//출금할 계좌
				//출금 금액 *잔액부족 표시
			}else if(menu == 4) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("=============================");
				for (int i = 0;i<cnt;i++) {
					System.out.printf("%s\t%s\t%d\n",name[i],account[i],balance[i]);
				}
			}else {
				System.out.println("0~4까지 입력가능");
			}
			
			
			System.out.println();
		}
		
		
		
		
		
		
	}

}
