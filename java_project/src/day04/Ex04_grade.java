package day04;

import java.util.Scanner;

public class Ex04_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=====성적표=====");
			System.out.print("국어> ");
			int kor = sc.nextInt();
			System.out.print("영어> ");
			int eng = sc.nextInt();
			System.out.print("수학> ");
			int mat = sc.nextInt();
			
			String grade = "";
			int total = kor + eng + mat;
			double avg = total/(double)3;
		
			if (avg>=90) {
				grade = "A";
			}else if (avg >= 80) {
				grade = "B";
			}else if (avg >= 70) {
				grade = "C";
			}else if (avg >= 60) {
				grade = "D";
			}else {
				grade = "F";
			}
			
			//소숫점 둘째짜리가지 ㅍ현하기 위해서 프린트f를 사용하는것임. 
			System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("===========================================");
			System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+avg+"\t"+grade);
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n",kor,eng,mat,total,avg,grade);
			System.out.println();
			break;
			
			
		}
	}

}
