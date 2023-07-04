package day03;

import java.util.Scanner;

public class Ex04_calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("=====계산기=====");
			System.out.print("첫번째 숫자입력> ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자입력> ");
			int num2 = sc.nextInt();
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				//4 + 2 = 6
				System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
				break;
				
			case 2:
				System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
				break;
			case 3:
				System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));
				break;
			case 4:
				System.out.printf("%d / %d = %.3f\n",num1,num2,(num1/(double)num2));
				break;
				//에러가나는 이유는 %가 겹쳐서 그런데, f형식 사용할때는 %%를 사용하면 됨.
			case 5:
				System.out.printf("%d %% %d = %d\n",num1,num2,(num1%num2));
				break;
				default:
					System.out.println("1~5까지 입력가능");
			}		
			//종료하시겠습니까? break가 두개인데, break는 가장 근접한 while만 빠져나간다. 따라서
			//
			while(true) {
				System.out.print("1.종료 2.새로하기 3.이어하기");
				int end = sc.nextInt();
				if(end==1) {
					run = false;
					break;
				}else if(end == 2) {
					break;
				}else if(end == 3) {
				}else
					System.out.println("1~3까지 입력해주세요");

}
}
}
}
