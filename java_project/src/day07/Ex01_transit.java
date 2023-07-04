package day07;

import java.util.Scanner;

public class Ex01_transit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		String[] password = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		
		while(true) {
			int deposit_index = 0;
			int withdraw_index = 0;
			
			System.out.println("=====은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.계좌이체 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				// 예금주, 계좌번호, 초기잔액 입력받기
				System.out.print("예금주> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				
				System.out.print("잔액> ");
				balance[cnt] = sc.nextInt();
				System.out.println(name[cnt]+"님 계좌생성완료");
				cnt++;
			}else if(menu == 2) {
				// 계좌번호, 입금금액 입력받기
				System.out.print("입금 할 계좌번호> ");
				String inAccount = sc.next();
				System.out.print("입금금액> ");
				int inMoney = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(inAccount.equals(account[i])) {
						balance[i] += inMoney;
						find = true;
						break;
					}
				}
				if(find == false) {
					System.out.println("없는 계좌입니다");
				}
				
			}else if(menu == 3) { 
				// 계좌번호, 출금금액 입력받기 * 잔액부족확인
				System.out.print("출금 할 계좌번호> ");
				String outAccount = sc.next();
				System.out.print("출금 금액> ");
				int outMoney = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(outAccount.equals(account[i])) {
						find = true;
						if(balance[i] >= outMoney) {
							balance[i] -= outMoney;
							System.out.println("출금완료");
						}else {
							System.out.println("잔액 부족ㅠㅠㅠ");
						}
					}
				}
				if(!find) {
					System.out.println("없는 계좌입니다");
				}
				
			}else if(menu == 4) {
				// 전체 계좌정보 출력
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("==========================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n",name[i],account[i], balance[i]);
				}
			}else if(menu == 5) {
					//출금계좌
					//입금계좌
					//이체금액
					// 전체 계좌정보 출력
					System.out.print("출금을 원하는 계좌번호를 입력하세요.");
					String outAccount = sc.next();
					boolean find = false;
					
					for(int i=0; i<cnt; i++) {
						if(outAccount.equals(account[i])) {
							find = true;
							System.out.printf("%s님, 출금요청을 도와드리겠습니다.\n 현재 잔액은 %d원입니다.\n",name[i],balance[i]);
							System.out.print("출금금액> ");
							int outMoney = sc.nextInt();
							if(balance[i] >= outMoney) {
								balance[i] -= outMoney;
								System.out.print("입금을 원하는 계좌번호를 입력하세요.>");
								String inAccount = sc.next();
								boolean find1 = false;
								for(int j=0; j<cnt; j++) {
									if(inAccount.equals(account[j])) {
										balance[j] += outMoney;
										System.out.println("출금이 완료되었습니다.");
										find1 = true;
										break;
									}
								}
								if(find1 == false) {
									System.out.println("없는 계좌입니다");
									balance[i] += outMoney;
								}
							}else {
								System.out.println("잔액 부족ㅠㅠㅠ");
							}
						}
					}
					if(!find) {
						System.out.println("없는 계좌입니다");
					}
					
					
					for(int i=0; i<cnt; i++) {
						System.out.printf("%s\t%s\t%,d\n",name[i],account[i], balance[i]);
					}
			}
			else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}



