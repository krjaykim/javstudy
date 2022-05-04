import java.util.Scanner;

public class ex06_continue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 입력 : ");
			int a = sc.nextInt();

			if (a % 2 == 1) {
				
			continue;
			}
			System.out.println("짝수입니다.");

		}
	}

}
