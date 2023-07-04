package ex01;

import java.util.Scanner;

public class Address {
	public static void run() {
		Student[] students = new Student[5];
		Scanner s = new Scanner(System.in);
		boolean run = true;
		int count = 0;

		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.주소등록 | 2.주소목록 | 3.주소검색 | 4.주소수정 | 0.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			String menu = s.nextLine();//line을 해야지 엔터쳤을 때 입력됨 중간에 공백 및 띄어쓰기를 해도 하나의 값으로 받아드림
			// 입력할 때 까지 기다려주는 개념

			switch(menu) {
			case "0":
				run = false;
				System.out.println("프로그램 종료");
				break;
			case "1":
				Student student = new Student();
				student.setSno("2023"+count+1);
				System.out.println("학번> "+ student.getSno());
				System.out.print("이름> ");
				student.setSname(s.nextLine());
				System.out.print("주소> ");
				student.setAddress(s.nextLine());
				students[count] = student;
				count++;
				System.out.println(count+"명 학생등록");

				break;
			case "2":
				for(int i = 0; i <count; i++) {
					Student stu = students[i];
					System.out.println(stu.toString());
				}
				break;
			case "3":
				System.out.print("검색할 이름> ");
				String search =s.nextLine();
				boolean find = false;

				for(int i = 0; i<count; i++) {
					Student stu = students[i];
					if(search.equals(stu.getSname())) {
						System.out.println(stu.toString());
						find = true;
					}
				}
				if(!find) System.out.println(search + "학생이 존재하지 않습니다.");
				break;
			case "4":
				System.out.print("수정할 이름> ");
				String update = s.nextLine();
				find = false;
				for(int i = 0; i < count; i++) {
					Student stu = students[i];
					if(update.equals(stu.getSname())) {
						find = true;
						System.out.println("이름: "+stu.getSname());
						System.out.println("주소: "+stu.getAddress());
						System.out.print("새로운 주소> ");
						String newAddress = s.nextLine();
						if(newAddress != "") {
							stu.setAddress(newAddress);
							System.out.println("새로운 주소로 변경되었습니다.");
						}
					}
				}
				if(!find) System.out.println(update+ "이름이 존재하지 않습니다.");
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!");
			}//switch
		}//while	
	}//run
}//class
