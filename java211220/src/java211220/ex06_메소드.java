package java211220;

public class ex06_�޼ҵ� {

	public static void main(String[] args) {
		
		// ���ϱ�(add) , ����(sub), ���ϱ�(mul), ������ �޼ҵ� �����(div)
//		int ad = add(1,2);
//		System.out.println("����"+ad);
		
		
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
