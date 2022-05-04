import java.util.Scanner;

public class ex02_연습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a ="";
		
		do {
			System.out.print("첫번째 정수를 입력하세요>>");
			int b = sc.nextInt();
			System.out.print("두번째 정수를 입력하세요>>");
			int c = sc.nextInt();
			System.out.print("[1]더하기[2]빼기 >>");
			int d = sc.nextInt();
			if (d==1)  System.out.print("더하기 연산 결과는 "+(b+c)+"입니다.");
			else if (d==2) { System.out.print("빼기 연산 결관는"+(b-c)+"입니다.");
			
			}{
			System.out.println("다시실행하겠습니다? (y/n)");
			a = sc.next();
			}
		} while (a.equals("Y"));
		
		if(a.equals("N")) {System.out.println("종료되었습니다.");
		}
}
}