package �޼ҵ�ǽ�;

public class ex04_���������ϱ� {

	public static void main(String[] args) {
	
		// ������ �ڱ� �ڽ��� ���� ������� ��������� �θ���
	
		
	
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
