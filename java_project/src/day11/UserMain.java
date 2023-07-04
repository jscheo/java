package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<User> list =new ArrayList<User>();
		
		while(true) {
			System.out.println("=======회원정보=======");
			System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				User user = new User();
				System.out.print("이름입력> ");
				user.setName(sc.next());
				System.out.print("아이디입력> ");
				user.setId(sc.next());
				System.out.print("비밀번호입력> ");
				user.setPw(sc.next());
				list.add(user);
				System.out.println(user.getName()+"님 회원가입 축하합니다.");
				
			}else if(menu == 2) {
				System.out.print("로그인할 아이디> ");
				String logId = sc.next();
				System.out.print("로그인할 비밀번호> ");
				String logPw = sc.next();
				boolean run = false;
				
				for(int i = 0; i <list.size(); i++) {
					if(logId.equals(list.get(i).getId())) {
						run = true;
						if(logPw.equals(list.get(i).getPw())) {
							System.out.println("로그인 성공");
							break;
						}else {
							System.out.println("로그인 실패");
						}
					}
				}
				if(!run) {
					System.out.println("아이디가 틀렸습니다.");
				}
			}else if(menu == 3) {
				System.out.println("이름\t아이디\t비밀번호\t가입날짜");
				System.out.println("==========================================");
				for(int i = 0; i <list.size(); i++) {
					list.get(i).print();
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시선택");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
