package ex07;
import java.util.*;
import java.sql.*;

public class SaleDAO {
	Connection con = Database.connect();
	//상품별 판매현황
	public List<SaleVO> sum_list(){
		List<SaleVO> array = new ArrayList<SaleVO>();
		try {
			String sql = "select pcode, pname, sum(qnt)sum_qnt ,sum(sprice*qnt) sum_price from view_sale group by pcode, pname order by pcode";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				SaleVO vo = new SaleVO();
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setQnt(rs.getInt("sum_qnt"));
				vo.setSprice(rs.getInt("sum_price"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("상품별 판매현황:" +e.toString());
		}
		return array;
	}
	
	//판매등록
	public void insert(SaleVO vo) throws Exception{
		String sql = "insert into sale(scode, pcode, qnt, sprice) values(seq_scode.nextval,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getPcode());
		ps.setInt(2, vo.getQnt());
		ps.setInt(3, vo.getSprice());
		ps.execute();
	}
	//상품별 판매목록 조회
	
	public List<SaleVO> list(int pcode)throws Exception{
		List<SaleVO> array = new ArrayList<SaleVO>();
		String sql = "select * from sale where pcode = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pcode);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			SaleVO vo = new SaleVO();
			vo.setScode(rs.getInt("scode"));
			vo.setPcode(rs.getInt("pcode"));
			vo.setQnt(rs.getInt("qnt"));
			vo.setSprice(rs.getInt("sprice"));
			vo.setSdate(rs.getTimestamp("sdate"));
			array.add(vo);
			
		}
		return array;
	}
}
