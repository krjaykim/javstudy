import java.util.Scanner;

public class ex05_라스트 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
	
		int a = sc.nextInt();
		
		switch (a/1) {
		case 12:
		case 1: 
		case 2:
			System.out.println(a+"월은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(a+"월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(a+"월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
				System.out.println("가을입니다.");
			default:
				System.out.println("wrong int");
			
		}

	}

}
