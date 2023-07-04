package day08;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		
		
		
		while(true) {
			boolean find = false;
			System.out.println("=====은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.println("계좌를 생성합니다.");
				System.out.println("이름입력> ");
				String name1 = sc.next();
				name[cnt] = name1;
				System.out.println("계좌번호 입력> ");
				String account1 = sc.next();
				account[cnt] = account1;
				System.out.println("생성완료");
				cnt++;
				
			}else if (menu == 2) {
				while(find == false) {
					System.out.println("입금을 진행합니다. 계좌번호를 입력해 주세요.");
					System.out.print("계좌입력> ");
					String out_account = sc.next();
					for (int i = 0;i<cnt;i++) {
						if (out_account.equals(account[i])){
							System.out.println(name[i]+"님 환영합니다. 현재잔액은"+balance[i]+"원입니다.");
							System.out.print("입금금액 입력>");
							int deposit = sc.nextInt();
							balance[i] += deposit;
							System.out.println("입금이 완료되었습니다. 현재잔액은 "+balance[i]+"원입니다.");
							find = true;
							break;
						}else {
							find = false;
						}
					}if(find == false) {
						System.out.println("계좌번호가 없습니다. 다시 입력해 주세요.");
					}
				}
				
			}else if (menu == 3) {
				while(find == false) {
					System.out.println("출금을 진행합니다. 계좌번호를 입력해 주세요.");
					System.out.print("계좌입력> ");
					String out_account = sc.next();
					for (int i = 0;i<cnt;i++) {
						if (out_account.equals(account[i])){
							System.out.println(name[i]+"님 환영합니다. 현재잔액은"+balance[i]+"원입니다.");
							System.out.print("출금금액 입력>");
							int withdraw = sc.nextInt();
							if (balance[i]>=withdraw) {
								balance[i]-=withdraw;
								System.out.println("출금이 완료되었습니다. 현재잔액은 "+balance[i]+"원입니다.");
								find = true;
								break;
							}else {
								System.out.println("잔액이 부족합니다.");
							}
						}
					}if(find == false) {
						System.out.println("계좌번호가 없습니다. 다시 입력해 주세요.");
					}
				}
			}else if (menu == 4) {
				System.out.println("=====계좌목록=====");
				System.out.println("이름\t계좌번호\t잔액");
				for(int i = 0;i < cnt;i++) {
					System.out.printf("%s\t%s\t%d\n",name[i],account[i],balance[i]);

				}
					
				
				
			}else if (menu == 0) {
				System.out.println("프로그램 종료");
				break;
				
			}else {
				System.out.println("0~4까지 수를 입력해 주세요.");
			}
				
			
			
		
		}
		
		
	}

}
