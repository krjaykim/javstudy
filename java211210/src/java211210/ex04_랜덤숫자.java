package java211210;

import java.util.Random;
import java.util.Scanner;

public class ex04_랜덤숫자 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int a = r.nextInt(20);
		int b = r.nextInt(20);

		String z = "";
		do {
			System.out.print(a + "+" + b + "=");
			int sum = (a + b);
			int c = sc.nextInt();
			if (sum == c) {
				System.out.println("Success");
				System.out.print("계속 하시겠습니까>>>");
				z = sc.next();
				a = r.nextInt(20);
				b = r.nextInt(20);
			} else if (sum != c) {
				System.out.println("Faill");
				System.out.print("계속 하시겠습니까>>>");
				z = sc.next();
			}
		} while (z.equals("Y"));
		if (z.equals("N")) {
			System.out.println("종료하겠습니다.");

		}
	}
}