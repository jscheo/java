package day10;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
//		dog.name = "강아지";
		dog.setName("강아지");
//		System.out.println(dog.name);
//		dog.sound = "멍멍";
		dog.setSound("멍멍");
//		dog.leg = 4;
		dog.setLeg(4);
		dog.print();
		System.out.println(dog.getName()+"\t"+dog.getSound()+"\t"+dog.getLeg());
		
		Animal cat = new Animal();
		cat.setName("고양이");
		cat.setSound("야옹");
		cat.setLeg(4);
		cat.print();
		System.out.println(cat.getName()+"\t"+cat.getSound()+"\t"+cat.getLeg());
		
		Animal chicken = new Animal();
		chicken.setName("닭");
		chicken.setSound("꼬끼오");
		chicken.setLeg(2);
		chicken.print();
		System.out.println(chicken.getName()+"\t"+chicken.getSound()+"\t"+chicken.getLeg());
		
		Animal snake = new Animal();
		snake.setName("뱀");
		snake.setSound("스윽");
		snake.setLeg(0);
		snake.print();
		System.out.println(snake.getName()+"\t"+snake.getSound()+"\t"+snake.getLeg());
		
	}

}
