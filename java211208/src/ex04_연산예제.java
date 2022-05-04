import java.util.Scanner;

public class ex04_연산예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		
		int TS = sc.nextInt();
		
		switch (TS/10) {
		case 10:
		case 9:
				
			System.out.println("A학점 입니다.");
			
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
			default:
				System.out.println("D학점 입니다.");
			
		
			
		}
	}

}
