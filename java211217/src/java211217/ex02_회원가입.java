package java211217;

import java.util.Scanner;

public class ex02_회원가입 {

	public static void main(String[] args) {

		// 회원가입 프로그램 만들기

		// 프로그램 시작시 메뉴 선택하기 >> 반복적으로

		// [1] 회원가입 [2] 로그인 [3] 종료 >>
		Scanner sc = new Scanner(System.in);
		int a = 0;

		// 회원가입시 필요한 id(String), pw(String) 배열 생성하기 >> 크기 3개!

		String[] id = new String[3];
		String[] pw = new String[3];
		int num = 0;
		do {
			System.out.print("[1] 회원가입 [2] 로그인 [3] 종료 >>");
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("==회원가입==");
				// 가입할 id,pw 생성된 배열에 입력받기

				id[num] = sc.next();

				pw[num] = sc.next();
				++num;
				System.out.println("회원가입 성공!");
			} else if (a == 2) {
				System.out.println("==로그인==");
				
				// 로그인 하고자 하는 id, pw 입력 받기
				
				// 입력 받은 내용이 id배열, pw배열에 존재하는지 확인 하기 > 로그인 성공
				System.out.print("ID 입력 : ");
				String x = sc.next();
				System.out.print("PW 입력 : ");
				String y = sc.next();
				for (int i = 0; i < pw.length; i++) {
					if (x.equals(id[i])&&y.equals(pw[i])) { System.out.println("로그인 성공!");
				}
				
				}  
				
				} else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

		} while (a < 4);

	}
}
	