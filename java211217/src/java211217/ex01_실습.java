package java211217;

public class ex01_�ǽ� {

	public static void main(String[] args) {
	
		int[]star = {3,4,4,2,1};
		
		for ( int i = 0; i < star.length; i++) {
			
			System.out.print(star[i]+" :"+"         ");
			
			
			
			for ( int j = 1; j<= star[i]; j++) 
			
				
				System.out.print("*");
		
				System.out.println(" ");
			}
		}

	
}