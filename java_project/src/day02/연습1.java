package day02;

public class 연습1 {
	public static void main(String[] args) {
		//1부터 100까지 자연수 중 3의 배수를 ","를 포함하여 한 줄에 출력하기
		int sum = 0;
		
		for(int i=1; i<=100 ;i++) {
			if (i % 3 == 0) {
				System.out.print(i+",");
			}
		}
		
			
	}
}
