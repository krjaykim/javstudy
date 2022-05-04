import java.util.Scanner;

public class ex_휴 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int sum = 0;
		int count = 0;
		do {
			System.out.print("숫자를 입력하세요:");
			a = sc.nextInt();
			++count;
			sum += a;
			
		} while (a>0&&100>a);
		  
		System.out.println("합계 : "+(sum-a));
		System.out.println("평균 : "+(float)(sum-a)/(count-1));
		}
	
}
