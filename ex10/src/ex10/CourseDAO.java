package ex10;

import java.sql.*;
import java.util.*;

public class CourseDAO {
	Connection con = Database.connect();
	//강좌조회
	public CourseVO read(String scode) {
		CourseVO vo = new CourseVO();
		try {
			String sql = "select * from courses where ccode = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vo.setCcode(rs.getString("Ccode"));
				vo.setCname(rs.getString("Cname"));
			}
		}catch(Exception e) {
			System.out.println("강좌목록오류" +e.toString());
		}
		return vo;
	}
	//강좌등록
	public void insert(CourseVO vo) {
		try {
			String sql ="insert into courses(ccode, cname) values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCcode());
			ps.setString(2, vo.getCname());
			ps.execute();

		}catch(Exception e){
			System.out.println("강좌등록 오류:"+ e.toString());
		}
	}
	//새로운과목번호 구하기
	public String getCode() {//매개변수는 받아서 출력할때만 필요함 입력할때는 따로 필요없음
		String scode = "";
		try {
			String sql = "select max(ccode)+1 ccode from courses";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				scode =rs.getString("ccode");
			}
		}catch(Exception e) {
			System.out.println("새로운과목번호구하기오류" +e.toString());
		}
		return scode;
	}
	//강좌목록
	public List<CourseVO> list (){
		List<CourseVO> array = new ArrayList<CourseVO>();
		try {
			String sql = "select * from courses order by ccode desc";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				CourseVO vo = new CourseVO();
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("과목목록오류" +e.toString());
		}
		return array;
	}
}
