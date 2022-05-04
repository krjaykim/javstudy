package com.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.DAO.DAO;

public class Delete {

	public void delete_DB() {
		//사용자에게 ID 값 하나를 입력받아서 member 에서 삭제하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===회원삭제===");
		System.out.print("ID >>");
		String id = sc.next();
		
		DAO dao = new DAO();
		int cnt = dao.delete_dao(id);
		
		if (cnt > 0) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
		

	}

}
