package ����Ǯ��;

import java.util.Random;

public class �ߺ����·ζ� {

	public static void main(String[] args) {
		
		
		Random rc = new Random();
		int[]lot = new int[6];
		
		for (int i = 0; i < lot.length; i++) {
			
			lot[i]=rc.nextInt(99)+1;
		
			
		for (int j = 0; j < i; j++) {
			if(lot[i]==lot[j]) {
				--j;
			}
		}
		
		}for (int x = 0; x < lot.length; x++) {
			System.out.println("����� ����: "+lot[x]);
		}
	
	}

}
