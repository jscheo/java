package day02;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 1; i< 10; i++) {
//			System.out.println(i);
//			if (i==4) {
//				break; // break는 멈추는 역할을 한다.
//			}
//			
//		}
//		for (int i=1;i<=10;i++) {
//			if (i==4) {
//				continue;
//				//continue는 실행하지 않고 넘긴다. 바로 다시 다른쪽으로 실행하러감
//				
//			}
//			System.out.println(i);
			
		
		int dan = 7;
		
		//출력예시
		//7 * 1 = 1
		//7 * 2 = 14
		//7 * 3 = 21
		
		for (int i=1;i<=9;i++) {
			if (i==5) {
				System.out.println("");
				continue;
			}else if(i==9) {
				break;
			}
			
			System.out.println(dan +" * " +i+" = "+(dan*i));
		}
	}

}
