package com.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import com.DAO.DAO;
import com.DTO.DTO;

public class AllSelect {

	public void alls_DB(){
		// member �� �ִ� ��ü���� �˻��Ͽ� �ܼ�â�� ����Ͻÿ�.
		
	
		DAO dao = new DAO();
		ArrayList<DTO> list =dao.alls_dao();
		
		// id pw email tel
		System.out.println("id \t pw \t email \t tel");
		// ArrayList �ȿ� �ִ� ��� �����͸� ��� �غ���
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId()+"\t");
			System.out.print(list.get(i).getPw()+"\t");
			System.out.print(list.get(i).getEmail()+"\t");
			System.out.print(list.get(i).getTel()+"\t");
			System.out.println();
		}
		
		
		
	}
	}
