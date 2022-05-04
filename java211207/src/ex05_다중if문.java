import java.util.Scanner;

public class ex05_다중if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이 정수는 :");

		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수입니다.");

		} else if (num < 0) {
			System.out.println("음수입니다.");

		} else
			System.out.println("0입니다.");

	}

}
