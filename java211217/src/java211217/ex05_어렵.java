package java211217;

public class ex05_어렵 {
	
		public static void main(String[] args) {
			
			System.out.println("원본 배열");
			int[][]arr = new int[5][5];
			
			int a = 21;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 4; j >= 0; j--) {
					a++;
					arr[i][j]=a;
				}
			
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					
					System.out.print(arr[j][j2]+"\t");
				}
			
			System.out.println();}
			}
			
		}

	
		

	}

