import java.util.Scanner;

public class ex_�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int sum = 0;
		int count = 0;
		do {
			System.out.print("���ڸ� �Է��ϼ���:");
			a = sc.nextInt();
			++count;
			sum += a;
			
		} while (a>0&&100>a);
		  
		System.out.println("�հ� : "+(sum-a));
		System.out.println("��� : "+(float)(sum-a)/(count-1));
		}
	
}
