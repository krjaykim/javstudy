package ����Ǯ��;

import java.util.Scanner;

public class e30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int[]arr = new int [3];
//		
//		
//	System.out.print("ù ��° ���� �Է� >> ");
//		int a = sc.nextInt();
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(a!=0) {
//				arr[i]=a&10;
//				a/=10;
//			}
//			System.out.print(arr[i]);
//		}
//		
//		
//		
////		for (int i = 0; i < arr.length; i++) {
////			arr[i]= sc.nextInt();
////		}
////		System.out.print("�� ��° ���� �Է�>> ");
////		for (int i = 0; i < arr2.length; i++) {
////			arr2[i]=sc.nextInt();
////		}	
////			
////		
////		
		
		System.out.print("ù ���� ���� �Է� >>");
		int a = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >>");
		int b = sc.nextInt();
		
		System.out.println((b%10)*a);
		System.out.println(((b/10)%10)*(a));
		System.out.println((b/100)*(a));
		System.out.println(a*b);
	}

}
