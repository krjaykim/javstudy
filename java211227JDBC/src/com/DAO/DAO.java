package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.DTO.DTO;

public class DAO {
	// DAO( Data Access Object )
	// 서비스에서 데이터베이스와 연결되거나 트렌젝션되는
	// 기능들을 모아두는 클래스파일
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	int cnt = 0;

	public void getConn() {
		// DB Java 연결
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
		// DB랑 Java 연결을 끊어주는 메소드
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
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");

			}

			String sql = "insert into member values(?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setNString(1, dto.getId());
			psmt.setNString(2, dto.getPw());
			psmt.setNString(3, dto.getEmail());
			psmt.setNString(4, dto.getTel());

			// 실행 성공한 행의 개수
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
				System.out.println("업데이트성공");
			} else {
				System.out.println("업데이트실패");
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
			//insert /delete/update >> 리턴값 : int (명령에 성공한 횟수)
			// select >> 리턴값 : ResultSet(검색된 data 값)

			while(rs.next()) {
				
				String id =rs.getString(1);//id
				String pw =rs.getString(2);//pw
				String email =rs.getString(3);//email
				String tel =rs.getString(4);//tel
				
				dto = new DTO(id, pw, email, tel);
				
				
				// 1. 문자열 값으로 누적
				//str_sum+=(id+pw+email+tel);
				
//				// 2. 문자열 배열을 만든다
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
		// member 에 있는 전체값을 검색하여 콘솔창에 출력하시오.
		// 출력해주는 VIEW 단에 되돌려줄 결과값
		ArrayList<DTO> list = new ArrayList<DTO>();
	
		
		try {

			getConn();

			String sql = "select * from member";

			psmt = conn.prepareStatement(sql);
			

			 rs = psmt.executeQuery();
			 //rs >>> 데이터베이스의 표와 같은 형태
			 //insert /delete/update >> 리턴값 : int (명령에 성공한 횟수)
			// select >> 리턴값 : ResultSet(검색된 data 값)

			while(rs.next()) {
				
				String id =rs.getString(1);//id
				String pw =rs.getString(2);//pw
				String email =rs.getString(3);//email
				String tel =rs.getString(4);//tel
				
				DTO dto = new DTO(id, pw, email, tel);
				// table 안에서 딱 하나의 행 데이터만 가져오기
				list.add(dto);
				// 행 데이터를 하나씩 추가해서 table 과 같은 형태를 만들어주기
			}
		
		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			
			    close();
			}
		return list;
		
			}
			}

