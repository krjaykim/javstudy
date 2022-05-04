package com.DTO;

public class DTO {
	//DTO(Data Transfer Object)
	//Ŭ�������� ������ ��ȯ�� �ϱ����� �����ϴ� ��ü( ���ο� ������Ÿ���� �����Ѵ� )
	//Ex) String , String int, int >> �ϳ��� ��ü�� ��������
	
	
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
	
