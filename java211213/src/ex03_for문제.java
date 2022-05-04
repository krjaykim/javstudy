
public class ex03_for문제 {

	public static void main(String[] args) {
		
	
//		for (int i = 1; i < 11; i++) {
//			if(i%3!=0)
//			System.out.println(i);
//		}

//		int a = 0 ;
//		
//	for (int i = 1; i < 101; i++) {
//		
//		int result = i%2==1 ? i : -i ;
//		
//	 a += result;
//	}System.out.println(a);

		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i <=100; i++) {
			if(i%2==0) {
				System.out.print(-i+"");
			sum1+=-i;
			
		}else {System.out.print(i);
			sum2+=i;
			
		}
		
		
		}
		System.out.println();
		System.out.println("결과"+(sum1+sum2));
	}
}

