package java211216;

import java.util.Scanner;

public class ex04_oo {
	public static void main(String[] args) {
		
		// String 형태의 배열 생성하기 (5크기)
		// 우리 팀원의 이름 넣어주기!
		
		String[] team = {"김동국", "김인웅","김정빈","한해민","노치균"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 이름 : ");
		String search = sc.next();
	
		//검색한 이름이 몇번째에 위치하는지 위치값 반환하기
		for (int i = 0; i < team.length; i++) {
			if(team[i].equals(search)) {
				System.out.print("몇번째인가?"+(i+1));
			}
		}
	}

}
