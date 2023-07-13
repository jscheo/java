package ex10;

import java.sql.*;
import java.util.*;

public class StudentDAO {
	Connection con = Database.connect();
	//학생조회
	public StudentVO read(String scode) {
		StudentVO vo = new StudentVO();
		try {
			String sql = "select * from students where scode = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getString("dept"));
			}
		}catch(Exception e) {
			System.out.println("학생목록오류" +e.toString());
		}
		return vo;
	}
	//학생등록
	public void insert(StudentVO vo) {
		try {
			String sql ="insert into students(scode, sname, dept) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getScode());
			ps.setString(2, vo.getSname());
			ps.setString(3, vo.getDept());
			ps.execute();
			
		}catch(Exception e){
			System.out.println("학생등록 오류:"+ e.toString());
		}
	}
	//새로운학번 구하기
	public String getCode() {//매개변수는 받아서 출력할때만 필요함 입력할때는 따로 필요없음
		String scode = "";
		try {
			String sql = "select max(scode)+1 ncode from students";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				scode =rs.getString("ncode");
			}
		}catch(Exception e) {
			System.out.println("새로운학번구하기오류" +e.toString());
		}
		return scode;
	}
	//학생목록
	public List<StudentVO> list (){
		List<StudentVO> array = new ArrayList<StudentVO>();
		try {
			String sql = "select * from students order by scode desc";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				StudentVO vo = new StudentVO();
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getString("dept"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("학생목록오류" +e.toString());
		}
		return array;
	}
}
