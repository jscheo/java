package day04;

import java.util.Scanner;

public class Ex02_login {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String id = "test";
		String pw = "1234";
		
		while(true) {
			System.out.println("=====로그인=====");
			System.out.print("로그인할아이디> ");
			String loginId = sc.next();
			System.out.print("로그인할비밀번호> ");
			String loginPw = sc.next();
			
			if (loginId.equals(id) && loginPw.equals(pw)) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("로그인 실패 \n재시도?(Y/y)>");
				String re = sc.next();
				if (re.equals("Y")|| re.equals("y")){
					continue;
				}else {
					break;
				}
			}
		}System.out.println();
	}
}
