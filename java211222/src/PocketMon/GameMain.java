package PocketMon;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
	 PocketMon jam = new PocketMon("�Ḹ��", "���", 1, "���ڱ�", 3000, 200, 200);
		
	 PocketMon mu = new PocketMon("��", "������" , 1 ,"����" ,2000, 400, 150);
		
		
	 Scanner sc = new Scanner(System.in);
	 

	 
	 		
	 
	 
	 	while(true) {
	 		System.out.println(" ");
	 		System.out.print("1. �Ḹ��  2. ��   choice >>");
	 		int a = sc.nextInt();
	 		if(a==1) {
	 			System.out.print("1. ���� , 2. �ʻ��>>");
	 			int b = sc.nextInt();	
	 			if(b==1) {
	 				mu.setHp(mu.getHp()-jam.getAt());
	 			}else if(b==2) {
	 				mu.setHp(mu.getHp()-(int)(jam.getAt()*1.5));
	 			
	 			
	 			}
	 		}else if(a==2) {
	 			System.out.println("1.����, 2. �ʻ�� >>>");
	 			int e = sc.nextInt();
	 			if(e==1) {
	 				jam.setHp(jam.getHp()-mu.getAt());
	 				
	 			}else if(e==2) {
	 				jam.setHp(jam.getHp()-(int)(mu.getAt()*1.5));
	 			
	 				
	 			}
	 		}System.out.print(jam.getHp()+" "+mu.getHp());
	 		
		if(jam.getHp()<=0||mu.getHp()<=0) {
			break;
		}
	 	} 
	 	


	}	
	
	}


