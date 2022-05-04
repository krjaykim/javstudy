import java.util.Scanner;

public class ex04_while문 {

	public static void main(String[] args) {
		// 무한반복문으로 만들어서 강제로 종료시키기
		// 가장 가까운 반복문을 강제종료 시키는 문법 break
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("정수 입력 :");
			int a = sc.nextInt();
			if (a >= 10) {
				break;

			}
		}
		System.out.println("끝");
	}
}
