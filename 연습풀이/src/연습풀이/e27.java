package 연습풀이;

public class e27 {

	public static void main(String[] args) {
		
		int[][]arr = new int[5][5];
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=++a;
			
			System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}		
		System.out.println("   ");
		for (int j = 4; j >=0; j--) {
			for (int i = 0; i <arr.length; i++) {
				
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		}
		

	}


