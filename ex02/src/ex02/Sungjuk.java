package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sungjuk {
	public static void run() {
		Scanner s = new Scanner(System.in);
		List<ScoreVO> array = new ArrayList<>();// 소괄호에 ScoreVO 는 생략해도 된다 앞에 써줬기때문에
		ScoreVO score = new ScoreVO("2023-1","홍길동",90,77,85);
		array.add(score);
		score = new ScoreVO("2023-2","이순신",88,77,66);
		array.add(score);
		score = new ScoreVO("2023-3","심청이",83,95,91);
		array.add(score);
		int count = 3;
		
		boolean run = true;
		while(run) {
			System.out.println("\n=====================성적관리=====================");
			System.out.println("------------------------------------------------");
			System.out.println("1.성적입력 2.성적조회 3.성적목록 4.성적수정 5.성적삭제 0.종료");
			System.out.println("------------------------------------------------");
			System.out.print("메뉴선택> ");
			String menu = s.nextLine();
			
			switch(menu) {
			
			case "0":
				run = false;
				System.out.println("프로그램 종료");
				break;
			case "1":
				score = new ScoreVO();
				score.setNo("2023-"+(count +1));
				System.out.println("학번>"+score.getNo());
				System.out.print("이름> ");
				score.setName(s.nextLine());
				System.out.print("국어>");
				score.setKor(Integer.parseInt(s.nextLine()));
				System.out.print("영어>");
				score.setEng(Integer.parseInt(s.nextLine()));
				System.out.print("수학>");
				score.setMat(Integer.parseInt(s.nextLine()));
				array.add(score);
				count++;
				System.out.println("입력완료");
				break;
			case "2":
				System.out.print("조회할 이름> ");
				String search = s.nextLine();
				score=search(array, search);
				if(score.getName() == null) {
					System.out.println(search+"이름이 없습니다.");
				}else {
					score.print_port();
				}
				break;
			case "3":
				for(ScoreVO vo : array) {
					vo.setTot(vo.getKor()+vo.getEng()+vo.getMat());
					vo.setAvg(vo.getTot()/3.);
//					String grade = getGrade(vo.getAvg());
//					vo.setGrade(grade);		
					vo.setGrade(getGrade(vo.getAvg()));
					vo.print_land();
					
				}
				break;
			case "4":
				break;
			case "5":
				System.out.println("삭제할 이름> ");
				String delete = s.nextLine();
				score=search(array,delete);
				if(score.getName() == null) {
					System.out.println(delete+"학생이 없습니다.");
				}else {
					array.remove(score);
					System.out.println("삭제완료");
				}
				break;
			default:
				System.out.println("다시 선택하세요");
			}//switch
			
		}//while
		//학점구하는 매서드
	}//run
	public static String getGrade(double avg) {
		String grade = "";
		if(avg>=90) {
			if(avg>=95) {
				grade = "A+";
			}else {
				grade = "A0";
			}
		}else if(avg>=80) {
			if(avg>=85) {
				grade = "B+";
			}else {
				grade = "B0";
			}
		}else if(avg>=70) {
			if(avg>=75) {
				grade = "C+";
			}else {
				grade = "C0";
			}
		}else if(avg>=60) {
			if(avg>=65) {
				grade = "D+";
			}else {
				grade = "D0";
			}
		}else {
			grade = "F";
		}
		return grade;
	}
	public static ScoreVO search(List<ScoreVO> array, String name) {
		ScoreVO vo = new ScoreVO();
		for(ScoreVO v : array) {
			if(v.getName().equals(name)) {
				v.setTot(v.getKor()+v.getEng()+v.getMat());
				v.setAvg(v.getTot()/3.);
				v.setGrade(getGrade(v.getAvg()));
				vo =v;
			}
		}
		return vo;
	}
}//class
