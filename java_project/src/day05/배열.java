package day05;

public class 배열 {
	public static void main(String[] args) {

		// 배열 만들기 배열 선언방법 첫번째는 값을 세팅해서 만드는 것.

		String[] names = { "홍길동", "이순신", "심청이" };
		// index >= [0] [1] [2]

//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		

		// 두번째 선언방법은 빈 배열에 값을 넣어서 만드는 것.
		
		String[] names1 = new String[5]; // 4칸짜리 배열
		// names1 => [0], [1], [2], [3], [4]

		names1[0] = "원빈";
		names1[1] = "장동건";
		names1[2] = "이정재";
		names1[3] = "정우성";
		names1[4] = "이병헌";

		//배열길이 확인하기
		System.out.println("배열의 길이: "+names1.length);
		
		
		// names1 에 값을 for문을 통해 출력하시오.
		for (int i = 0; i < names1.length ; i++) {
			System.out.println(names1[i]);
		}
	}
}
