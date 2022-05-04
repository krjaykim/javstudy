package 연습풀이;

import java.util.Scanner;

public class e26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[]arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1+"번쨰 수 입력 : ");
			int a = sc.nextInt();
			arr[i]=a;
		}
	System.out.println("정렬 후");
	int min = 1;
	for (int i = 0; i < arr.length; i++) {
		
		if(arr[i]<arr[i]-min) {
			min=arr[i];
	}
	}
	
	}	
	

}
