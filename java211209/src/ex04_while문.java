import java.util.Scanner;

public class ex04_while�� {

	public static void main(String[] args) {
		// ���ѹݺ������� ���� ������ �����Ű��
		// ���� ����� �ݺ����� �������� ��Ű�� ���� break
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("���� �Է� :");
			int a = sc.nextInt();
			if (a >= 10) {
				break;

			}
		}
		System.out.println("��");
	}
}
