package java211210;

import java.util.Random;
import java.util.Scanner;

public class ex05_랜덤숫자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String s ="Y";
		int num1 = r.nextInt(20)+1;
		int num2 = r.nextInt(20)+1;
		
		while(s.equals("Y"))
		{
		System.out.println(num1+"+"+num2+"=");
		int goal = sc.nextInt();
		
		if(goal == num1+num2) {
			System.out.println("Success");
			num1 = r.nextInt(20)+1;
			num2 = r.nextInt(20)+1;
		}else {
			System.out.println("Fail");
		}
		System.out.println("계속하냐? Y/N");
		s = sc.next();
	
		
		
		}
	}

}
