package java211215;

public class ex03_�迭 {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
//		System.out.println(arr[9]);
		int[] arr = new int[10];
		
		System.out.println(arr.length);
		//.length�� �迭�� ������ �ִ� ũ�⸦ ��ȯ�� �ִ� �Ӽ��̴�!
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
				arr[i]=++count;
			
	
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		}
	

	}


