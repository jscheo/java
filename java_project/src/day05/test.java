package day05;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("======자판기======");
			System.out.println("1.콜라 2.사이다 3.우유 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("콜라 선택");
			} else if (menu == 2) {
				System.out.println("사이다 선택");
			} else if (menu == 3) {
				System.out.println("우유 선택");
			} else if (menu == 0) {
				run = false; // break 대신에 종료로 사용할 수 있음
								// 빠저 나오지 않고 반복문을 계속 실행 하지만 run이 false이므로 코드가 실행이 안됨
				// break; // 만나면 반복문이 빠저나옴
			} else {
				System.out.println("0~3까지 입력가능");
			}

			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}