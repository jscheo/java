package ex04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Juso.run();
//		Database.connect();
		StudentDAO dao = new StudentDAO();
//		System.out.println(dao.read(10));
//		//입력
//		Student stu = new Student(20,"조준상","구월동","010-3354-1407");
//		dao.insert(stu);
//		
		//수정
		Student stu = new Student(13,"강감찬","서울","010-0000-0000");
		dao.update(stu);
//		삭제
//		dao.delete(11);
//		//목록출력
		for(Student vo : dao.list()) {
			System.out.printf("%d\t%s\t%s\t%s\n",
					vo.getNo(),vo.getName(),vo.getJuso(),vo.getPhone());	
		}
		
		
	}
}
