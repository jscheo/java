package day06;

import java.time.format.DateTimeFormatter;

public class testaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		// lotto = {0,0,0,0,0,0}
		// 2회차때 lotto = {1,0,0,0,0,0}
		// 2회차에 num = 1이라면
		
		for (int i = 0; i < lotto.length; i++) {
			boolean find = false;
			int num = (int) (Math.random() * 9) + 1;
			System.out.println(num+"미완");// 1부터 9까지의 수를 출력한다.
			//만약 num이 1이라면
			for (int j = 0; j < lotto.length; j++) { //j가 0~5까지의 값동안;
				if(num == lotto[j]) {     //num이 1인데 lotto[0]이 0이면 2.num이 1인데 lotto[0]이 1이면
										  //find는 true가 되고
					find = true;			//if문을나온다.
					break;					
				}
					
			}
			if(!find) {//find가 true이면		//if문을 나오면 다른 if문으로 나오면
				lotto[i] = num;				//lotto[0]의값은 1이다.
			}else {							//다른if문으로 들어갔을때 find가 true가 아니면
				i=i-1;						//i는 i-1을 빼준다.
			}
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh)
			
		}
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);
	}
}


