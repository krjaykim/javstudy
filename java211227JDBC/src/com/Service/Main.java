package com.Service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==회원관리프로그램==");
		System.out.println("원하는 기능을 선택하시오");
		
		
		
		while(true) {
		
			System.out.println("1.회원입력  2.회원삭제  3.정보수정  4.모든 회원검색  5.회원검색  6.종료");
			
			Scanner sc= new Scanner(System.in);
		String num = sc.next();
		if(num.equals("1")) {
		Insert in = new Insert();
		in.insert_DB();
		
		}else if(num.equals("2")) {
		Delete dt = new Delete();
		dt.delete_DB();
		
		}else if(num.equals("3")) {
			Update ud = new Update();
			ud.update_DB();
		
		}else if(num.equals("4")) {
			AllSelect as = new AllSelect();
			as.alls_DB();
		
		
		}else if(num.equals("5")) {
			Oneselect os = new Oneselect();
			os.ones_DB();
		}else if(num.equals("6")) {
			System.out.println("종료");
			break;
			
		}
		
		
		
		}

	}

}
