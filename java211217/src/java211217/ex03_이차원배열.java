package java211217;

public class ex03_�������迭 {

	public static void main(String[] args) {

		// ������ �迭 [��][ȣ] �����ϱ�
		
		int[][]arr = new int[2][3];
		int c = 0;

		for (int a= 0; a < 2; a++) {
			
			for (int b = 0; b < 3; b++) {
				++c;
				arr[a][b]=c;
			}
		}
		
		// arr[0][0]=1;
//		arr[0][1]=2;
//		arr[0][2]=3;
//		
//		arr[1][0]=4;
//		arr[1][1]=5;
//		arr[1][2]=6;
			
		for(int j = 0; j < 2; j++)
		{
		
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[j][i]);
			
//		}for (int i = 0; i < 3; i++) {
//			System.out.println(arr[1][i]);
		}
			System.out.println();
		

	}

	}
}