import java.util.Scanner;
// import 단축기 ctrl + shift + o
public class Ex01_Scanner {

	public static void main(String[] args) {
//		실행후 키보드로 데이터 입력 받기
		Scanner sc = new Scanner (System.in);
		

		
		System.out.print("첫 번째 정수입력 :");
		
		int num = sc.nextInt();
		System.out.println(num);
		System.out.print("두 번째 정수입력 :");
		int num2 = sc.nextInt();
		
		System.out.println(num2);
		
//		System.out.println("문자열 입력 :");
//		String s = sc.next();
//		
		
		
	}
	
}