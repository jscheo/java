package day03;

import java.util.Scanner;

public class Ex02_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id = "test";//회원가입한 아이디
		String pw = "1234";//회원가입한 비밀번호
		
		
		while(true) {
			System.out.println("=====로그인=====");
			System.out.print("아이디 입력> ");
			String loginId = sc.next();
			System.out.print("비밀번호 입력> ");
			String loginPw = sc.next();
			
			//아이디와 비밀번호가 같으면 성공 틀리면 실패
			
			if (id.equals(loginId) && (pw.equals(loginPw))) {
				System.out.println("로그인성공");
				break;
			}else {
				System.out.println("로그인실패");
				System.out.print("로그인 재시도?(Y/y)> ");
				String tryLogin = sc.next();
				if (!(tryLogin.equals("Y") || tryLogin.equals("y"))) {

//				if (tryLogin.equals("Y") || tryLogin.equals("y")) {
//					continue;
//				}else {
					break;
					
	
				}
			}
			
			
			
			
			
		}System.out.println("로그인프로그램 종료");
		
		
		
		
		
		
	}

}
