import java.util.Scanner;

public class ex02_���� {

	public static void main(String[] args) {
		
		// 1. String Ÿ���� ���� data ����
		String data = "" ;
		
		// 2. Ű����� ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("user :");
		
		data = sc.next();
		
		switch(data) {
		case "�ȳ��ϼ���":
			System.out.println("pc : �� �ȳ��ϼ���!");
			break;
		case "�ݰ�����":
			System.out.println("pc : �� �ݰ�����!");
			break;
		case "�����ϼ���":
			System.out.println("pc : �� �����ϼ���!");
			break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				
				
				
		}
		
		
		// 3. data > "�ȳ��ϼ���" > "�� , �ȳ��ϼ���!" ���
		
		// 4. data > "�ݰ�����" > "��  , �ݰ�����!" ���
		
		// 5. data > "�����ϼ���" > "��, �����ϼ���!" ���
		
		// 6. �� �� �ٸ� ���� > "�߸� �Է��ϼ̽��ϴ�." ���
		
		
	}

}
