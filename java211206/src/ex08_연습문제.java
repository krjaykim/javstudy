import java.util.Scanner;

public class ex08_�������� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�󱸰��� ������ �����ÿ� : ");
		
		 int a = sc.nextInt();
		 
		 int result = a%5==0? a/5 : a/5+1;
		 
		 System.out.println("�ʿ��� ������ ������ : "+result);
		 
	}

}
