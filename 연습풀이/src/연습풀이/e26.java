package ����Ǯ��;

import java.util.Scanner;

public class e26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[]arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1+"���� �� �Է� : ");
			int a = sc.nextInt();
			arr[i]=a;
		}
	System.out.println("���� ��");
	int min = 1;
	for (int i = 0; i < arr.length; i++) {
		
		if(arr[i]<arr[i]-min) {
			min=arr[i];
	}
	}
	
	}	
	

}
