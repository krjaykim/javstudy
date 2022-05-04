import java.util.Scanner;

//class 이름 바꾸기
// 들여쓰기 단축기 ctrl+shift+F
public class ex02_단순if문 {

	public static void main(String[] args) {
// if (조건식) {
//		실행문
//	}

		// age라는 변수에 나이를 입력받고 나이가 20이상이라면"성인입니다."를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력 : ");

		int age = sc.nextInt();
		if (age >= 20) {
			System.out.println("나이는" + age + "살입니다");
			System.out.println("성인입니다.");

		} else {
			System.out.println("나이는" + age + "살입니다");
			System.out.println("청소년입니다.");

		}
		System.out.println("프로그램 종료");

	}

}
