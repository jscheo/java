package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address1 {
	public static void run() {
		List<Student> array = new ArrayList<>();
		
		Student stu = new Student("20231","홍길동","인천 서구 경서동");
		array.add(stu);
		stu = new Student("20232","심청이","인천 부평구 계산동");
		array.add(stu);
		stu = new Student("20233","강감찬","서울 강서구 화곡동");
		array.add(stu);
		
		Scanner s = new Scanner(System.in);
		boolean run = true;
		

		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.주소등록 | 2.주소목록 | 3.주소검색 | 4.주소수정 | 5.주소 삭제 0.종료");
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
				stu = new Student(); // 위에서 한번 지정해주면 클래스명을 안써줘도 된다. 새로운 데이터를 넣어줄 거니까 넣어줄 공간을 지정해줘야한다.
									//이렇게 안하면 위에 설정한 곳에 들어감
				stu.setSno("2023"+(array.size()+1));
				System.out.println("학번>"+stu.getSno());
				
				System.out.print("이름> ");
				stu.setSname(s.nextLine());
				
				System.out.print("주소> ");
				stu.setAddress(s.nextLine());
				array.add(stu);
				System.out.println(array.size()+"명 등록완료!");
				break;
			case "2":
				for(Student st : array) {
					System.out.println(st.toString());
				}
				break;
			case "3":
				System.out.print("검색할이름>");
				String search = s.nextLine();
				boolean find = false;
				
				for(Student st : array) {
					if(search.equals(st.getSname())) {
						System.out.println(st.toString());
						find = true;
					}
				}
				if(!find) System.out.println(search + " 학생이 없습니다.");
				break;
			case "4":
				System.out.println("수정할 학생 이름> ");
				String update = s.nextLine();
				find = false;
				for(Student al : array) {
					if(update.equals(al.getSname())) {
						find = true;
						System.out.println("이름:"+al.getSname());
						System.out.println("주소:"+al.getAddress());
						System.out.println("새로운주소> ");
						String newAdd = s.nextLine();
						if(newAdd != "") {
							al.setAddress(newAdd);
							//공백이 아닐경우 새로운 주소로 수정한다. 공백일 시에는 밑으로 빠짐
							System.out.println("새로운 주소로 수정되었습니다.");
						}
						
					}
				}
				if(!find) System.out.println(update+" 학생이 없습니다.");
				break;
			case "5":
				System.out.println("삭제할이름> ");
				String delete = s.nextLine();
				find = false;
				for(Student st : array) {
					if(delete.equals(st.getSname())) {
						find = true;
						array.remove(st);
						System.out.println("삭제완료");
						break;
					}
				}
				if(!find) System.out.println(delete+" 학생이 없습니다.");
				break;
			default:
				System.out.println("메뉴를 다시선택하세요!");
				break;
			}//switch	
		}//while		
	}//run
}//class
