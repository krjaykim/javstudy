import java.util.Scanner;

public class ex_����2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int total= sc.nextInt();
		
		int a = total/3600;
		int b = (total%3600)/60;
		int c = total%60;
		
		System.out.println(a+"��"+b+"��"+c+"��");
		
	}

}
