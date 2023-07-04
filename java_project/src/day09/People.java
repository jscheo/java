package day09;

public class People {
	private String name;
	private int age;
	
	//생성자
	//기본생성자
	public People() {
		
	}
	public People(String name) {
		this.name = name;
	}
	//전체필드를 다 받는 생성자
	public People(String name, int age) {
		this.name =name;
		this.age =age;
	}
	//모든필드 get/set 메서드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	//모든필드 출력하는 print메서드
	public void print() {
		System.out.println("이름\t나이");
		System.out.println("===========");
		System.out.printf("%s\t%d\n",name,age);
		
	}
	//매서드명 : ageUp, 매개변수 x 리턴타입 x 실행문구는 age 1증가
	public void ageUp() {
		this.age += 1;
	}
	//매서드면 : ageUp1, 매개변수 정수하나 리턴타입 X 실행무구는 age를 매개변수만큼 증가
	public void ageUp1(int a) {
		this.age += a;
	}
	public int koreanAge() {
		return age-2;
	}
}
