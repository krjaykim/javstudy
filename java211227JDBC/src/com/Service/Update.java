package com.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.DAO.DAO;

public class Update {

	public  void update_DB(){

		// 사용자에게 ID와 변경할 PW를 입력받고
		// member에 있는 ID값의 PW를 변경하시오.

		Scanner sc = new Scanner(System.in);
		System.out.println("===회원수정===");
		System.out.print("ID >>");
		String id = sc.next();
		System.out.print("변경할PW >>");
		String pw = sc.next();
		
		DAO dao = new DAO();
		int cnt = dao.update_dao(id, pw);
		
		if (cnt > 0) {
			System.out.println("업데이트성공");
		} else {
			System.out.println("업데이트실패");
		}
		

	}

}
