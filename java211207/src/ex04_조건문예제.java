import java.util.Scanner;

public class ex04_���ǹ����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("DB :");
		int a = sc.nextInt();
		System.out.print("���ڰ��� ���� :");
		int b = sc.nextInt();
		System.out.print("os :");
		int c = sc.nextInt();
		System.out.print("�����Ͱ��� :");
		int d = sc.nextInt();
		System.out.print("����Ʈ������� :");
		int e = sc.nextInt();

		if (a >= 8 && b >= 8 && c >= 8 && d >= 8 && e >= 8) {
			if (a + b + c + d + e >= 60)
				System.out.println("�հ��Դϴ�");
		} else {

			System.out.println("���հ��Դϴ�");

		}
	}
}
