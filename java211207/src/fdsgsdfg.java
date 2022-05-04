import java.util.Scanner;

public class fdsgsdfg {

	public static void main(String[] args) {
		
		int result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("금액을 입력하시오 :");
		int a = sc.nextInt();
		System.out.println("메뉴를 고르시오");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원)>>");
		int b = sc.nextInt();

		if (a - 800 < 0 && a - 500 < 0 && a - 1500 < 0) {
			System.out.println("돈이부족해요ㅠㅠ");
			System.out.println("잔돈 :" + (a) + "원");

		} else if (b == 1) {
			result = a - 800;

		} else if (b == 2) {
			result = a - 500;

		} else if (b == 3) {
			result = a - 1500;

		}

		System.out.println("잔돈 :" + result + "원");
		System.out.println("천원 :"+result/1000+"개"+"오백원 :"+(result%1000)/500+"개"+"백원 :"+result%500/100+"개");
	}
	
	



	}


