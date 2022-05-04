import java.util.Scanner;

public class ex_예제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력 : ");
		int total= sc.nextInt();
		
		int a = total/3600;
		int b = (total%3600)/60;
		int c = total%60;
		
		System.out.println(a+"시"+b+"분"+c+"초");
		
	}

}
