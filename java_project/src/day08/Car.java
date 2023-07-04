package day08;

public class Car {
	//필드 또는 (인스턴스변수) - > 객체가 고유하게 가지고 있는 데이터
	String name;
	String tire;
	String color;
	int speed;
	
	
	
	//생성자 - > 객체를 생성할 때 사용하는 것
	
	
	
	
	//메서드 만드는 형식
	//접근제한자 리턴타입 메서드이름 ([매개변수]){
	//    실행문구
	// }
	
	//
	
	
	
	//메서드 - > 객체의 기능을 표현하는 것
	//메서드 만드는 기본형식. 메서드는 만드는사람, 사용하는사람이 있다. 
	public void run(){  //메소드에 리턴타입이 없다. run() {
		speed = speed+2;
		
	}
	
	public String getColor() { //컬러를 리턴해주는 기능
		return color;
	}
	
	public void speedRun(int speed) {
		this.speed += speed;
	}//나 자신의 스피드라고 표현할때 this라고 쓴다. 
	//리턴타입이 int인 getSpeed 메서드 만드시오 
	//실행문구는 speed 리턴
	//this 가 굉장히 중요하다 앞으로도 많이 쓴다.
	
	public int getSpeed() {
		return speed;
	}
	
	
	
	
}
