import java.util.Scanner;

public class ex02_예제 {

	public static void main(String[] args) {
		
		// 1. String 타입의 변수 data 선언
		String data = "" ;
		
		// 2. 키보드로 값을 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("user :");
		
		data = sc.next();
		
		switch(data) {
		case "안녕하세요":
			System.out.println("pc : 네 안녕하세요!");
			break;
		case "반가워요":
			System.out.println("pc : 네 반가워요!");
			break;
		case "수고하세요":
			System.out.println("pc : 네 수고하세요!");
			break;
			default :
				System.out.println("잘못 입력하셨습니다.");
				
				
				
		}
		
		
		// 3. data > "안녕하세요" > "네 , 안녕하세요!" 출력
		
		// 4. data > "반가워요" > "네  , 반가워요!" 출력
		
		// 5. data > "수고하세요" > "네, 수고하세요!" 출력
		
		// 6. 그 외 다른 문장 > "잘못 입력하셨습니다." 출력
		
		
	}

}
