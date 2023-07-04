package ex01;

import java.util.Scanner;

public class Dimension {
	public static void run() {
		String[] names = new String[22];
		String[] addresses = new String[22];
		
		Scanner s = new Scanner(System.in);
		boolean run = true;
		int index = 0;
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.주소등록 | 2.주소목록 | 0.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			String menu = s.nextLine(); //line을 해야지 엔터쳤을 때 입력됨 중간에 공백 및 띄어쓰기를 
										//해도 하나의 값으로 받아드림
										// 입력할 때 까지 기다려주는 개념
			
			switch(menu) {
			case "0":
				run = false;
				System.out.println("프로그램 종료");
				break;
			case "1":
				System.out.print("이름>");
				String name = s.nextLine();
				names[index] = name;
				System.out.print("주소> ");
				String address = s.nextLine();
				addresses[index] = address;
				index++;
				System.out.println(index+"명 입력완료!");
				break;
			case "2":
				for(int i =0; i<index; i++) {
					System.out.printf("%d\t%s\t%s\n",i+1, names[i],addresses[i]);
				}
				break;
			default:
				System.out.println("다시입력");
			}
		}
		
		
	}
}
