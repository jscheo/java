package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<User> a = new ArrayList<User>();
		
		while(true) {
			System.out.println("======로그인=====");
			System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("이름입력> ");
				String name = sc.next();
				System.out.println("아이디 입력> ");
				String id = sc.next();
				System.out.println("비밀번호 입력> ");
				String pw = sc.next();
				User login = new User();
				
			}else if(menu == 2) {
				
			}else if(menu == 3) {
				
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