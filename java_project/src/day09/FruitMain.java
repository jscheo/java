package day09;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit();
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;
		apple.print();
		
		//두번째 생성자 사용하여 melon 객체 생성
		Fruit melon = new Fruit("멜론");
		melon.color = "녹색";
		melon.isSeed = true;
		melon.print();
		// new 뒤에 붙는 거는 생성자다.
		//객체가 생성되기 위해서는 생성자가 무조건 필요하다.
		//세번째 생성자 사용하여 orange 객체 생성
		Fruit orange = new Fruit("오렌지","주황색");
		orange.isSeed = true;
		orange.print();
		
		Fruit banana = new Fruit("바나나","노랑",false);
		banana.print();
		
		
	}

}
