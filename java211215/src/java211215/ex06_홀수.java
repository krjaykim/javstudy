package java211215;

import java.util.Random;

public class ex06_È¦¼ö {

	public static void main(String[] args) {
		
		int[]array = new int[5];
	
		Random r = new Random();
		int a = r.nextInt(20);
		int count = 0;
		System.out.print("array ÀÇ È¦¼ö´Â : ");
		for ( int i = 0; i < array.length; i++) {
			
			a = r.nextInt(20);
			array[i]=a;
			
			
				
			if(array[i]%2==1) {
				++count;
				System.out.print(array[i]+" ");
			}
	
	}System.out.print("°³¼ö´Â : "+count);
	}
}
