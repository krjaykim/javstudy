package com.Service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==ȸ���������α׷�==");
		System.out.println("���ϴ� ����� �����Ͻÿ�");
		
		
		
		while(true) {
		
			System.out.println("1.ȸ���Է�  2.ȸ������  3.��������  4.��� ȸ���˻�  5.ȸ���˻�  6.����");
			
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
			System.out.println("����");
			break;
			
		}
		
		
		
		}

	}

}
