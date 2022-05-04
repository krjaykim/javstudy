package 연습풀이;

import java.util.Scanner;

public class e32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번쨰 숫자 입력 >>");
		int a = sc.nextInt();
		int[]arr = new int [3];
		for (int i = 2; i >=0; i--) {
			if(a>0) {
				arr[i]=a%10;
				a/=10;
			}
		}
			System.out.println("두 번째 숫자 입력 >>");
			int b = sc.nextInt();
			int[]arr2 = new int [3];
			for (int i = 2; i >=0; i--) {
				if(b>0) {
					arr2[i]=b%10;
					b/=10;
				}	 
			}
	System.out.println(arr2[2]);
	
	}
	
	
	

}
