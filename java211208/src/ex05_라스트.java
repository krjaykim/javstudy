import java.util.Scanner;

public class ex05_��Ʈ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
	
		int a = sc.nextInt();
		
		switch (a/1) {
		case 12:
		case 1: 
		case 2:
			System.out.println(a+"���� �ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(a+"���� ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(a+"���� �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
				System.out.println("�����Դϴ�.");
			default:
				System.out.println("wrong int");
			
		}

	}

}
