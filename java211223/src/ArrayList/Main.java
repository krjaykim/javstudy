package ArrayList;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		//�����ϴ� ����
		//1. Student �ڷ��� �����ϴ�   Arraylist �����غ���
	
		ArrayList<Student> who = new ArrayList<Student>();
		
		//2. ������ �찡�ϱ�
		// �Ͽ��� 20211223 20
		
		who.add(new Student("�Ͽ���", 20211223, 20));
		who.add(new Student("������", 20211224, 20));
		who.add(new Student("�迵��", 20211225, 20));
		
		
		//3. ������ ��������
		
			System.out.println(who.get(0).getName());
	}	
}
		
	
		
