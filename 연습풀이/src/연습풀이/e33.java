package ����Ǯ��;

import java.util.Scanner;

public class e33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� >>>");
		// nextLing = ������ ������ ���ڿ� �Է� ����
		String str = sc.nextLine();
		
		// ���ĺ� �󵵼��� �������� �迭 ����
		int[]cnt = new int[26];
		
		// �Էµ� ���ڿ� >> �ƽ�Ű�ڵ尪 (����)
		
		for (int i = 0; i < str.length(); i++) {
			char  ch = str.charAt(i);
			
			if(ch >= 'A'&& ch<='Z') {
				// ������ �� ch���� �빮������ �Ǵ��ϱ�
				cnt[ch-'A']++;
				
			}else if(ch>='a'&&ch<='z') {
				// ������ �� ch���� �ҹ������� �Ǵ��ϱ�
				cnt[ch-'a']++;
			
			}
		}
		
		
		
			// ī��Ʈ �� ���� ����ϱ�
			for(int i=0; i<26; i++) {
				System.out.println((char)(i+97) + ":" + cnt[i]);
			}
	}
}
