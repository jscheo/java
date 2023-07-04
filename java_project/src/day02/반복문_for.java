package day02;

import java.util.Scanner;

public class 반복문_for {
	public static void main(String[] args) {
//		for(int i = 10; i<20 ; i++) { // i=i+1
//			System.out.println("안녕하세요");
//		}
////		for (int i=3; i<=100; i=i+1) {
////			System.out.println(i);
//		}
//		for(int i=0; i<10; i=i+2)
//			System.out.println(i);
	
		// 1~100까지 짝수출력
//		for(int i=0; i<=100;i=i+2) {
//			
//			System.out.println(i);
			
		// 1~100까지 홀수출력
//		for(int i=1;i<=100;i=i+2) {
//			System.out.println(i);
//			
//
//		
//		
//		}
	
		//1~10까지 가로로 출력하는데
		// 출력예시) 1,2,3,4,5,6,7,8,9,10
//		for(int i=1;i<=10;i++) {
//			if(i==10) {
//			System.out.print(i);
//			}else {
//				System.out.print(i+",");
//				
//			}
//		}
			
		//1~10까지의 합출력
//		int sum = 0;
//		for (int i=1;i<=10;i++) {
//			System.out.println(sum=sum+i);
//		}
		
		// 구구단출력
//		int dan = 6;
//		for (int i = 1; i<20; i++) {
//			System.out.println(dan+ " * "+ i +" = "+ (dan*i));
//		}

		
		//1~100까지 3의 배수 갯수 출력
		
//		int cnt = 0;
//		
//		for (int i = 1; i<=100; i++) {
//			if (i % 3 == 0) {
//				cnt = cnt + 1;
//			}
//	
//		}
//		System.out.println(cnt+1);
//		
		
		
		
		// 1~100까지 3의 배수 갯수, 5의 배수 갯수
//		int cnt1 = 0;
//		int cnt2 = 0;
//		for (int i = 1; i<=100; i++) {
//			if (i % 3 == 0){
//				cnt1 = cnt1+1;
//			}
//			if (i % 5 == 0) {
//				cnt2 = cnt2+1;
//			}
//				
//		}
//		
//		System.out.println("3의 배수 "+cnt1+"개");
//		System.out.println("5의 배수 "+cnt2+"개");

		
		//입력받은 두 숫자의 총 합
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 부터>");
//		int a = sc.nextInt();
//		System.out.print("몇 까지>");
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		
//		for (int i = a; i<=b; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
			
		
		// 피즈버즈
		//입력받은 수부터 입력받은 수까지 출력하는데, 3의 배수는 피즈 5의배수는 버즈 3과5의배수는 피즈버즈
		//예시)
		//1
		//2
		//피즈
	
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 부터>");
		int a = sc.nextInt();
		System.out.print("몇 까지>");
		int b = sc.nextInt();
		
//		for (int i = a; i<=b ; i++) {
//			if (a % 3 == 0) {
//		}
//				System.out.print('피즈');
//			}
//			}
//			if (a % 5 == 0) {
//				System.out.print('버즈');
//			}else {
//				System.out.println(i);
			
		for (int i = a; i<=b ; i ++) {
			if (i % 15 == 0) {
				System.out.println("피즈버즈");
			}else if (i % 3 == 0) {
				System.out.println("피즈");
			}else if (i % 5 == 0) {
				System.out.println("버즈");
			}else{
				System.out.println(i);
			}
			
		}
		
		
		
	}
	
	
	
	
	
		
	
}

	
