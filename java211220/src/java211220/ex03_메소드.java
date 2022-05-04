package java211220;

public class ex03_메소드 {

	public static void main(String[] args) {
		
		// class 실행시 가장 먼저 호출되는 것 >>> main() 

		// 메소드를 사용하기 위해 호출할 때에는 main( ) 안에서 호출한다.
		// - 단 호출 전에 메소드가 정의 되어야 한다!
		// - 메소드를 정의하는 영역은 main()를 벗어난 공간에서 만들어야 한다!
		
		int total = addNum(3, 5);
		System.out.println("결과 : "+total);
		
		System.out.println(addNum(2,4));
		System.out.println(addNum(4.6,54.2));
	}	// main() 끝나는 부분
	
	// 메소드를 정의 할 수 있는 영역 (class안 이면서  main() 밖)
	// 메소드 : 어떠한 기능을 수행하는 명령문들이 집합되어 있는 것

	// 메소드의 구조 
	// 1) 접근 제한자 (지정자) : public ( 내부/ 외부 모두 접근이 가능한 제한자 )
	// 2) static 키워드
	// 3) 리턴타입 : 메소드의 알고리즘을 수행 후 돌려지는 결과값 
	//       = void : 메소드 리턴의 타입이 없을 경우
	// 4) 메소드 이름 : 메소드 호출시 사용할 이름
	// 5) 매개변수 : 메소드 내에서만 사용이 가능한 변수 >> 메소드를 사용하기 우한 재료
	
	public static int addNum(int num1, int num2) {
	
	int result = num1 + num2;

	return result;
	}
	
	public static double addNum(double num1, double num2) {
		double result = num1+num2;
		return result;
	}
} // class 끝나는 부분





// 메소드 오버로딩 (중복정의) / 오버라이딩  (재정의)
// 중복정의 : 같은 클래스에서 메소드를 정의 할때
// - 메소드의 이름이 같아야 한다.
// - 매개변수의 갯수가 다르거나 매개변수의 타입이 달라야 한다.
