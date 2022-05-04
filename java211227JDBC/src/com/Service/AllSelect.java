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
		// member 에 있는 전체값을 검색하여 콘솔창에 출력하시오.
		
	
		DAO dao = new DAO();
		ArrayList<DTO> list =dao.alls_dao();
		
		// id pw email tel
		System.out.println("id \t pw \t email \t tel");
		// ArrayList 안에 있는 모든 데이터를 출력 해보자
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId()+"\t");
			System.out.print(list.get(i).getPw()+"\t");
			System.out.print(list.get(i).getEmail()+"\t");
			System.out.print(list.get(i).getTel()+"\t");
			System.out.println();
		}
		
		
		
	}
	}
