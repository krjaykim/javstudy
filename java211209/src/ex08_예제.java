import java.util.Scanner;

public class ex08_���� {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ : ");
		int now = sc.nextInt();
		System.out.println("��ǥ ������ : ");
		int goal = sc.nextInt();
		int d = 1;
		int sum = 0;
		do {
			System.out.println(d+"���� ���� ������:");
			int c = sc.nextInt();
			++d;
			now=now-c;
		} while (now>goal);
		
	System.out.println(now+"������ ��");	
	}

}
