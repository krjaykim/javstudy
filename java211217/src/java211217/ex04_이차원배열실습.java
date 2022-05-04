package java211217;

import java.util.Arrays;

public class ex04_이차원배열실습 {

	public static void main(String[] args) {
		
		int[][]arr = new int[5][5];
		int a = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=a++;
				
			 
				System.out.print(arr[i][j]+"\t");
			
			}
			System.out.println();
		}
		
	}

}
