import java.util.Scanner;

public class ex01_switch {

	public static void main(String[] args) {
	
		//혈액형 별 결과를 알려주는 switch문 작성
		//A > "A형 입니다."
		//B > "B형 입니다."
		
		//사용자 에게 값을 입력받는 기능 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 값 >>");
		
	String result =sc.next();
	// 사용자가 입력한 값을 가지고 판단하기
	
	switch(result) {
	case "A":
		System.out.println("A형 입니다.");
		break;
	case "B":
		System.out.println("B형 입니다.");
		break;
	case "AB":
		System.out.println("AB형 입니다.");
		break;
	case "O":
		System.out.println("O형 입니다.");
		break;
		//case에 만족하지 않는 값이 들어올 경우 처리해 줄 수 있는 기능 만들기
		// > else문과 같은 역할을 한다.
		default:
			System.out.println("잘못된 혈액형 입니다.");
			break;
	}
	}

	}
