package 메소드실습;

public class ex01 {

	public static void main(String[] args) {
		
		System.out.println(lagerNumbers(50,2));

	}
	// 접근제한자 = public, private( 외부 클래스 파일에서 해당하는 메소드 사용 불가 !)
	public static int lagerNumbers(int num1, int num2) {

	
		
		if(num1>num2) {
			return num1;
		}else if(num2>num1)	{
			return num2;
		}else {
			return 0;
		}
		
			
		
		
		// 1. num1이 num2 보다 크다면  num1 을 결과값으로 반환
		
		// 2. num2가 num1 보다 크다면
		
		// 3. num1과 num2가 같다면 0을 결과값으로 반환
		
	
//		return result;
		
	
	}
	}

