package java211216;

import java.util.Scanner;

public class ex03_�ڼ��� {
	public static void main(String[] args) {

		String[] arr = { "��", "��" };

		Scanner sc = new Scanner(System.in);
		System.out.println("==== ���� ����  Start ! ====");

		System.out.print("���ڸ� �Է����ּ��� >>>");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
	
			System.out.print(i%2==1? arr[0] : arr[1]);

		}

	}

}
