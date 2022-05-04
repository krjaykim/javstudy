
public class ex03_for {

	// 1. 1~100 까지 숫자 만들
	// 2. 3의 배수에 해당하는 값 찾기
	// 3. 3의 배수값 누적 합계 구하기
	
	
	public static void main(String[] args) {
		int b =0 ;
		for (int i = 1; i < 101; i++) {
			if(i%3==0)
				b+=i;
			
			
		}System.out.println(b);
}
	
}