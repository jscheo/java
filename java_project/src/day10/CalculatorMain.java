package day10;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a = new Calculator();
		a.num1 = 4;
		a.num2 = 8;
		//.은 ~의 라고 해석 a.num1 은 a의 num1은이다
		a.sum();
		a.sub(6, 4);
		System.out.println(a.mul());
		System.out.println(a.div(10, 3));
	}

}
