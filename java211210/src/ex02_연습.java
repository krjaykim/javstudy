import java.util.Scanner;

public class ex02_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a ="";
		
		do {
			System.out.print("ù��° ������ �Է��ϼ���>>");
			int b = sc.nextInt();
			System.out.print("�ι�° ������ �Է��ϼ���>>");
			int c = sc.nextInt();
			System.out.print("[1]���ϱ�[2]���� >>");
			int d = sc.nextInt();
			if (d==1)  System.out.print("���ϱ� ���� ����� "+(b+c)+"�Դϴ�.");
			else if (d==2) { System.out.print("���� ���� �����"+(b-c)+"�Դϴ�.");
			
			}{
			System.out.println("�ٽý����ϰڽ��ϴ�? (y/n)");
			a = sc.next();
			}
		} while (a.equals("Y"));
		
		if(a.equals("N")) {System.out.println("����Ǿ����ϴ�.");
		}
}
}