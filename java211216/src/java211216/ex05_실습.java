package java211216;

import java.util.Scanner;

public class ex05_�ǽ� {

	public static void main(String[] args) {
		
		int[]input = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		
		for ( int i = 0; i < input.length; i++) {
			System.out.print((i+1)+"����");
			int a = sc.nextInt();
			
			input[i]=a;
			
			
		}System.out.print("������ :  ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
			
		}
		
	}

}
