package java211216;

import java.util.Scanner;

public class ex06_input {

	public static void main(String[] args) {

		int[] coll = { 1, 4, 3, 2, 1 };
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int count = 0;
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");

		for (int i = 0; i < coll.length; i++) {
			System.out.print((i + 1) + "번째답>>");
			a = sc.nextInt();

		}
		System.out.println("정답확인");
		for (int i = 0; i < coll.length; i++) {
			if (a == coll[i]) {
				System.out.print("o" + " ");
				++count;
			} else {
				System.out.print("x" + " ");
			}

		}
		System.out.print("점수는 : " + count * 20);
	}

}
