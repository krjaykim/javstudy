package java211220;

public class ex03_�޼ҵ� {

	public static void main(String[] args) {
		
		// class ����� ���� ���� ȣ��Ǵ� �� >>> main() 

		// �޼ҵ带 ����ϱ� ���� ȣ���� ������ main( ) �ȿ��� ȣ���Ѵ�.
		// - �� ȣ�� ���� �޼ҵ尡 ���� �Ǿ�� �Ѵ�!
		// - �޼ҵ带 �����ϴ� ������ main()�� ��� �������� ������ �Ѵ�!
		
		int total = addNum(3, 5);
		System.out.println("��� : "+total);
		
		System.out.println(addNum(2,4));
		System.out.println(addNum(4.6,54.2));
	}	// main() ������ �κ�
	
	// �޼ҵ带 ���� �� �� �ִ� ���� (class�� �̸鼭  main() ��)
	// �޼ҵ� : ��� ����� �����ϴ� ��ɹ����� ���յǾ� �ִ� ��

	// �޼ҵ��� ���� 
	// 1) ���� ������ (������) : public ( ����/ �ܺ� ��� ������ ������ ������ )
	// 2) static Ű����
	// 3) ����Ÿ�� : �޼ҵ��� �˰����� ���� �� �������� ����� 
	//       = void : �޼ҵ� ������ Ÿ���� ���� ���
	// 4) �޼ҵ� �̸� : �޼ҵ� ȣ��� ����� �̸�
	// 5) �Ű����� : �޼ҵ� �������� ����� ������ ���� >> �޼ҵ带 ����ϱ� ���� ���
	
	public static int addNum(int num1, int num2) {
	
	int result = num1 + num2;

	return result;
	}
	
	public static double addNum(double num1, double num2) {
		double result = num1+num2;
		return result;
	}
} // class ������ �κ�





// �޼ҵ� �����ε� (�ߺ�����) / �������̵�  (������)
// �ߺ����� : ���� Ŭ�������� �޼ҵ带 ���� �Ҷ�
// - �޼ҵ��� �̸��� ���ƾ� �Ѵ�.
// - �Ű������� ������ �ٸ��ų� �Ű������� Ÿ���� �޶�� �Ѵ�.
