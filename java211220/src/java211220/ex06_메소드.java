package java211220;

public class ex06_메소드 {

	public static void main(String[] args) {
		
		// 더하기(add) , 빼기(sub), 곱하기(mul), 나누기 메소드 만들기(div)
//		int ad = add(1,2);
//		System.out.println("값은"+ad);
		
		
		System.out.println(add(4,5));
	
		System.out.println(add(87,84));
		
		System.out.println(sub(7,5));
		
		System.out.println(mul(48,0));

		System.out.println(div(6,3));
	}
	public static int add(int a, int b) {
		
		int result = a+b;
		
		return result;
	}
	public static int sub(int a, int b) {
		
		int result = a-b;
		
		return result;
	}
	public static int mul(int a, int b) {
		
		int result = a*b;
		
		return result;
	}
	public static int div(int a, int b) {
		
		int result = a/b;
		
		return result;
	}
}
