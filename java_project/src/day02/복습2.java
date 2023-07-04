package day02;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		//로그인 프로그램
		String id = "aa";
		String pw = "1234";
		//로그인 성공, 로그인 실패
		//현재 이 구조에서는 정상적 출력이 안되는데 이유는
		//스트링은 같다를 표현할때 ==를 사용할 수 없음. 
		// 기본자료형 (==), 참조자료형(equals())
		
		
//		if (id == loginId && loginPw == pw) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		//아이디가 틀렸습니다, 비밀번호가 틀렸습니다, 로그인 성공
		// 기본자료형 (==), 참조자료형(equals())
		//equals가 다를 경우 !equals 느낌표를 붙이면 된다.		

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디입력> ");
		String loginId = sc.next();
		System.out.print("비밀번호입력> ");
		String loginPw = sc.next();
		
//		if (loginId.equals(id) && loginPw.equals(pw)) {
//			System.out.println("로그인 성공");
//		}else if (!loginId.equals(id)){
//			System.out.println("아이디가 틀렸습니다.");
//		}else if (!loginPw.equals(pw)){
//			System.out.println("비밀번호가 틀렸습니다.");
//		}
		
		if(loginId.equals(id)) {
			if(loginPw.equals(pw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		
	}
}
		// 숫자를 하나 입력받아, 3의배수, 5의배수, 3과5의배수, 둘다아님 출력
		// 출력예시) 숫자입력> 15 => 3과5의배수
		// 출력예시) 숫자입력> 20 => 5의배수
		// 출력예시) 숫자입력> 7 => 둘다아님
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력>");
//		int a = sc.nextInt();
		
		//계산기프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자입력>");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자입력>");
//		int num2 = sc.nextInt();
//		
//		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//		System.out.print("메뉴선택>");
//		int menu = sc.nextInt();
//		
//		if (menu == 1) {
//			System.out.println(num1 + " + "+ num2 +" = " + (num1 + num2));
//		}else if (menu == 2) {
//			System.out.println(num1 + " - "+ num2 +" = " + (num1 - num2));
//		}else if (menu == 3) {
//			System.out.println(num1 + " * "+ num2 +" = " + (num1 * num2));
//			//double은 실수부분을 뜻함
//		}else if (menu == 4) {
//			System.out.println(num1 + " / "+ num2 +" = " + (num1 / (double)num2));
//		}else if (menu == 5) {
//			System.out.println(num1 + " % "+ num2 +" = " + (num1 % num2));
//		}else {
//			System.out.println("1~5까지 입력해 주세요");
//		}
		
		
//		if(a % 3 == 0 && a % 5 == 0) {
//			System.out.println("3과5의배수");
//		}else if(a % 3 == 0) {
//			System.out.println("3의배수");
//		}else if (a % 5 == 0) {
//			System.out.println("5의배수");
//		}else {
//			System.out.println("둘다아님");
//		}
		
		
//		if (a % 3 == 0) {
//			System.out.println("3의배수");
//		}else if (a % 5 == 0 ) {
//			System.out.println("3과 5의배수");
//		}
//		if (a % 5 == 0) {
//			System.out.println("5의배수");
//		}else if (a % 3 == 0) {
//			System.out.println("3과5의배수");
//		}
//		else {
//			System.out.print("둘다아님");
//		}
		
		
	
		// 숫자를 입력받고, 양수, 음수, 0 출력하시오
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int a = sc.nextInt();
//		
//		if(a > 0) {
//			System.out.println("양수");
//		}
//		if(a < 0) {
//			System.out.println("음수");
//		}
//		if(a == 0) {
//			System.out.println("0입니다");
//		}
		
		// score 90이상 A
		// 		80이상 B
		//		70이상 C
		// 		60이상 D
		// 		60미만 F
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수입력> ");
//		int score = sc.nextInt();
		
		// 숫자하나를 입력받고, 0이아닌 짝수, 홀수, 0
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int num = sc.nextInt();
//		
//		// + - * / %
//		if(num == 0) {
//			System.out.println("0");
//		}else if(num % 2 == 0) {
//			System.out.println("0이 아닌 짝수");
//		}else if(num % 2 == 1) {
//			System.out.println("홀수");
//		}
//	}











