package java211217;

import java.util.Scanner;

public class ex02_ȸ������ {

	public static void main(String[] args) {

		// ȸ������ ���α׷� �����

		// ���α׷� ���۽� �޴� �����ϱ� >> �ݺ�������

		// [1] ȸ������ [2] �α��� [3] ���� >>
		Scanner sc = new Scanner(System.in);
		int a = 0;

		// ȸ�����Խ� �ʿ��� id(String), pw(String) �迭 �����ϱ� >> ũ�� 3��!

		String[] id = new String[3];
		String[] pw = new String[3];
		int num = 0;
		do {
			System.out.print("[1] ȸ������ [2] �α��� [3] ���� >>");
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("==ȸ������==");
				// ������ id,pw ������ �迭�� �Է¹ޱ�

				id[num] = sc.next();

				pw[num] = sc.next();
				++num;
				System.out.println("ȸ������ ����!");
			} else if (a == 2) {
				System.out.println("==�α���==");
				
				// �α��� �ϰ��� �ϴ� id, pw �Է� �ޱ�
				
				// �Է� ���� ������ id�迭, pw�迭�� �����ϴ��� Ȯ�� �ϱ� > �α��� ����
				System.out.print("ID �Է� : ");
				String x = sc.next();
				System.out.print("PW �Է� : ");
				String y = sc.next();
				for (int i = 0; i < pw.length; i++) {
					if (x.equals(id[i])&&y.equals(pw[i])) { System.out.println("�α��� ����!");
				}
				
				}  
				
				} else {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}

		} while (a < 4);

	}
}
	