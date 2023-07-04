package day10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Member>list = new ArrayList<Member>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		
		while(true) {
			System.out.println("======맴버관리======");
			System.out.println("1.맴버등록 2.맴버리스트 3.검색 4.맴버수정 5.맴버삭제 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("이메일> ");
				String email = sc.next();
				System.out.println("비밀번호");
				String pw = sc.next();
				System.out.println("이름> ");
				String name = sc.next();
				String joinDate = dtf.format(LocalDateTime.now());
				Member m = new Member(email,pw,name,joinDate);
				list.add(m);
				System.out.println(name+"님 맴버가입을 축하드립니다.");
				
			}else if(menu == 2) {
				System.out.println("이메일\t비밀번호\t이름\t가입날짜");
				System.out.println("==============================");
				for(int i = 0; i<list.size(); i++) {
					list.get(i).print();
				}
			}else if(menu == 3) {
				System.out.println("검색할 이메일> ");
				String sEmail = sc.next();
				boolean find = false;
				
				for(int i = 0; i < list.size(); i++) {
					if(sEmail.equals(list.get(i).getEmail())) {
						list.get(i).print();
						find = true;
						break;
					}
				}
				if(!true) {
					System.out.println("이메일이 없습니다.");
				}
				
			}else if(menu == 4) {
				System.out.println("수정할 이메일> ");
				String uEmail = sc.next();
				boolean find = false;
				
				for(int i = 0; i <list.size(); i++) {
					if(uEmail.equals(list.get(i).getEmail())) {
						System.out.println("수정할 비밀번호> ");
						list.get(i).setPw(sc.next());//변경할 때는 set 값을 바꿔주면 된다.
						System.out.println("수정완료");
						find = true;
						break;
					}
				}
				if(!true) {
					System.out.println("존재하지 않는 이메일입니다.");
				}
			}else if(menu == 5) {
				System.out.println("삭제할 이메일> ");
				String dEmail = sc.next();
				boolean find = false;
				
				for(int i = 0; i < list.size(); i++) {
					if(dEmail.equals(list.get(i).getEmail())) {
						list.remove(i);
						System.out.println("삭제성공");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("존재하지 않는 이메일입니다.");
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
