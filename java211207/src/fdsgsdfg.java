import java.util.Scanner;

public class fdsgsdfg {

	public static void main(String[] args) {
		
		int result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("�ݾ��� �Է��Ͻÿ� :");
		int a = sc.nextInt();
		System.out.println("�޴��� ���ÿ�");
		System.out.print("1.�ݶ�(800��) 2.����(500��) 3.��Ÿ�ο���(1500��)>>");
		int b = sc.nextInt();

		if (a - 800 < 0 && a - 500 < 0 && a - 1500 < 0) {
			System.out.println("���̺����ؿ�Ф�");
			System.out.println("�ܵ� :" + (a) + "��");

		} else if (b == 1) {
			result = a - 800;

		} else if (b == 2) {
			result = a - 500;

		} else if (b == 3) {
			result = a - 1500;

		}

		System.out.println("�ܵ� :" + result + "��");
		System.out.println("õ�� :"+result/1000+"��"+"����� :"+(result%1000)/500+"��"+"��� :"+result%500/100+"��");
	}
	
	



	}


