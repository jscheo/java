package day09;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board a = new Board("일보아카데미 계시판",5,true);
		a.cntUp();
		a.print();
		
		Board b = new Board("대한민국 국가대표 패스성공률",10,false);
		System.out.println(b.cntUp1(50));
		b.print();
	}

}
