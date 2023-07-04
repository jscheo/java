package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		
		while(true) {
			System.out.println("======학사관리시스템======");
			System.out.println("1.학생등록 2.학생리스트 3.학생검색 0.종료");
			System.out.print("메뉴> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Student s = new Student();
				System.out.print("학번> ");
				s.setNo(sc.next());
				System.out.print("이름> ");
				s.setName(sc.next());
				System.out.print("학과> ");
				s.setDept(sc.next());
				System.out.print("학년> ");
				s.setYear(sc.nextInt());
				System.out.print(s.getName()+"학생등록 완료");
				list.add(s);
				
			}else if(menu == 2) {
				System.out.println("학번\t이름\t학과\t학년");
				System.out.println("=======================");
				for(int i = 0; i<list.size(); i++) {
//					System.out.println(list.get(i).getNo()+"\t"+list.get(i).getName()
//							+"\t"+list.get(i).getDept()+"\t"+list.get(i).getYear());
					list.get(i).print();
				}
			}else if(menu == 3) {
				System.out.println("조회할 학번> ");
				String searchNo =sc.next();
				boolean find = false;
				for(int i = 0; i<list.size(); i++) {
					if(searchNo.equals(list.get(i).getNo())) {
						list.get(i).print();
						find = true;
						break;
					}
				}
				if(!true) {
					System.out.println("조회할수없는 학번입니다.");
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
