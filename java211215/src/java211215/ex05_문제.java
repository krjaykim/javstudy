package java211215;

import java.util.Random;

public class ex05_¹®Á¦ {

	public static void main(String[] args) {
		
		int[] array = new int[10];

		Random r = new Random();
		int a = r.nextInt(100) + 1;

		for (int i = 0; i < array.length; i++) {

			a = r.nextInt(100) + 1;

			array[i] = a;

			if (array[i] % 2 == 0)
				System.out.print(array[i] + " ");
		}
	}
}
