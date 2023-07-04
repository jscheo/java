package day04;

import java.util.Scanner;

public class Ex04_calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("=====계산기=====");
			System.out.print("첫번째 숫자입력> ");
			int num1 = sc.nextInt();
			
			String cal = "";
			
			boolean swit = true;
			
			while(swit) {
				System.out.print("연산자 선택> ");
				cal = sc.next();
				if (cal.equals("+")||cal.equals("*")||cal.equals("-")||cal.equals("%")||cal.equals("/")) {
					swit = false;
				}else {
					System.out.println("+,-,%,/,* 중 올바른 연산자를 입력해 주세요.");
				}
			}
			
			
			//dowhile 유일하게 세미콜론이 들어가는 형식
		
			
			
			System.out.print("두번째 숫자입력> ");
			int num2 = sc.nextInt();
			
			
			if (cal.equals("+")) {
					System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			}else if(cal.equals("-")) {
				System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			}else if(cal.equals("*")) {
				System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			}else if(cal.equals("/")) {
				System.out.printf("%d / %d = %.2f\n",num1,num2,num1/(double)num2);
			}else if(cal.equals("%")) {
				System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
			}else {
				System.out.println("올바른 연산자를 입력해 주세요.");
			}
			System.out.println();
			
			
			
			
//			if(menu == 1) {
//				System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
//			}else if(menu == 2) {
//				System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
//			}else if(menu == 3) {
//				System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
//			}else if(menu == 4) {
//				System.out.printf("%d / %d = %.2f\n",num1,num2,num1/(double)num2);
//			}else if(menu == 5) {
//				System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
//			}else {
//				System.out.println("올바른 메뉴를 선택해 주세요.");
//			}
			
			
			

			
			
			
		}
		
		
	}
}
