package day04;

import java.util.Scanner;

public class Ex05_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=====sort=====");

			System.out.print("첫번째숫자>");
			int num1 = sc.nextInt();
			System.out.print("두번째숫자> ");
			int num2 = sc.nextInt();

			System.out.print("1.오름차순 2.내림차순 0.종료");
			System.out.print("선택> ");
			int menu = sc.nextInt();

			//다른방법은 num1,num2의 두개의 값을 바꾸는 방법인데, 이렇게 아얘 값을 바꿔쓰면 된다.
			
			if(menu == 1) {
				if(num1 > num2) {
					int temp = num1;
					num1 = num2;
					num2 = temp;
				}
				for(int i=num1; i<=num2; i++) {
					System.out.println(i);
				}
			}else if(menu == 2) {
				if(num1 < num2) {
					int temp = num1;
					num1 = num2;
					num2 = temp;
				}
				for(int i=num1; i>=num2; i--) {
					System.out.println(i);
				}
			}else if(menu == 0) {
				break;
			}
			
			
			
			
//			if (menu == 1) {
//				if (num2 >= num1) {
//					for (int i = num1; num2 >= i; i++) {
//						System.out.println(i);
//					}
//				} else if (num1 >= num2) {
//					for (int i = num2; num1 >= i; i++) {
//						System.out.println(i);
//					}
//				}
//			} else if (menu == 2) {
//				if (num2 >= num1) {
//					for (int i = num2; i >= num1; i--) {
//						System.out.println(i);
//					}
//				} else if (num1 >= num2) {
//					for (int i = num1; i >= num2; i--) {
//						System.out.println(i);
//					}
//				}
//			} else if(menu == 0) {
//				break;
//			}
		}
	}
}


