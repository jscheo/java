package day09;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Animal dog = new Animal();
		
//		dog.setName("멍멍이");
//		System.out.println(dog.getName());
//		
//		dog.setLeg(4);
//		System.out.println(dog.getLeg());
//		
//		dog.setSound("왈왈");
//		System.out.println(dog.getSound());
//		
//		
		Animal elephant = new Animal();
		elephant.setName("코다리");
		elephant.setSound("뿌우우");
		elephant.setLeg(4);
		elephant.print();
		
		
		
		//여기서 getName()가 리턴값이 있기 때문
		
		
		//객체를 하나 만든다. 객체이름 cat , 이름은 야옹이, 울음소리 야옹, 다리 4,
		//
		Animal cat = new Animal();
		cat.setName("야옹이");
		cat.setLeg(4);
		cat.setSound("야옹");
		cat.print();
		System.out.println(cat.getName()+"\t"+cat.getSound()+"\t"+cat.getLeg());
	
		
		Animal chicken = new Animal();
		chicken.setLeg(2);
		chicken.setName("하림이");
		chicken.setSound("꼬꼬댁");
		chicken.print1();
		
		
		Animal snake = new Animal();
		snake.setLeg(0);
		snake.setName("뱀돌이");
		snake.setSound("스르륵");
		snake.print1();
		
		
		
		
		
//		dog.sound = "왈왈";
//		dog.leg = 4;
		
//		System.out.println(dog.name+"\t"+dog.sound+"\t"+dog.leg);
		
		
		
	}

}
