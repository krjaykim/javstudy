package PocketMon;

import java.util.Arrays;

public class ex_��ü�迭 {

	public static void main(String[] args) {
	
		//��ü�迭 ����
		PocketMon[]bag	=	new PocketMon[3];
		//���� ���� �ʴ´ٸ� �⺻������ null���� ���´�
		System.out.println(bag[2]);
		
		
		//bag >> 3ĭ¥�� �ſ��� ����Ǿ� �ִ� �ּҰ��� ���� ���۷��� ����
		System.out.println(bag);
		
		//bag[0]�� �� �ֱ�!
		bag[0] = new PocketMon("�ս���", "��", 1, "�Ӹ���ġ��", 100, 100, 100);	
		//������ ������ ��ü�� ��� ����Ǿ��ִ����� ����Ű�� �ּҰ�
		System.out.println(bag[0].getName());
		
		
		
		
		
		
	}

}
