package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[10];
		
		a[0] = "안녕";
		a[1] = "반가워요";
		a[2] = "잘있어요";
		System.out.println(a[0]);
		a[0] = "안녕하세요";
		
		//arrayList
		ArrayList<String> b = new ArrayList<String>(); //어래이리스트 생성
		b.add("안녕"); // 값 추가
		b.add("반가워요");
		b.add("잘있어요");
		System.out.println(b.get(0)); // 값 확인
		b.set(0, "안녕하세요"); //값 변경
		System.out.println(b.get(0));
		// a와 b의 값을 for문으로 출력
		
		for(int i = 0; i < 3; i++) {
			System.out.println(a[i]);
			
		}
		for (int i = 0; i <b.size(); i++) { // size()는 리스트 길이 만들어진만큼만 늘어나기 때문에 출력이가
			System.out.println(b.get(i));
		}
		
		
	}

}
