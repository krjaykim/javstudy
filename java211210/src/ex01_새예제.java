import java.util.Scanner;

public class ex01_������ {

	public static void main(String[] args) {
	
		// y�� �Է����� ��� �ݺ� ����
		// n�� �Է����� ��� �ݺ��� ���ߴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		String s ="y";
		
	do {
		System.out.println("�ٽ��ϰڽ��ϱ� ? (Y/N) >>");
		s = sc.next();
		
		
	} while (s.equals("N"));
	System.out.println("��");
			
	}

}
