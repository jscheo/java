package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
	private String name;
	private String id;
	private String pw;
	private String joinDate; 
	
	public User() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());
	}
	public User(String name, String id, String pw) {
		this.name =name;
		this.id = id;
		this.pw = pw;
//		this(); // 빈 상태는 기본생성자를 표현 소괄호 안에 갯수가 매개변수의 갯수임
		//매개변수수를 맞춰서 그 안에 있는 기능을 끌어다 쓰는 기능임
		// 생성자 실행공간에 맨 위에 위치해야 한다.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\n",name,id,pw,joinDate);
		
	}
}
