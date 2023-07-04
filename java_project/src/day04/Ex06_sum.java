package day04;

import java.util.Scanner;

public class Ex06_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=====sum=====");
			System.out.println("1.총합 2.짝수의합 3.홀수의합 0.종료");
			System.out.print("입력> ");
			int menu = sc.nextInt();
			if (menu == 0) {
				break;
			}
			System.out.print("첫번째수입력> ");
			int num1 = sc.nextInt();
			System.out.print("두번째수입력> ");
			int num2 = sc.nextInt();

			int sum = 0;
			int sum2 = 0;
			int sum1 = 0;

			if (num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			if (menu == 1) { // 총합
				for (int i = num1; i <= num2; i++) {
					sum += i;
				}
				System.out.println(sum);
			} else if (menu == 2) { // 짝수의합
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 0) {
						sum2 += i;
					}
				}
				System.out.println(sum2);

			} else if (menu == 3) { // 홀수의합
				for (int i = num1; i <= num2; i++) {
					if (i % 2 != 0 ) {
						sum1 += i;
					}
				}
				System.out.println(sum1);
			} else if (menu == 0) {
				break;
			}
		}
	}
}
