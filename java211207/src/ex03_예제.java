import java.util.Scanner;

public class ex03_예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		
		int a = sc.nextInt();
		
		if (a%2==0) {System.out.println(a+"는(은) 짝수입니다.");
		}else {System.out.println(a+"는(은) 홀수입니다.");

		}
		
		
	}

}
