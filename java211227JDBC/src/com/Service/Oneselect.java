package com.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.DAO.DAO;
import com.DTO.DTO;

public class Oneselect {

	public void ones_DB() {
		// ����ڿ��� ID ���� �Է¹޾�
		// �ش��ϴ� ID���� ������ �ܼ�â�� ����Ͻÿ�.
		
			Scanner sc = new Scanner(System.in);
			System.out.print("ã�������� ID >>");
			String idi = sc.next();
			
		DAO dao = new DAO();
		DTO dto = dao.onselect_dao(idi);

		
		System.out.println(dto.getId() + "\t" + dto.getPw() + "\t"+ dto.getEmail() +"\t"+ dto.getTel());
	}

}
