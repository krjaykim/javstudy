package java211220;

public class ex04_메소드 {

	public static void main(String[] args) {
	
		// 2. 메소드 호출
		addNum(4,2); // 5 라는 결과값   X
		
		
	}

	// 1. 메소드 선언 = 리턴이 없는 메소드
	public static void addNum(int num1, int num2) {
		int result = num1 + num2;
		
		// 메소드가 가질수 있는 알고리즘 명령으로 결과값 출력
		System.out.println("연산결과 : "+result);
		
	}
	
	
	
}
