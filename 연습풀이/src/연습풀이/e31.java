package ����Ǯ��;

import java.util.Scanner;

public class e31 {
	
		public static void main(String[] args) {
			
			System.out.println("===== ä���ϱ� =====");
		
			Scanner sc = new Scanner(System.in);
			
			String a = sc.next();
			
			String[]arr = a.split("");
			
			int sum = 0;
			int count = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].equals("o")) {
					++count;
					sum+=count;
				}else if(arr[i].equals("x")) {
					count = 0;
				}
				
			}
		
		System.out.println(sum);
		}
}
