import java.util.Scanner;

public class ex01_switch {

	public static void main(String[] args) {
	
		//������ �� ����� �˷��ִ� switch�� �ۼ�
		//A > "A�� �Դϴ�."
		//B > "B�� �Դϴ�."
		
		//����� ���� ���� �Է¹޴� ��� �����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է� �� >>");
		
	String result =sc.next();
	// ����ڰ� �Է��� ���� ������ �Ǵ��ϱ�
	
	switch(result) {
	case "A":
		System.out.println("A�� �Դϴ�.");
		break;
	case "B":
		System.out.println("B�� �Դϴ�.");
		break;
	case "AB":
		System.out.println("AB�� �Դϴ�.");
		break;
	case "O":
		System.out.println("O�� �Դϴ�.");
		break;
		//case�� �������� �ʴ� ���� ���� ��� ó���� �� �� �ִ� ��� �����
		// > else���� ���� ������ �Ѵ�.
		default:
			System.out.println("�߸��� ������ �Դϴ�.");
			break;
	}
	}

	}
