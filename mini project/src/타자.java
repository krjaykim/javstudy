import java.util.Random;
import java.util.Scanner;

public class Å¸ÀÚ {

	public static void main(String[] args) {
		

	Random rc = new Random();
	
	int[][]com = new int[5][5];
	int comNum = 0;
	
	
	for (int i = 0; i < com.length; i++) {
		for (int j = 0; j < 5; j++) {
			com[i][j] = ++comNum;
		
			
		System.out.print(com[i][j]+"\t");
		}
	System.out.println();
	}
	
	int bet = rc.nextInt(5);
	int bet2 = rc.nextInt(5);
		
	
	System.out.println(com[bet][bet2]);
	
	
	
	

	
	}
}
