import java.util.Scanner;

public class ex07_������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ������ : ");
		int a = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int b = sc.nextInt();
//		int c = 0;
		int d = 1;
		int x = 0;
		while (true) {
			System.out.print(d + "���� ���� ������ : ");
			int c = sc.nextInt();
			d++;

			x += c;
			int f = (a - c);
			if (f <= b) {
				System.out.println(f + "kg �޼�!");
				break;

			
			}
		}
	}
}