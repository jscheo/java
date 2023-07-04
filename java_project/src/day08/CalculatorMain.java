package day08;

public class CalculatorMain {

	public static void main(String[] args) {
		
		//Calculator 객체 만들고
		//모든 메서드 호출하여 더하기 빼기 곱하기 나누기 출력
		Calculator c1 = new Calculator();
		
		c1.num1 = 5;
		c1.num2 = 7;
		
		c1.sum();
		c1.sub(c1.num1,c1.num2);
		c1.mul();
		c1.div(74, 74);
		System.out.println(c1.mul());
		System.out.println(c1.div(74, 3));
		
	}
}
	

