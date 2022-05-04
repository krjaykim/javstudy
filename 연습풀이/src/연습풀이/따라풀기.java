package 연습풀이;

import java.util.Scanner;

public class 따라풀기 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("입력>>");
	String eg = sc.next();
	
	int[]dg = new int[26];
	
	for (int i = 0; i < dg.length; i++) {
		char x = eg.charAt(i);
		
		if(x>='A'&&	x<='Z') {
			dg[x-'A']++;
		}else if(x>='A'&&x<='Z') {
			dg[x='a']++;
		}
	}
	for (int i = 0; i< 26; i++) {
		System.out.println((char)(i+97)+":"+dg[i]);
	}
	
	}	
}
