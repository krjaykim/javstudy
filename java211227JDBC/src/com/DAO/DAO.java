package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.DTO.DTO;

public class DAO {
	// DAO( Data Access Object )
	// ���񽺿��� �����ͺ��̽��� ����ǰų� Ʈ�����ǵǴ�
	// ��ɵ��� ��Ƶδ� Ŭ��������
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	int cnt = 0;

	public void getConn() {
		// DB Java ����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			conn = DriverManager.getConnection(url, dbid, dbpw);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void close() {
		// DB�� Java ������ �����ִ� �޼ҵ�
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

	public int insert_dao(DTO dto) {

		try {

			getConn();

			if (conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");

			}

			String sql = "insert into member values(?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setNString(1, dto.getId());
			psmt.setNString(2, dto.getPw());
			psmt.setNString(3, dto.getEmail());
			psmt.setNString(4, dto.getTel());

			// ���� ������ ���� ����
			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			close();			
		}
		return cnt;

	}

	public int delete_dao(String id) {

		try {

			getConn();

			String sql = "delete from member where id = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setNString(1, id);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			close();
		}
		return cnt;
	}

	public int update_dao(String id, String pw) {

		try {

			getConn();

			String sql = "update member set pw = ? where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setNString(1, pw);
			psmt.setNString(2, id);

			cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("������Ʈ����");
			} else {
				System.out.println("������Ʈ����");
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

		
		 
				close();
			
			}
		return cnt;
	}

	public DTO onselect_dao(String idi) {
		
		String str_sum = "";
		String[]str_arr = new String[3];
		
		DTO dto =null;
try {
			
			getConn();

			String sql = "select id, pw, email, tel from member where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setNString(1, idi);

			ResultSet rs = psmt.executeQuery();
			//insert /delete/update >> ���ϰ� : int (��ɿ� ������ Ƚ��)
			// select >> ���ϰ� : ResultSet(�˻��� data ��)

			while(rs.next()) {
				
				String id =rs.getString(1);//id
				String pw =rs.getString(2);//pw
				String email =rs.getString(3);//email
				String tel =rs.getString(4);//tel
				
				dto = new DTO(id, pw, email, tel);
				
				
				// 1. ���ڿ� ������ ����
				//str_sum+=(id+pw+email+tel);
				
//				// 2. ���ڿ� �迭�� �����
//				str_arr[0] = pw;
//				str_arr[1] = email;
//				str_arr[2] = tel;
				
				// 3. DTO(Data Transfer object)
			}
		
		} catch (Exception e) {

			e.printStackTrace();

		} finally {


			close();
			}
		return dto;
	}

	public ArrayList<DTO> alls_dao(){
		// member �� �ִ� ��ü���� �˻��Ͽ� �ܼ�â�� ����Ͻÿ�.
		// ������ִ� VIEW �ܿ� �ǵ����� �����
		ArrayList<DTO> list = new ArrayList<DTO>();
	
		
		try {

			getConn();

			String sql = "select * from member";

			psmt = conn.prepareStatement(sql);
			

			 rs = psmt.executeQuery();
			 //rs >>> �����ͺ��̽��� ǥ�� ���� ����
			 //insert /delete/update >> ���ϰ� : int (��ɿ� ������ Ƚ��)
			// select >> ���ϰ� : ResultSet(�˻��� data ��)

			while(rs.next()) {
				
				String id =rs.getString(1);//id
				String pw =rs.getString(2);//pw
				String email =rs.getString(3);//email
				String tel =rs.getString(4);//tel
				
				DTO dto = new DTO(id, pw, email, tel);
				// table �ȿ��� �� �ϳ��� �� �����͸� ��������
				list.add(dto);
				// �� �����͸� �ϳ��� �߰��ؼ� table �� ���� ���¸� ������ֱ�
			}
		
		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			
			    close();
			}
		return list;
		
			}
			}

