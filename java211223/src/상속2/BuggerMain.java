package ���2;

public class BuggerMain {

	public static void main(String[] args) {
	
		// 1. �⺻ �ܹ��Ÿ� ����� �ִ� ���� Ŭ���� �����ϱ�
		// �߻� Ŭ������ ��ü ������ �Ұ����ϴ�
		
//		Buger buger= new Buger();
		
		// 2. �⺻ �ܹ��Ÿ� �����޴� Cheese Ŭ���� �����ϱ�
		
		Cheese chese = new Cheese();
		
		
		// Bugger �� �����޴� �پ��� �ܹ��� Ŭ���� �����ϱ�
		// shrimp, chicken
		
//		buger.make();
		chese.make();
		
		
		System.out.println(chese.price);
		
		ShrimpBuger Sh = new ShrimpBuger();
		
		Sh.make();
	
		
		// ��ĳ���� : �ڽ��� ��ü�� �θ��� ��ü�� ���� �� �� �ֵ��� �ϴ°� !@
	Buger buger = new ShrimpBuger();
	Buger buger2 = new Cheese();
	
	System.out.println("������ �ٸ� ���� ���̱�");
	
	buger.make();
	
	
	// �ٿ� ĳ���� : ��ĳ���� �� ������ ���������� ( ����� ) Ÿ���� ��ȯ�ϴ°�
	// �ٿ� ĳ������ ���� : �ݵ�� ��ĳ���� �Ǿ��ִ� ȯ�ܿ��� �ٽ� �ٿ� ĳ������ �����ϴ� 
	
	ShrimpBuger shrimp2 = (ShrimpBuger)buger;
	
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
