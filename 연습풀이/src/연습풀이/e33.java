package 연습풀이;

import java.util.Scanner;

public class e33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 >>>");
		// nextLing = 공북을 포함한 문자열 입력 가능
		String str = sc.nextLine();
		
		// 알파벳 빈도수를 세기위한 배열 생성
		int[]cnt = new int[26];
		
		// 입력된 문자열 >> 아스키코드값 (숫자)
		
		for (int i = 0; i < str.length(); i++) {
			char  ch = str.charAt(i);
			
			if(ch >= 'A'&& ch<='Z') {
				// 가지고 온 ch값이 대문자인지 판단하기
				cnt[ch-'A']++;
				
			}else if(ch>='a'&&ch<='z') {
				// 가지고 온 ch값이 소문자인지 판단하기
				cnt[ch-'a']++;
			
			}
		}
		
		
		
			// 카운트 된 갯수 출력하기
			for(int i=0; i<26; i++) {
				System.out.println((char)(i+97) + ":" + cnt[i]);
			}
	}
}
