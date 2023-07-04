package day07;

import java.util.Scanner;

public class Ex011_login_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		int[] account = new int[10];
		int[] balance = new int[10];
		int cnt =0;
		boolean idMakeSuccess = true;
		boolean login = false;
		int loginIndex = -1;
		
		
		while(true) {
			System.out.println("현재 계좌갯수: "+cnt);
			System.out.println("=====스마트뱅킹=====");
			
			if (!(loginIndex==-1)) {
				System.out.println("1.마이페이지 2.로그아웃 3.입금 4.출금 5.계좌이체 0.종료");
			}else {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			}
			int menu = sc.nextInt();
			if (login) {
				if (menu == 1) {
					System.out.println("종료합니다.");
					loginIndex = -1;
				}
			}else {
			if (menu == 1) {
			    while (idMakeSuccess) {
			        System.out.print("아이디입력> ");
			        String id1 = sc.next();
			        
			        boolean isDuplicate = false; // 중복 여부를 나타내는 변수

			        for (int i = 0; i <= cnt; i++) {
			            if (id1.equals(id[i])) {
			                isDuplicate = true;
			                break;
			            }
			        }
			        if (isDuplicate) {
			            System.out.println("아이디가 중복됩니다. 다른 아이디를 입력해 주세요.");
			        } else {
			            id[cnt] = id1;
			            idMakeSuccess = false;
			        }
			    }
			    System.out.print("성함을 입력해 주세요.");
			    String name1 = sc.next();
			    name[cnt] = name1;
				System.out.print("비밀번호를 입력해 주세요.");
				String pw1 = sc.next();
				pw[cnt] = pw1;
				System.out.print("입금금액을 입력해 주세요.");
				int balance1 = sc.nextInt();
				balance[cnt]+= balance1;
				System.out.println("회원가입이 완료되었습니다. 축하합니다.");
				account[cnt] = (int)(Math.random() * (100000 -90000+1) + 90001);
				System.out.println("계좌번호는 "+account[cnt]+" 입니다.");
				cnt++;
				idMakeSuccess = true;
			}else if(menu == 2) {
				if (login) {
					login = false;
					System.out.println("로그아웃을 진행합니다.");
					loginIndex = -1;
				}else {
					System.out.print("아이디를 입력해 주세요> ");
					System.out.print("아이디입력> ");
					String loginId = sc.next();
					System.out.print("비밀번호입력> ");
					String loginPw= sc.next();
					boolean find = false;
					
					for(int i=0; i<cnt; i++) {
						if(loginId.equals(id[i])){
							find = true;
							if(loginPw.equals(pw[i])) {
								System.out.println(name[i]);
								System.out.println(name[i]+"님 반갑습니다");
								login = true;
								loginIndex = i;
								break;
							}else {
								System.out.println("비밀번호가 틀렸습니다");
								break;
							}
						}
					}
					
					if(!find) {
						System.out.println("아이디가 틀렸습니다");
					}
				}
			
				
			}else if(menu == 3) {
				if (login) {
					
				}else {
					System.out.println("=====계좌정보=====");
					System.out.println("이름\t계좌번호\t아이디\t비밀번호\t잔액\t");
					for(int i = 0;i<cnt;i++) {
					System.out.print("%s \t %d \t %s \t %s \t %d \n",name[i],account[i],id[i],pw[i],balance[i]);
					}
				}
				
			}else if(menu == 4) {
				
			}else if(menu == 5) {
				
			}else if(menu == 0) {
				break;
			}
			System.out.println();
			
			
			
		}
		}
		System.out.println("스마트뱅킹 종료!");
		
	
		
		
		
		
	}

}
