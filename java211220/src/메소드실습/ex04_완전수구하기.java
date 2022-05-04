package 메소드실습;

public class ex04_완전수구하기 {

	public static void main(String[] args) {
	
		// 완전수 자기 자신을 뺴고 약수들을 완전수라고 부른다
	
		
	
		System.out.println(getsome(6));
		System.out.println(isperfect(8));
	}
	
	public static int getsome(int num) {
		
		
		int a = 0;
		for (int i = 1; i < num; i++) {
			
			if(num%i==0) {
				
				a+=i;
				
				}
		
			
		
			
		}
		
		return a;
		
	}

	public static boolean isperfect(int a) {
		
		if(getsome(a)==a) {
			return true;
		}
			return false;
		
		
	}
}
