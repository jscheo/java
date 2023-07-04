package day06;

public class 복습4 {
	public static void main(String[] args) {
		
		
		int[] e = {12,3,2,24,42};
		int temp = e[0];
		//한칸씩 앞당기기
		for(int i = 0;i<e.length;i++) {

			if (i==e.length-1) {
				e[i]=temp;
			}else {
				e[i]=e[i+1];
			}
		}for(int i = 0;i<e.length;i++) {
			System.out.println(e[i]);
		}

//		
//		int[] d = {12,3,2,24,42};
//		//d[0]째에 모든 값 누적하기
//		for(int i = 1;i<d.length;i++) {
//			d[0]+=d[i];
//		}System.out.println(d[0]);
		
		// d = {전체합,0,0,0,0};
		
		
//		int[] c= {12,3,5,2,15};
//		int sum = 0;
//		//c배열의 총합 출력
//		for(int i = 0;i<c.length;i++) {
//			sum+=c[i];
//		}System.out.println(sum);
//		
		
		
		
		
//		int[] b = new int[10];
		//b배열의 1~10까지의 값을 넣으세요
		
//		for (int i =0;i<b.length;i++) {
//				b[i]=i;
//				System.out.println(b[i]);
//			}
		
		
//		int[] a = {12,3,4,5,34};
//		//a배열의 0번째값을 출력할땐 a[0]
//		for(int i=0;i<a.length;i++) {
//			if (i == a.length-1) {
//				System.out.println(a[i]);
//				break;
//			}
//			System.out.print(a[i]+",");
//		}
		
	}
}
