package day10;

public class FuritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit();
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;
		
		Fruit banana = new Fruit("바나나");
		banana.color = "노랑";
		banana.isSeed = false;
		
		Fruit melon = new Fruit("멜론","녹색");
		melon.isSeed = true;
		
		Fruit orange = new Fruit("오렌지","주황색",true);
		
		apple.print();
		banana.print();
		melon.print();
		orange.print();
	}

}
