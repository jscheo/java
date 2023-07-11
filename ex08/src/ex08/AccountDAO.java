package ex08;

import java.sql.*;
import java.util.*;

public class AccountDAO {
	Connection con = Database.connect();
	//잔액변경
	public void update(AccountVO vo) {
		try {
			String sql = "update account set balance =? where ano=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getBalance());
			ps.setInt(2, vo.getAno());
			ps.execute();
			
		}catch(Exception e) {
			System.out.println("잔액변경오류" + e.toString());
		}
	}
	//계좌목록
	public List<AccountVO> list(){
		List<AccountVO> array = new ArrayList<AccountVO>();
		try {
			String sql = "select * from account";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				AccountVO vo = new AccountVO();
				vo.setAno(rs.getInt("ano"));
				vo.setAname(rs.getString("aname"));
				vo.setBalance(rs.getInt("balance"));
				array.add(vo);
				
			}
		}catch(Exception e) {
			System.out.println("계좌목록:" + e.toString());
		}
		return array;
	}
	//새로운 계좌생성
	public int insert(AccountVO vo) {//삽입하기 위해서는 vo에 있는 틀이 필요하기때문에
		int ano = 0;
		try {
			String sql = "insert into account(ano, aname, balance) values(seq_ano.nextval,? , ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getAname());
			ps.setInt(2, vo.getBalance());
			ps.execute();
			
			sql = "select seq_ano.currval ano from dual";// currval 현재값이 출력 nextval은 하나더 증가된 값이 출력
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) ano=rs.getInt("ano");
		}catch(Exception e) {
			System.out.println("계좌생성:" + e.toString());
		}
		return ano;
	}
	
	//계좌정보 조회
	public AccountVO read(int ano) throws Exception{
		AccountVO vo = new AccountVO();
		String sql = "select * from account where ano = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, ano);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			vo.setAno(rs.getInt("ano"));
			vo.setAname(rs.getString("aname"));
			vo.setBalance(rs.getInt("balance"));
			
		}
		return vo;
	}
	
}
