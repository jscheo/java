package day06;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 31) + 1;
		System.out.println(answer);

		// while문으로 up&down 게임 만들기

		// 반복문으로 입력받기
		// answer보다 크면 down answer보다 작으면 up 맞으면 break
		int cnt = 0;
		int try1 = 5;
		while (true) {
			System.out.println("=====UP&DOWN=====");
			System.out.print("숫자입력> ");
			int a = sc.nextInt();
			try1 -= 1;
			cnt++;
			if (try1 == 0) {
				System.out.println("시도횟수를 초과하여 종료합니다");
				break;
			} else {
				System.out.printf("남은 시도횟수> %d회\n", try1);
			}
			if (a == answer) {
				System.out.println("정답입니다!");
				System.out.printf("시도횟수 > %d회\n", cnt);
				break;
			} else if (a > answer) {
				System.out.println("DOWN!!!!!");
			} else if (a < answer) {
				System.out.println("UP!!!");
			}System.out.println();

		}
	}

}
