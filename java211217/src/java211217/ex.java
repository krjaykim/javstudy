package java211217;

public class ex {

	public static void main(String[] args) {
		
		int[][] strikezone = new int[5][5];
		int locationnum = 1;
		
		for (int i = 0; i < strikezone.length; i++) {
			for (int j = 0; j < 1; j++) {
				strikezone[i][j] = locationnum;
				locationnum++;
				System.out.print(strikezone[i][j] + "\t");
			} System.out.println();

			for (int j = 1; j < 2; j++) {
					strikezone[i][j] = locationnum;
					locationnum++;
				
					System.out.print(strikezone[i][j] + "\t");
				
				
					for ( j = 2; j < 3; j++) {
						strikezone[i][j] = locationnum;
						locationnum++;
						System.out.print(strikezone[i][j] + "\t");
						
						for ( j =3; j < 4; j++) {
							strikezone[i][j] = locationnum;
							locationnum++;
							System.out.print(strikezone[i][j] + "\t");
						
							for ( j = 4; j < 5; j++) {
								strikezone[i][j] = locationnum;
								locationnum++;
								System.out.print(strikezone[i][j] + "\t");
								
									
			}
			System.out.println();

		}
	}


	}
}
		}
	}
}