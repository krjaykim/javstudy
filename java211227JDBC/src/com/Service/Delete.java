package com.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.DAO.DAO;

public class Delete {

	public void delete_DB() {
		//����ڿ��� ID �� �ϳ��� �Է¹޾Ƽ� member ���� �����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===ȸ������===");
		System.out.print("ID >>");
		String id = sc.next();
		
		DAO dao = new DAO();
		int cnt = dao.delete_dao(id);
		
		if (cnt > 0) {
			System.out.println("��������");
		} else {
			System.out.println("��������");
		}
		

	}

}
