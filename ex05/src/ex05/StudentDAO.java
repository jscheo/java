package ex05;

import java.sql.*;
import java.util.*;

public class StudentDAO {
	Connection con = Database.connect();
	
	//학생목록 
	public List<StudentVO> list(){
		List<StudentVO> array = new ArrayList<StudentVO>();
		try {
			String sql = "select * from students ";
			PreparedStatement ps = con.prepareStatement(sql);//sql문을 넣어주는 문법
			ResultSet rs = ps.executeQuery(); // sql(Query)를 실행하라/실행결과를 rs에 넣어라
			while(rs.next()) {// rs안에 있는 데이터를 하나씩 가져와라 없어지면 반복문 종료
				StudentVO vo = new StudentVO(); //array이에 넣어주기 위에 vo를 새로 만들어서 여기다 넣어준다.
				vo.setSno(rs.getString("sno"));// vo에 컬럼에 있는 값을 가져와서 세팅해준다. 컬럼명은 틀리면 안됌
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getString("dept"));
				vo.setBirthday(rs.getDate("birthday"));
				vo.setYear(rs.getInt("year"));
				array.add(vo);//세팅된 값을 array에 리턴해줘야하기 때문에 추가해준다.
			}
		}catch(Exception e) {
			System.out.println("학생목록:" + e.toString());
		}
		return array;
	}
}
