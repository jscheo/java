package day06;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];		
		int cnt = 0;
		// lotto배열에 중복없이 1~9까지 값 넣기
		for(int j=0; j<lotto.length; j++) {
			int num = (int)(Math.random()*9)+1;
			boolean find = false;
			for(int i=0; i<lotto.length; i++) {
				if(num == lotto[i]) {
					find = true;
					break;
				}
			}
			if(!find) {
				lotto[j] = num;
			}else {
				j--;
			}
		}
		
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);
		
		
	}

}
