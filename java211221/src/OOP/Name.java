package OOP;

import java.util.Arrays;

public class Name {

	public static void main(String[] args) {
		// �����ϴ� ����!
		// ���赵���� ������� ���� ��ü�� ����!
		
		Person dongguk = new Person();


		// dongguk�� �ּҰ��� ������ �ִ� ���۷��� �����̴�.
		System.out.println(dongguk.gender);

		dongguk.gender='��';
	
		System.out.println(dongguk.gender);
	
		//�ʵ忡 �ִ� �̸�, Ű, ��� ������ ä���!
		dongguk.height = 176.1;
		dongguk.name = "jaykim";
//		dongguk.organs = {};
		//>> {} �� �ڷ����� �����ִ� �������� ����� �� �ִ�.
		
		dongguk.organs = new String[] {"����","��","����"};
	
		System.out.println(Arrays.toString(dongguk.organs));

		System.out.println(dongguk.height);
		System.out.println(dongguk.organs);
		
		dongguk.think("���");
		
		
		// �ϳ��� ���赵���� ������� �������� ��ü�� ������ �� �ִ�.
		Person yw = new Person();
		System.out.println(yw.name);
	
	
	}
	
}
		
		