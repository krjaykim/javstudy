package ����Ǯ��;

import java.util.Scanner;

public class e28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N �Է� >>");
		int n = sc.nextInt();
		
		int[]arr = new int[n];
		System.out.print("X �Է� >>");
		int x = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+1+"��° ���� �Է�>> ");
			arr[i] = sc.nextInt();	
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<x) {
				System.out.print(arr[i]);
			}
		}

	}

}
