package java211216;

import java.util.Scanner;

public class ex04_oo {
	public static void main(String[] args) {
		
		// String ������ �迭 �����ϱ� (5ũ��)
		// �츮 ������ �̸� �־��ֱ�!
		
		String[] team = {"�赿��", "���ο�","������","���ع�","��ġ��"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�˻��� �̸� : ");
		String search = sc.next();
	
		//�˻��� �̸��� ���°�� ��ġ�ϴ��� ��ġ�� ��ȯ�ϱ�
		for (int i = 0; i < team.length; i++) {
			if(team[i].equals(search)) {
				System.out.print("���°�ΰ�?"+(i+1));
			}
		}
	}

}
