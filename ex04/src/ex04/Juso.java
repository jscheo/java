package ex04;

import java.util.*;

public class Juso {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		List<Student> array = new ArrayList<Student>();
		
		Student stu = new Student(10,"홍길동","인천","010-1010-1010");
		array.add(stu);
		Student stu2 = new Student(11,"이순신","천안","010-2020-2020");
		array.add(stu2);
		Student stu3 = new Student(12,"심청이","서울","010-3030-3030");
		array.add(stu3);
		int last = 12;
		
		while(run) {
			System.out.println("\n-------------------------------------");
			System.out.println("1.등록 2.목록 3.조회 4.수정 5.삭제 0.종료");
			System.out.println("-------------------------------------");
			System.out.print("메뉴선택> ");
			String menu = sc.nextLine();
		
			switch(menu) {
			case "0":
				run = false;
				System.out.println("프로그램 종료");
				break;
			case "1":	
				Student newStu = new Student();
				newStu.setNo(++last);
				System.out.println("학번 :"+ newStu.getNo());
				System.out.print("이름> ");
				newStu.setName(sc.nextLine());
				System.out.print("주소> ");
				newStu.setJuso(sc.nextLine());
				System.out.print("전화번호> ");
				newStu.setPhone(sc.nextLine());
				array.add(newStu);
				System.out.println("전체학생수" + array.size());
				break;
			case "2"://목록	
				for(Student vo : array) {
					System.out.printf("%d\t%s\t%s\t%s\n"
							,vo.getNo(),vo.getName(),vo.getJuso(),vo.getPhone());
				}
				
				break;
			case "3":	
				System.out.println("조회할 학번> ");
				String newNo = sc.nextLine();
				for(Student vo : array) {
					if(Integer.parseInt(newNo)==vo.getNo()) {
						System.out.printf("이름>%s\n주소> %s\n번호> %s\n"
								,vo.getName(),vo.getJuso(),vo.getPhone());
					}
				}
				break;
			case "4":
				System.out.println("수정할 학번> ");
				String updateStu = sc.nextLine();
				for(Student vo : array) {
					if(Integer.parseInt(updateStu)==vo.getNo()) {
						System.out.print("이름:"+vo.getName()+ ">");
						String newName = sc.nextLine();
						if(newName != "") vo.setName(newName);
						System.out.print("주소:"+vo.getJuso()+ ">");
						String newJuso = sc.nextLine();
						if(newJuso != "") vo.setJuso(newJuso);
						System.out.print("전화:"+vo.getPhone()+ ">");
						String newPhone = sc.nextLine();
						if(newPhone != "") vo.setPhone(newPhone);
						System.out.println(vo.toString());
					}
				}
				break;
			case "5":	
				System.out.println("삭제할 학번> ");
				String deleteStu = sc.nextLine();
				for(Student vo : array) {
					if(Integer.parseInt(deleteStu)== vo.getNo()) {
						array.remove(vo);
						System.out.println(vo.getName()+"학생 삭제완료");
						break;
					}
				}
				break;
			default:
				System.out.println("다시입력");
			}//switch
		}//while
	}//run
}//class
