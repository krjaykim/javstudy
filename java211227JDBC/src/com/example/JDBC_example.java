package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_example {

	public void insert_DB() {
		//JDBC연결(Java <> DB)
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
//		
		//JDBC 연결순서
		//1. oracle에서 제공하는 lib파일과 class파일을 로딩

		
		
		
		//Java 2가지종류의 에러
		//1. 컴파일오류 : 문법적인 오류(실행전 알수있) 
		//2. 런타임오류 : 실행을 해야지만 알 수 있는 오류(File, DB, 채팅 등)
		//	 예외처리문 : try ~ catch문
//		
		Connection conn = null;
		PreparedStatement psmt = null;
				
		try {
			// 정삭적으로 실행이 됐을 때
			
			//2. OracleDriver(Main) class 파일 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("정상실행");
			
			//3. oracle로 가서 dbid/ dbpw를 인증
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			
			 conn = DriverManager.getConnection(url, dbid, dbpw);
			
			
			if(conn!=null){
				System.out.println("연결성공");
			}else {
				System.out.println("연결실패");

			}
			
			//====================================DB연결
			
			//4. 실행할 SQL문 준비
		
			String sql = "insert into member values(?,?,?,?)";
			
		psmt = conn.prepareStatement(sql);
			
		psmt.setNString(1, id);
		psmt.setNString(2, pw);
		psmt.setNString(3, email);
		psmt.setNString(4, tel);
		
		
		//5. SQL문 실행
		int cnt = psmt.executeUpdate();
			
			
		// 1. 값이 잘 들어갔는지 확인하려면 검색을 해봐야함
		if(cnt>0) {
			System.out.println("입력성공");
		}else {
			System.out.println("입력실패");
		}
		
		}catch(Exception e) {
			// 런타임오류가 발생했을 때
			e.printStackTrace();
			System.out.println("오류발생");
		}finally {
			//코드가 정상적으로 실행이 됐든 오류가 났든 무조건 마지막으로 실행
			System.out.println("무조건실행");
			// 2. Java <> DB 연결흐름을 x
			
			
			
			try {
				if(psmt!=null) {
				psmt.close();
				}
				if(conn!=null) {
				conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
