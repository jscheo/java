package day09;

public class Animal {

	private String name;
	private String sound;
	//같은 클래스에서만 접근 가능.
	private int leg;
	
	public void meet(String b) {
		System.out.printf("%s는 %s를 만났습니다!\n",name,b);
	}
	//여기서 같은 클래스 내에서는 name에 접근이 가능하기 때문에, 
	//메서드 (get/set) 이게 셋 메서드다. 이게 뭐냐면, String name은 private라서 직접접근이 불가
	//그래서 퍼블릭 해놓고 setName을 메서드로 name에 접근하는 메서드를 만든거임.
	//default 접근제한자는 같은 패키지 내부에서 접근 가능하다는 말임. 없으면 그냥 다 디폴트인거임
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getSound() {
		return sound;
	}
	
	
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getLeg() {
		return leg;
	}
	public void print() {
		System.out.println(name+"\t"+sound+"\t"+leg);
	}
	public void print1() {
		System.out.printf("이름:%s, 울음:%s, 다리:%d\n",name,sound,leg);
	}
}
