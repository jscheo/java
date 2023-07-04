package day06;

import java.util.Scanner;

public class Ex01_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];

		String pw = "1234";

		int cnt = 0;
		// 계좌생성하기 이름,계좌번호,잔액 입력받기.
		// 계좌입금하기 계좌번호를 찾고, 해당되는 계좌번호에 잔액 입금하기.
		// 계좌출금하기 계좌번호를 찾고, 해당되는 계좌번호에 잔액 출금하기.
		
		//이체기능 추가하기
		//1.내 계좌를 입력한다.
		//내 계좌의 i값을 저장
		//2.상대계좌를 입력한다.
		//상대계좌의 i값을 저장
		//3.이체금액을 입력한다.
		//4.내계좌잔액을 출금한다.
		//5.상대계좌에 잔액을 입금한다.
		
		
		while (true) {
			System.out.println("=====은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌이체 5.관리자모드 0.종료");

			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("이름을 입력하세요.>");
				name[cnt] = sc.next();
				System.out.print("계좌번호를 입력하세요.>");
				account[cnt] = sc.next();
				System.out.print("금액을 입력하세요.>");
				balance[cnt] = sc.nextInt();
				System.out.printf("현재잔액 : %,d원\n", balance[cnt]);
				System.out.println("계좌생성 완료!");
				cnt++;
			} else if (menu == 2) {
				System.out.print("계좌번호를 입력해 주세요.>");
				String account_1 = sc.next();
				System.out.print("금액을 입력해 주세요.>");
				int balance_1 = sc.nextInt();
				// 계좌번호 찾기
				boolean find = false;
				for (int i = 0; i < cnt; i++) {
					if (account[i].equals(account_1)) {
						balance[i] += balance_1;
						System.out.println("입금이 완료되었습니다.");
						System.out.printf("현재잔액: %,d원\n", balance[i]);
						find = true;
						break;
					}
				}
				if (find == false) {
					System.out.println("계좌번호가 틀립니다. 다시 입력해 주세요.");
				}

			} else if (menu == 3) {
				System.out.print("계좌번호를 입력해 주세요.>");
				String account_1 = sc.next();
				// 계좌번호 찾기
				boolean find = false;
				for (int i = 0; i < cnt; i++) {
					if (account[i].equals(account_1)) {
						while (true) {
							System.out.print("출금금액을 입력해 주세요.>");
							int balance_1 = sc.nextInt();
							if (balance[i] >= balance_1) {
								balance[i] -= balance_1;
								System.out.println("출금이 완료되었습니다.");
								System.out.printf("현재잔액: %,d원\n", balance[i]);
								find = true;
								break;
							} else {
								System.out.println("잔액이 부족합니다.");
							}
						}
					}
				}
				if (find == false) {
					System.out.println("계좌번호가 틀립니다. 다시 입력해 주세요.");
				}

			} else if (menu == 0) {
				break;
			} else if (menu == 5) {
				boolean loginSuccess = false;
				System.out.println("관리자모드에 진입했습니다.");
				System.out.print("비밀번호를 입력해 주세요. >");
				String pw_1 = sc.next();
				if (pw.equals(pw_1)) {
					loginSuccess = true;
					while (loginSuccess) {
						System.out.println("1.고객리스트 2.계좌전체삭제 0.종료");
						int menu1 = sc.nextInt();
						if (menu1 == 1) {
							System.out.println("고객리스트를 출력합니다.");
							System.out.println("고객이름\t계좌번호\t예금잔고");
							System.out.println("=====================================");
							for (int i = 0; i < cnt; i++) {
								System.out.printf("%s\t%s\t%,d\n", name[i], account[i], balance[i]);
							}
						} else if (menu1 == 2) {
							System.out.println("계좌를 전체삭제합니다.");

							for (int i = 0; i < cnt; i++) {
								name[i] = null;
								account[i] = null;
							}
							cnt = 0;
							break;
						} else if (menu1 == 0) {
							break;
						}
					}
					System.out.println();
				} else {
					System.out.println("비밀번호가 틀렸습니다. 초기화 진행합니다.");
					System.out.println();
				}

			} else if(menu ==3) {
				System.out.println("=====계좌이체=====");
				System.out.print("계좌번호를 입력해 주세요.>");
				String account_1 = sc.next();
				// 계좌번호 찾기
				boolean findWithdraw = false;
				for (int i = 0; i < cnt; i++) {
					if (account[i].equals(account_1)) {
						while (true) {
							System.out.printf("%s님 환영합니다! 현재잔액은 [%d]원입니다.",name[i],balance[i]);
							System.out.print("출금금액을 입력해 주세요.>");
							int balance_1 = sc.nextInt();
							if (balance[i] >= balance_1) {
								balance[i] -= balance_1;
								System.out.println("출금이 완료되었습니다.");
								System.out.printf("현재잔액: %,d원\n", balance[i]);
								findWithdraw = true;
								break;
							} else {
								System.out.println("잔액이 부족합니다.");
							}
						}
					}
				}
				if (findWithdraw == false) {
					System.out.println("계좌번호가 틀립니다. 다시 입력해 주세요.");
				}
				System.out.println("계좌번호를 입력해 주세요.");
				String account_2 = sc.next();
				
				
				
				
				
				
				System.out.println("0~3까지의 숫자를 입력해 주세요.");
			}
		}
	}
}
