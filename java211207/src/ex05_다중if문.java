import java.util.Scanner;

public class ex05_����if�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�� ������ :");

		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("����Դϴ�.");

		} else if (num < 0) {
			System.out.println("�����Դϴ�.");

		} else
			System.out.println("0�Դϴ�.");

	}

}
