package java211223;

public class �������� {

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
		// 3. 1������ �����Դ� ���� 2���� ���� �հ谡 ������ �Ǵ� (������ �Ǵ�)
		// - �������� ���� �� ���
		if(sum==i) {
			System.out.print(i+" ");
		}
		// ������ �ٸ� �������� ���Ͽ� ������ ��� �����հ踦 �ٽ� 0���� �����.
		sum = 0;
	}
}
}
		
		
		
	


