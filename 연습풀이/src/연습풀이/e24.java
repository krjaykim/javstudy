package 연습풀이;

import java.util.Scanner;

public class e24 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int[]arr = new int[8];
//		int b = 0;
//		System.out.print("정수 입력 : ");
//		
//		for (int i = 0; i < arr.length; i++) {
//		
//			int a = sc.nextInt();
//			arr[i]=a;
//			
//		
//		}
//		for (int i = 0; i < arr.length; i++) {
//			b += arr[i];
//		}
//		System.out.println("합은"+b);
		
		int n = 0;
	      int sum = 0;
	      System.out.print("정수 입력 : ");
	      Scanner sc = new Scanner(System.in);
	      n = sc.nextInt();
	      while(n!=0) {
	         sum+=n%10;
	         n/=10; //n = n/10
	      }
	      System.out.println("합은 "+sum+"입니다.");
	}

}
