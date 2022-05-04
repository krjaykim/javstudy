package ss;

public class ex04_배열 {

	public static void main(String[] args) {
		
		// 대량 데이터르 효율적으로 관리하기 위한 메커니즘
		// 자료구조 >> DataStucture
		// Array , Queue, Tree, List, Stack
		
		// 배열 선언하기
		// 변수(졍수, 실수, 문자, 문자형.... ) 선언하기
		// 배열을 표현 할 때에 [대괄호] 사용 !
		// 배열의타입 (int) [] 배열명 = new 배열의 타입(int)[배열 크기];
		// [] 자릿값, 인덱스? 참조형이다
		int[] arr = new int [3];
		
		String[] arr2 = new String[3];
		
		// 정수형의 배열 arr 생성 >> 정수형의 공간 3개를 갖는다.
		
        int number = 7;
        System.out.println("변수 불러오기   :"+ number);
        System.out.println("배열 불러오기 : "+ arr);
        System.out.println("배열 불러오기 : "+ arr2);
        
	}

}
