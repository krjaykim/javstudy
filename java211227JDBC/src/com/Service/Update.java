package com.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.DAO.DAO;

public class Update {

	public  void update_DB(){

		// ����ڿ��� ID�� ������ PW�� �Է¹ް�
		// member�� �ִ� ID���� PW�� �����Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		System.out.println("===ȸ������===");
		System.out.print("ID >>");
		String id = sc.next();
		System.out.print("������PW >>");
		String pw = sc.next();
		
		DAO dao = new DAO();
		int cnt = dao.update_dao(id, pw);
		
		if (cnt > 0) {
			System.out.println("������Ʈ����");
		} else {
			System.out.println("������Ʈ����");
		}
		

	}

}
