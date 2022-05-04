import java.util.Scanner;

public class ex01_새예제 {

	public static void main(String[] args) {
	
		// y를 입력했을 경우 반복 실행
		// n을 입력했을 경우 반복이 멈추는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		String s ="y";
		
	do {
		System.out.println("다시하겠습니까 ? (Y/N) >>");
		s = sc.next();
		
		
	} while (s.equals("N"));
	System.out.println("끝");
			
	}

}
