package java211216;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex_07배열 {

	public static void main(String[] args) {
		int[]arr = {1,4,3,2,1};
		int[]input = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < input.length; i++) {
			System.out.print((i+1)+"답 입력 : ");
			input[i] = sc.nextInt();
		}
			System.out.println("원본");
			System.out.println(Arrays.toString(arr));
			
			System.out.println("사용자의 정답지 : ");
			System.out.println(Arrays.toString(input));
			
			System.out.println("정답확인");
			
			int score = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==input[i])	{
					System.out.println("O ");
					score += 20;
				}else {
					System.out.println("X ");
				}
			}	System.out.println("총점 : "+score);
			
	
			
		}
	
}

