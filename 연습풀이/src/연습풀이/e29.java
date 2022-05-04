package 연습풀이;

import java.util.Scanner;

public class e29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫 자리 0을 제외한 숫자를 입력해주세요 >>");
		
		String a = sc.next();
		
		String[]arr = a.split("");
		
		int b = 0;
		
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case "0":
				b += 6;
				break;
			case "1":
				b += 2;
				break;
			case "2":
				b += 5;
				break;
			case "3":
				b+= 5;
				break;
			case "4":
				b+=4;
				break;
			case "5":
				b+=5;
				break;
			case "6":
				b+=6;
				break;
			case "7":
				b+=3;
				break;
			case "8":
				b+=7;
				break;
			case "9":
				b+=6;
				break;
			}
			
			
			
		}System.out.println(b);
		
		
		
		
		
		
		
		
	}

}
