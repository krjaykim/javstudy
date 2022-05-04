package java211216;

import java.util.Scanner;

public class ex03_박수쳐 {
	public static void main(String[] args) {

		String[] arr = { "수", "박" };

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 수박 게임  Start ! ====");

		System.out.print("숫자를 입력해주세요 >>>");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
	
			System.out.print(i%2==1? arr[0] : arr[1]);

		}

	}

}
