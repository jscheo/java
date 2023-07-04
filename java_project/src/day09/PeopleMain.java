package day09;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		People a = new People();
//		a.setName("이순신");
//		a.setAge(20);
//		
//		System.out.println(a.getName());
//		System.out.println(a.getAge());
//		a.print();
//		
//		People b = new People("심청이");
//		b.setAge(24);
//		
//		System.out.println(b.getName());
//		b.print();
//		
//		
//		People c = new People("홍길동",25);
//		c.print();
		People a = new People();
		a.setName("홍길동");
		a.setAge(90);
		a.ageUp();
		a.print();
		
		People b = new People("이순신",80);
		b.ageUp1(5);
		b.print();
		
		System.out.println(a.getName()+"\t"+"만나이 :"+a.koreanAge());
		System.out.println(b.getName()+"\t"+"만나이 :"+b.koreanAge());
	}

}
