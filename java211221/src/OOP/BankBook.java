package OOP;

public class BankBook {
	//������ ���� Ŭ���� (���赵��)
	
	// 1. �ʵ�, �Ӽ�, ������ = �� ��ü�� ������ �ִ� ��
	// �ܾ�(money)
	private int money;
	// �ܺ� Ŭ�����κ��� �Ժη� ������ �� ���Բ� ��������! (ĸ��ȭ)
	
	// ��ü�� ������ �� �ʵ忡 �ִ� ���� �ʱ�ȭ ��ų �� �ִ� �޼ҵ� ����
	// ������(constructor)
	// 1. �����ڴ� �޼ҵ��.
	// 2. �����ڴ� �޼ҵ� �̸��� Ŭ������ �̸��� �����ϴ�.(��ҹ��ڰ����� �����ؾ���)
	// 3. ����Ÿ���� �������� �ʴ´�.(void�� ���� �ʴ´�)
	// 4. �Ű������� �ƹ��͵� ���� �ʴ� �����ڸ� �⺻������(default constructor)��� �Ѵ�.
	// >>>> �⺻�����ڴ� ������ �����ϴ�.
	// >>>> ��, ���ο� �����ڸ� ����ٸ� �⺻�����ڴ� ���������.
	
	public BankBook(int money) {
		this.money = money;
	}
	
	
	
	
	
	

	
	// �ܺ� Ŭ�����κ��� �Ժη� ������ �� ���Բ� ��������!(ĸ��ȭ)
	
	//�⺻ ������
	//�Ű������� ������ Ÿ���� �ٸ��� �ؼ� �ߺ����� �����ϴ°� == �޼ҵ� �����ε�
//	public BankBook() {
//
//	}
//



	
	
	


	// 2. �޼ҵ�, ���, ���� = �� ��ü�� ������ �ִ� ��
	// ���� �ִ´�. deposit
	// �Ű������� int �����͸� �޾ƿͼ� �ƹ��� ���� ��ȯ���� �ʴ� deposit �޼ҵ� ����
	public void deposit(int money) {
		this.money += money;
		// this >> Ŭ���� �� �ڽ��� ����Ű�� Ű����!
	};
	
	// ���� �����Ѵ�. withdraw
	public void withdraw(int money) {
		//�ʵ忡 �ִ� money�� �Ű������� �޾ƿ� money ���鼭 ������Ű��
		this.money-=money;
	};
	// �ܾ��� �����ش�. showMoney
	public int showMoney() {
		return money; //�ʵ忡 �ִ� ������ �����ͼ� �����ְڴ�.
		
	};
}

