import java.util.Scanner;

//class �̸� �ٲٱ�
// �鿩���� ����� ctrl+shift+F
public class ex02_�ܼ�if�� {

	public static void main(String[] args) {
// if (���ǽ�) {
//		���๮
//	}

		// age��� ������ ���̸� �Է¹ް� ���̰� 20�̻��̶��"�����Դϴ�."�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");

		int age = sc.nextInt();
		if (age >= 20) {
			System.out.println("���̴�" + age + "���Դϴ�");
			System.out.println("�����Դϴ�.");

		} else {
			System.out.println("���̴�" + age + "���Դϴ�");
			System.out.println("û�ҳ��Դϴ�.");

		}
		System.out.println("���α׷� ����");

	}

}
