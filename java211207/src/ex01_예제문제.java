import java.util.Scanner;

public class ex01_�������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�뵿�ð��� �Է��Ͻÿ� : ");

		int a = sc.nextInt();

		System.out.print("�⺻���� �Է��ϼ��� :");

		int b = sc.nextInt();

		double result = a > 8 ? b * 8 + (b * (a - 8) * 1.5) : 5000 * a;

		System.out.println("�� �ӱ���" + (int) result + "�� �Դϴ�.");

	}

}
