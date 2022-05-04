import java.util.Scanner;

public class ex01_예제문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("노동시간을 입력하시오 : ");

		int a = sc.nextInt();

		System.out.print("기본급을 입력하세요 :");

		int b = sc.nextInt();

		double result = a > 8 ? b * 8 + (b * (a - 8) * 1.5) : 5000 * a;

		System.out.println("총 임금은" + (int) result + "원 입니다.");

	}

}
