package day03;

import java.util.Scanner;

public class Ex03_grade {

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
			int sum = kor+eng+mat;
			double avg = sum/(double)3;
			
			
			// 중괄호 안에 선언된 변수는 중괄호 안에서만 쓸 수 있다!
			String grade = "";
			if (avg>90) {
				grade = "A";
			}else if (avg>80) {
				grade = "B";
			}else if (avg>70 ) {
				grade = "C";
			}else if (avg>60) {
				grade = "D";
			}else {
				grade = "F";
			}
			
			//pringf란? 형식은 그냥 쓰는데 변수부분에 %를 쓰는거임. .2f는 숫자 두번째 자리까지란의미
			
			System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("============================================");
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n",kor, eng, mat, sum, avg, grade);			
			System.out.println();
			break;
			
			
			
		}
	}

}
