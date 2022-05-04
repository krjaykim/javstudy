package java211220;

public class ex01_다차원배열 {

	public static void main(String[] args) {

		// 다차원 배열 선언하기
		int[][]arr = new int[4][];
		// 각 층에 대한 방 만들기
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
	
		int num = 1;

		
		for (int i = 0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j]=num++;
				
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println(arr);
		
	}

}
