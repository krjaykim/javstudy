package �߻�Ŭ����;

public abstract class Employee {
	
	// ��� ���޿� ���Ͽ� ����� �ʵ� ��������
    protected String empno;
    protected String name;
    protected int pay;
	
	//  �ٸ� Ŭ�������� ���������� �ݵ�� ��üȭ �� �� �ֵ��� ����
    public abstract int getMoneyPay();
  
    // �Ϲ� �޼ҵ� >> �߻� Ŭ������ �߻� �޼ҵ� (�ʼ�) �� �Ϲ� �޼ҵ带 ������ �ִ�!
    public String print() {
    	return empno + ":" + name + ":" + pay;
    }
    
	

}
