package com.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.DAO.DAO;
import com.DTO.DTO;

public class Insert {

	public void insert_DB() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("===회원가입===");
		System.out.print("ID >>");
		String id = sc.next();
		System.out.print("PW>>");
		String pw = sc.next();
		System.out.print("EMAIL>>");
		String email = sc.next();
		System.out.print("Tell>>");
		String tel = sc.next();
		
		DTO dto = new DTO(id, pw, email, tel);
		DAO dao = new DAO();
		int cnt = dao.insert_dao(dto);
		
		
		if(cnt>0) {
			System.out.println("입력성공");
		}else {
			System.out.println("입력실패");
		}
		
	}

}
