package java211223;

public class ㅇㄻㅇㄹ {

	public static void main(String[] args) {
		
		getPerfectNumber(1,1000);
	
	}
public static void getPerfectNumber(int a, int b) {
	
	boolean ans = false;
	int sum = 0;
//	int sum = 0;
//	for (int i = a; i <=b; i++) {
//		
//		for (int j = 1; j < a; j++) {
//			if(a%j==0) {
//				sum+=j;
//			}
//			if(a==sum) {
//				return a;
//			}
//			
//		}
//	}
//	return a;
//	
//	int corr = 0;
//	int c = 0;
//	for (int i = 1; i < a; i++) {
//
//		if (a % i == 0) {
//
//			c += i;
//
//		}
//	}
//
//	if (c == a) {
//		ans = true;
//
//	} else { 
//		ans = false;
//	}
//	for (int i = a; i <= b; i++) {
//		if (ans == true);
//			
//	}
//	
	
	for (int i = a; i <= b; i++) {
		
		for (int j = 1; j < i; j++) {
			if(i%j==0) {
				sum+=j;
			}
		}
		// 3. 1번에서 가져왔던 수와 2번의 누적 합계가 같은지 판단 (완전수 판단)
		// - 완전수에 대한 값 출력
		if(sum==i) {
			System.out.print(i+" ");
		}
		// 이후의 다른 완전수를 위하여 기존의 약수 누적합계를 다시 0으로 만든다.
		sum = 0;
	}
}
}
		
		
		
	


