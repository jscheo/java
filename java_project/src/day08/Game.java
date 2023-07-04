package day08;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		String[] yoot = { "도", "개", "걸", "윷" };
		int[] result1 = { 0, 0, 0, 0 };
		int[] vertex = {0, 0, 0, 0};
		


		int end_count = 16;
		int sum = 0;
		int vertex1 = 4;
		int vertex1_1 = 6;
		int vertex2 = 8;
		boolean winner = true;
		

		while (winner) {
			for (int i = 1; i <= 4; i++) {
				System.out.println("윳을 던져주세요!");
				System.out.print("엔터키 입력> ");
				String throw1 = sc.nextLine();
				int result = (int) (Math.random() * 4+1);
				System.out.printf("플레이어 %d 는 %s 이(가) 나왔습니다!\n", i, yoot[result-1]);
				result1[i-1] += result;
			}
			for (int i = 0; i < 4; i++) {
				if (result1[i] == end_count) {
					System.out.printf("축하합니다! 플레이어 %d가 우승했습니다!\n", i+1);
					winner = false;
				}
				if (result1[i] == vertex1) {
					vertex[i]=1;
					System.out.printf("%s 플레이어가 첫번째 꼭지점 도착! 대각선으로 이동합니다.\n",i+1);
					}
				}
			for (int i = 0; i < 4; i++) {
				if(vertex[i] == 1) {
					if (result1[i] == vertex1_1) {
						System.out.printf("%s 플레이어가 첫번째 의 두번째 꼭지점 도착! 대각선으로 이동합니다.\n",i+1);
						vertex[i] = 2;
					}else {
						if (result1[i] >= 12) {
							System.out.printf("축하합니다! 플레이어 %d가 우승했습니다!\n", i+1);
							winner = false;
						}
					}
				}
			}
			for (int i = 0; i < 4; i++) {
				if(vertex[i] == 2) {
					if (result1[i] >= 8) {
						System.out.printf("축하합니다! 플레이어 %d가 우승했습니다!\\n", i+1);
						winner = false;
					}
				}
			}
			
			
			
			
			for (int i = 0; i < 4; i++) {
				if ((result1[i] == vertex2)&&(vertex[i] == 0)) {
					vertex[i] = 3;
					System.out.printf("%s 플레이어가 세번째 꼭지점 도착! 대각선으로 이동합니다.\n",i+1);
				}
			}
			
			for (int i = 0; i < 4; i++) {
				if (vertex[i] == 3) {
					if (result1[i] >= 12) {
						System.out.printf("축하합니다! 플레이어 %d가 우승했습니다!\n", i+1);
						winner = false;
					}
				}
			}
			
			
			
			System.out.printf("현재 말의 위치는 다음과 같습니다. \n 1번말 %d[%d] 2번말 %d[%d] 3번말 %d[%d] 4번말 %d[%d]\t", result1[0],vertex[0], result1[1],vertex[1], result1[2],vertex[2],
					result1[3],vertex[3]);
			System.out.println();
		}
			

		}

}


