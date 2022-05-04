package java211215;

import java.util.Random;

public class ex04_¹®Á¦ {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		Random r = new Random();
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			int a = r.nextInt(20);
			array[i]=a;
			
			System.out.print(array[i]+"  ");	
			sum = sum + array[i];
			
		}System.out.println(" ");
		System.out.println(array[3]+array[9]);
		System.out.println(sum);
		System.out.println((float)sum/array.length);
	}
	
}
