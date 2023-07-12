package ex09;

import java.sql.*;
import java.util.*;

public class MessageDAO {
	Connection con = Database.connect();
	//보낸메세지 삭제
	public void sendDel(int mid) {
		try {
			String sql = "update messages set rdel = 1 where mid =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, mid);
			ps.execute();
		}catch(Exception e) {
			System.out.println("보낸메세지 삭제오류" +e.toString());
		}
	}
	//받은메세지 삭제
	public void receiveDel(int mid) {
		try {
			String sql = "update messages set sdel = 1 where mid =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, mid);
			ps.execute();
		}catch(Exception e) {
			System.out.println("받은메세지 삭제오류" +e.toString());
		}
	}
	//메세지전송
	public void insert(MessageVO vo) {
		try {
			String sql = "insert into messages(mid, sender, receiver, sdate, message) values(seq_mid.nextval, ?, ?, sysdate, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getSender());
			ps.setString(2, vo.getReceiver());
			ps.setString(3, vo.getMessage());
			ps.execute();
		}catch(Exception e) {
			System.out.println("메세지전송오류" +e.toString());
		}
	}
	//보낸메세지
	public List<MessageVO> receiveList(String id){
		List<MessageVO> array = new ArrayList<MessageVO>();
		try {
			String sql = "select m.* , uname from messages m , users u where sender = ? and receiver = id and rdel = 0";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				MessageVO vo = new MessageVO();
				vo.setMid(rs.getInt("mid"));
				vo.setReceiver(rs.getString("receiver"));
				vo.setUname(rs.getString("uname"));
				vo.setMessage(rs.getString("message"));
				vo.setSdate(rs.getTimestamp("sdate"));
				array.add(vo);
				
			}
		}catch(Exception e) {
			System.out.println("보낸메세지 오류" + e.toString());
		}
		return array;
	}
	
	//받은메세지출력
	public List<MessageVO> sendList(String id){
		List<MessageVO> array = new ArrayList<MessageVO>();
		try {
			String sql = "select m.* , uname from messages m , users u where receiver = ? and sender = id and sdel =0 ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				MessageVO vo = new MessageVO();
				vo.setMid(rs.getInt("mid"));
				vo.setSender(rs.getString("sender"));
				vo.setUname(rs.getString("uname"));
				vo.setMessage(rs.getString("message"));
				vo.setSdate(rs.getTimestamp("sdate"));
				array.add(vo);
				
			}
		}catch(Exception e) {
			System.out.println("받은메세지 오류" + e.toString());
		}
		return array;
	}
}
