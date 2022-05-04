import java.util.Scanner;

public class ex01_while
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a=0;

		while (a < 10) {

			System.out.print("정수입력 : ");
			a = sc.nextInt();

		}
System.out.println("종료합니다.");
	}
}