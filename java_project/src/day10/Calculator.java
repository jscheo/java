package day10;

public class Calculator {
	int num1;
	int num2;
	
	public void sum () {
		System.out.println(num1+num2);
	}
	public void sub(int a, int b) {
		if(b > a) {
			System.out.println(b-a);
		}else {
		System.out.println(a-b);
		}
	}
	public int mul() {
		return num1*num2;
		
	}
	public int div(int a, int b) {
		return a/b;
	}
}
