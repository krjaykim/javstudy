package java211220;

public class ex01_�������迭 {

	public static void main(String[] args) {

		// ������ �迭 �����ϱ�
		int[][]arr = new int[4][];
		// �� ���� ���� �� �����
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
