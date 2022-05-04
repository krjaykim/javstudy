package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_example {

	public void insert_DB() {
		//JDBC����(Java <> DB)
		Scanner sc = new Scanner(System.in);
		System.out.println("===ȸ������===");
		System.out.print("ID >>");
		String id = sc.next();
		System.out.print("PW>>");
		String pw = sc.next();
		System.out.print("EMAIL>>");
		String email = sc.next();
		System.out.print("Tell>>");
		String tel = sc.next();
//		
		//JDBC �������
		//1. oracle���� �����ϴ� lib���ϰ� class������ �ε�

		
		
		
		//Java 2���������� ����
		//1. �����Ͽ��� : �������� ����(������ �˼���) 
		//2. ��Ÿ�ӿ��� : ������ �ؾ����� �� �� �ִ� ����(File, DB, ä�� ��)
		//	 ����ó���� : try ~ catch��
//		
		Connection conn = null;
		PreparedStatement psmt = null;
				
		try {
			// ���������� ������ ���� ��
			
			//2. OracleDriver(Main) class ���� �����ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�������");
			
			//3. oracle�� ���� dbid/ dbpw�� ����
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			
			 conn = DriverManager.getConnection(url, dbid, dbpw);
			
			
			if(conn!=null){
				System.out.println("���Ἲ��");
			}else {
				System.out.println("�������");

			}
			
			//====================================DB����
			
			//4. ������ SQL�� �غ�
		
			String sql = "insert into member values(?,?,?,?)";
			
		psmt = conn.prepareStatement(sql);
			
		psmt.setNString(1, id);
		psmt.setNString(2, pw);
		psmt.setNString(3, email);
		psmt.setNString(4, tel);
		
		
		//5. SQL�� ����
		int cnt = psmt.executeUpdate();
			
			
		// 1. ���� �� ������ Ȯ���Ϸ��� �˻��� �غ�����
		if(cnt>0) {
			System.out.println("�Է¼���");
		}else {
			System.out.println("�Է½���");
		}
		
		}catch(Exception e) {
			// ��Ÿ�ӿ����� �߻����� ��
			e.printStackTrace();
			System.out.println("�����߻�");
		}finally {
			//�ڵ尡 ���������� ������ �Ƶ� ������ ���� ������ ���������� ����
			System.out.println("�����ǽ���");
			// 2. Java <> DB �����帧�� x
			
			
			
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
