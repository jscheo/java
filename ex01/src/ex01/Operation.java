package ex01;

public class Operation {
	public static void run() {
		//산술연산자
		int kor = 59;
		int eng = 58;
		int mat = 100;
		
		int sum = kor+eng+mat;
		double avg = sum/3.;// 형변환 할 때 실수표현하고 싶을 때는 double 을써도 되고 뒤에 . 만찍어도된다.
		
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + mat);
		System.out.println("총점:" + sum);
		System.out.printf("평균:%.2f\n",avg);
		
		//관게연산자(>,>=,<,<=,==,!=)
		//삼항연산자 양식 출력할 문구와 타입을 맞추고 변수명 설정 조건문 ? 참일때 : 아닐때 
		//논리연산자( &&, ||, !)
		//증감연산자(++, --)
		String pass = (kor >= 60 && eng >= 60 && mat >= 60 && avg >= 70) 
				? "합격" : "불합격"; 
		System.out.println("결과:"+ pass);
		int count = 0;
		// 실행문이 한줄일 때는 중괄호 생략이 가능하다. if문일때
		if(kor<60) count++;
		if(eng<60) count++;
		if(mat<60) count++;
		System.out.println("누락과목수: "+count);
		
		
	}
}
