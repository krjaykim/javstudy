package OOP;

public class BankBookMain {

	public static void main(String[] args) {
	
		// 1. BankBook ���赵����  ������� bank ��ü ����
		
		// 2. bank�� ������ �ִ� money �ʵ��ǰ��� 1000���� �ʱ�ȭ
		
		// 3. bank ���� 1500���� �Ա����ּ���.
		
		// 4. �ܾ� ���
		
		// 5. bank���� 700���� ������ּ���
		
		// 6. �ܾ� ���
		
		BankBook jay = new BankBook(10000);
		
		jay.deposit(10000);
		
//		System.out.println(jay.money);
		
//		jay.money += 1200;
		//jay.deposit(1500);
//		System.out.println(jay.money);
		
		jay.showMoney();
		
		jay.withdraw(700);

		
		System.out.println(jay.showMoney());
//		System.out.println(jay.money);
		

	}

}
