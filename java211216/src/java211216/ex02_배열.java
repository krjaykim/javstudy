package java211216;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ex02_배열 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Random r = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(20) + 1;
			System.out.print(array[i]+" ");
		}
			int max = 0;
			int min = array[0];
			
			for (int i = 0; i < array.length; i++) {
				
				if(max<array[i]) {
					max = array[i];
				}else if(min>array[i]) {
					min = array[i];
	
				
			System.out.println();
			System.out.println("가장큰 값은 "+max+"입니.");
			System.out.println();
			


			}
		}
	}	
}