import java.util.Scanner;

public class ex02_while예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		while (a%2==1) {
			System.out.print("정수 입력  : ");
			a = sc.nextInt();
			
		}
		System.out.println("종료되었습니다.");
	}

}
