package 연습풀이;

import java.util.Scanner;

public class e28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 >>");
		int n = sc.nextInt();
		
		int[]arr = new int[n];
		System.out.print("X 입력 >>");
		int x = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+1+"번째 정수 입력>> ");
			arr[i] = sc.nextInt();	
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<x) {
				System.out.print(arr[i]);
			}
		}

	}

}
