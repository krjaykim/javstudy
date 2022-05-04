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
		// 사용자에게 ID 값을 입력받아
		// 해당하는 ID값의 정보를 콘솔창에 출력하시오.
		
			Scanner sc = new Scanner(System.in);
			System.out.print("찾을정보의 ID >>");
			String idi = sc.next();
			
		DAO dao = new DAO();
		DTO dto = dao.onselect_dao(idi);

		
		System.out.println(dto.getId() + "\t" + dto.getPw() + "\t"+ dto.getEmail() +"\t"+ dto.getTel());
	}

}
