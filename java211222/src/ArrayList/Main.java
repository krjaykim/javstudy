package ArrayList;

import java.util.ArrayList;

import PocketMon.PocketMon;

public class Main {

	public static void main(String[] args) {
		
		// �������� �迭�� ���� ���¸� �������ִ� Ŭ���� ArrayList
		// ArrayList �����ϱ�
		// ArrayList <������ ������ �ڷ���> ������
		// <> >> ���׸����
		// : ArrayList �� �����ϴ� ������ ������ �ڷ����� �����ϴ� ���
		
		// ��ü������ �ڷḸ ���� �����ϴ� (int boolean, cha��  �⺻�ڷ����� ������ �ȵȴ�.)
		 
		ArrayList<String> list = new ArrayList<String>();
		//�� �߰��ϱ�
		
		list.add("gkdl");
		list.add("����");
		list.add("�ٴ�");
		
		// �� ��������
		System.out.println(list.get(0));
		
		// �� �����
		list.remove(0);
		
		System.out.println(list.get(1));
		
		list.add("���");
		list.add("���");
		
		// ����Ǿ��ִ� �������� �� ũ�� ��������
		System.out.print(list.size());
		System.out.println("");
		
		// ���� ���
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
			
		// ArrayList�ȿ� �ִ� ��� ������ �����ϱ�
		list.clear();
		System.out.println(list.size());
		
		}
		
		
		
		
	}

}
