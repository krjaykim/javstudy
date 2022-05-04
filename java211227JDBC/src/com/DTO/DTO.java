package com.DTO;

public class DTO {
	//DTO(Data Transfer Object)
	//클래스간의 데이터 교환을 하기위해 생성하는 객체( 새로운 데이터타입을 생성한다 )
	//Ex) String , String int, int >> 하나의 객체로 생성가능
	
	
	String id;
	String pw;
	String email;
	String tel;
	
	public DTO(String id, String pw, String email, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
	
