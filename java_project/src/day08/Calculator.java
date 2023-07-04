package day08;

public class Calculator {
	int num1;
	int num2;
	int result;
	public void sum() {
		System.out.println(num1+num2);
	}
	public void sub(int a, int b) {
		System.out.println(a - b);
	}
	public int mul() {
		return num1*num2;
	}
	public double div(int a, double b) {
		return a/(double)b;
	}
	
	//sum 메소드
	//메서드명 sum, 리턴타입 없음 매개변수 없음 실행문구 필드 num1+num2출력
	
	//메서드명 sub, 리턴타입 없음 매개변수: int 2개 없음 실행문구 매개변수 두개의 합 출력
	
	//메서드명 mul 리턴타입 o 매개변수 x 실행문구:num1*num2 리턴
	
	//메서드명 div, 리턴타입 o 매개변수 int 2개  실행문구 리턴타입 매개면수 2개의 나눈값 리턴


	
	
}
