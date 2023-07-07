package ex06;

import java.sql.*;
import java.util.*;

public class SaleDAO {
	Connection con = Database.connect();
	
	//판매정보
	public List<SaleVO> list(int pcode){
		List<SaleVO> array = new ArrayList<SaleVO>();
		try {
			String sql = "select * from sale where pcode = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pcode);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				SaleVO vo = new SaleVO();
				vo.setQnt(rs.getInt("qnt"));
				vo.setSprice(rs.getInt("sprice"));
				vo.setSdate(rs.getTimestamp("sdate"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("판매정보목록:" +e.toString());
		}
		return array;
	}
}
