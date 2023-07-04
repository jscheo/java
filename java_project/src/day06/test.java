package day06;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto = new int[6];
		for(int j = 0;j<lotto.length;j++) {
			int a = (int)(Math.random()*9)+1;
			boolean find = false;
			
			//처음값은 {0,0,0,0,0,0}
			//지금 식을 시각화시키면
			//lotto[0]=a
			//lotto[1]=a
			//lotto[2]=a
			//lotto[3]=a
			//lotto[4]=a
			//lotto[5]=a

			만약 lotto[1]== a라면
					find가 true로 바뀌고 for문을 빠져나온다.
			
			
			for(int i=0;i<lotto.length;i++) {
				if(a == lotto[i]) {
					find = true;
					break;
				}
			}
			if(!find) {
				lotto[j] = a;
			}else {
				j=j-1;
			}	
		}
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);
			
		
		
		// lotto배열에 종복없이 1~9까지 값 넣기.
		//1. 첫번째 열에 1~9까지 숫자를 뽑아낸다.
			
		//2. 두번째 열에 1번째 열부터 6번째 열까지 숫자중 겹치지 않으면 1~9까지 숫자 중 1열이 아닌 값만 뽑아낸다.
		//3. 세 번째 열에 1~9까지 숫자 중 1,2열이 아닌 값만 뽑아낸다.
		
//		늘어나는수 = 1~6번째 숫자
//		뽑는수 = 1~9번째 숫자
//		if 출력한 값이 lotto[i]이라면 출력을 다시함.

		
		
	
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int[] number = new int[3];
//
//		int[] lottery = { 24, 44, 15 };
//
//		int cnt = 0;
//
//		System.out.print(">");
//		// 0부터 10까지 이중for문
//
//		for (int i = 0; i < 1000000; i++) {
//			sc.next
//			for (int j = 0; j < number.length; j++) {
//				number[j] = (int) (Math.random() * 45) + 1;
//				System.out.print(number[j] + " ");
//				cnt++;
//				if (number[0] == number[1] && number[1] == number[2]) {
//					System.out.println("정답");
//					break;
//
//				}
//			}
//
//		}

	}
	}

