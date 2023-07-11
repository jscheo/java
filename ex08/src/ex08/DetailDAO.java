package ex08;

import java.sql.*;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class DetailDAO {
	Connection con = Database.connect();
	//거래내역 등록
	public void insert(DetailVO vo) {
		try {
			String sql = "insert into detail(dno, ano, amount, type, ddate) values(seq_dno.nextval, ?, ?, ?, sysdate)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getAno());
			ps.setInt(2, vo.getAmount());
			ps.setString(3, vo.getType());
			ps.execute();
			
		}catch(Exception e) {
			System.out.println("거래내역 등록:" + e.toString());
		}
	}
	//특정계좌 거래내역
	public List<DetailVO> list(int ano){
		List<DetailVO> array = new ArrayList<DetailVO>();
		try {
			String sql = "select * from detail where ano = ? order by dno desc";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, ano);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				DetailVO vo = new DetailVO();
				vo.setDno(rs.getInt("dno"));
				vo.setAno(rs.getInt("ano"));
				vo.setAmount(rs.getInt("amount"));
				vo.setType(rs.getString("type"));
				vo.setDdate(rs.getTimestamp("ddate"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("거래내역 오류"+ e.toString());
		}
		return array;
	}
}
