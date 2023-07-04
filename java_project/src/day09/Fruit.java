package day09;

public class Fruit {
	String name;
	String color;
	boolean isSeed;
	
	
	//생성자 - 객체를 생성할 때 사용하는 것
	// 특징 1. 클래스의 이름과 동일 	동일해야하기때문에 여러개 만들 수 없다. 
	//     2. 리턴타입이 없다.
	public Fruit() {
		
	}
	//기본생성자는 아무 생성자가 없을 때에만 생성됨
	//생성자가 이미 존재하면 기본생성자도 없기 때문에
	//만들어진 생성자에 맞춰서 객체를 생성해야함.
	//안하면 에러뜸
	// 생성자는 필드에 값을 세팅하기 위해서 쓴다.
	//오버로딩 - 매개변수를 다르게 해서 동일한 이름을 가질 수 있는 것
	public Fruit(String name) {
		this.name =name;
	}
	public Fruit(String name, String color) {
		this.name =name;
		this.color = color;
	}
	public Fruit(String name, String color, boolean isSeed) {
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	
	
	public void print() {
		System.out.println(name+"\t"+color+"\t"+isSeed);
	}
}
