package ex04;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static Connection connect() {
		Connection con = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "java";
		String password = "pass";
		try {//데이터베이스랑 연결하는 구문
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			System.out.println("접속성공....");
		}catch(Exception e) {//오류가 발생하면 알려주는 역활
			System.out.println("DB연결:"+e.toString());
		}
		return con;
	}
}
