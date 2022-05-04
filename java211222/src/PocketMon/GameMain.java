package PocketMon;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
	 PocketMon jam = new PocketMon("잠만보", "노멀", 1, "잠자기", 3000, 200, 200);
		
	 PocketMon mu = new PocketMon("뮤", "에스퍼" , 1 ,"염력" ,2000, 400, 150);
		
		
	 Scanner sc = new Scanner(System.in);
	 

	 
	 		
	 
	 
	 	while(true) {
	 		System.out.println(" ");
	 		System.out.print("1. 잠만보  2. 뮤   choice >>");
	 		int a = sc.nextInt();
	 		if(a==1) {
	 			System.out.print("1. 공격 , 2. 필살기>>");
	 			int b = sc.nextInt();	
	 			if(b==1) {
	 				mu.setHp(mu.getHp()-jam.getAt());
	 			}else if(b==2) {
	 				mu.setHp(mu.getHp()-(int)(jam.getAt()*1.5));
	 			
	 			
	 			}
	 		}else if(a==2) {
	 			System.out.println("1.공격, 2. 필살기 >>>");
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


