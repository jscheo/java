package day04;

import java.util.Scanner;

public class Ex07_up_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int answer = (int) (Math.random() * 31) + 1; // 1~31까지 랜덤숫자
		int cnt = 0;
		int total = 11;
//		System.out.println(answer);
		while (true) {
			System.out.println("========Up & Down=======");
			System.out.print("숫자입력> ");
			int num = sc.nextInt();

			// 숫자를 입력했을 때 정답인 경우 정답 작으면 down 높으면 up

			if (cnt == 10) {
				System.out.println("시도횟수를 초과하여 종료합니다.");
				break;
			}

			if (total <= 5) {
				System.out.printf("%d회밖에 안남았어요... 분발하세요!!!\n", total);
			}

			if (num == answer) {
				cnt += 1;
				if (cnt == 1) {
					System.out.println("Perfect!! 첫트만에 성공!");
				}else if (cnt<=3) {
					System.out.println("good!!");
				}else if (cnt<=5) {
					System.out.println("그저그랬슈");
				}
				System.out.println("정답입니다!!!!");
				System.out.println("시도횟수: " + cnt + "회");
				break;
			} else if (num > answer) {
				cnt += 1;
				total -= 1;
				System.out.println("Down!!!!!!");
				System.out.println("시도횟수: " + cnt + "회");
			} else if (num < answer) {
				cnt += 1;
				total -= 1;
				System.out.println("UP!!!!!!!!");
				System.out.println("시도횟수: " + cnt + "회");
			}

			System.out.println();
			
		}System.out.println("게임종료!");
	}

}
