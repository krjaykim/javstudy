package java211220;

public class ex02_���̾� {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int num = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 2-i; j <=2+i; j++) {
				
				arr[i][j]=++num;
				
			}
		}
		// 3~4�� ���� �ﰢ�� �׸���
		
		 for (int i = 3; i <=4; i++) {
			 for (int j = i-2; j <= 6-i; j++) {
				arr[i][j]=++num;
			}
		}
		
		 for (int a = 0; a < arr.length; a++) {
			 for (int b = 0; b < arr.length; b++) {
				
				 
				 System.out.print(arr[a][b]+"\t");
			}
		System.out.println();
		 }		
		
		}

	}


