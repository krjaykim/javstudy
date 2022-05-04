import java.util.Scanner;

public class ex07_예제들 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int a = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int b = sc.nextInt();
//		int c = 0;
		int d = 1;
		int x = 0;
		while (true) {
			System.out.print(d + "주차 감량 몸무게 : ");
			int c = sc.nextInt();
			d++;

			x += c;
			int f = (a - c);
			if (f <= b) {
				System.out.println(f + "kg 달성!");
				break;

			
			}
		}
	}
}