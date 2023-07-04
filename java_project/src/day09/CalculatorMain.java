package day09;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "홍길동";
		
		Calculator c = new Calculator();
		
		c.num1 = 9;
		c.num2 = 3;
		
		c.sum();
		
		
		Calculator c1 = new Calculator();
		c1.sum();
		System.out.println(c1.num1);
		
		
	}

}
