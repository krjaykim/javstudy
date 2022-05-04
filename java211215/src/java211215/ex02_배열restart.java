package java211215;

public class ex02_배열restart {

	public static void main(String[] args) {
		
		// 배열 생성하기
		// 1. 배열을 초기화 한 후 값을 저장하는 방법
		int[] arr1 = new int[3]; // 배열 선언
		
		//배열에 값 저장하기
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		System.out.println();
		// 2. 배열의 값을 저장함과 동시에  생성하는 방법 >> {} 중괄호 사용
			int[] arr2 = {2, 3, 6, 7};
			
			arr2[2]=6;
			System.out.println(arr2[1]);
			System.out.println(arr2[2]);
			
			
			
			
		  
		
	}

}
