import java.util.Scanner;

public class ex03_while {

	public static void main(String[] args) {
String s = "Y";
Scanner sc = new Scanner(System.in);
System.out.println("ù ��° ������ �Է��ϼ��� >>");
int a = sc.nextInt();
System.out.println("�� ��° ������ �Է��ϼ��� >>");
int b = sc.nextInt();
System.out.println("[1]���ϱ�[2]����>>");
int what = sc.nextInt();

if(what==1) {
	System.out.println("���ϱ� ���� �����"+(a+b)+"�Դϴ�");
}else if(what==2) {System.out.println("���� �����"+(a-b)+"�Դϴ�");
}
System.out.println("�ٽ� �����Ͻðڽ��ϱ�? (y/n)>>");
s = sc.next();

	}

}
