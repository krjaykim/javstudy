package 연습풀이;

import java.util.Scanner;

public class e30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int[]arr = new int [3];
//		
//		
//	System.out.print("첫 번째 숫자 입력 >> ");
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
////		System.out.print("두 번째 숫자 입력>> ");
////		for (int i = 0; i < arr2.length; i++) {
////			arr2[i]=sc.nextInt();
////		}	
////			
////		
////		
		
		System.out.print("첫 번재 숫자 입력 >>");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >>");
		int b = sc.nextInt();
		
		System.out.println((b%10)*a);
		System.out.println(((b/10)%10)*(a));
		System.out.println((b/100)*(a));
		System.out.println(a*b);
	}

}
