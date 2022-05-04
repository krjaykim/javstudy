
public class ex03_for어려운거 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			// 별을 반복적으로 만들수 있는 for문 생성
			for (int s = 4; s >= i; s--) {
				System.out.print("^");

			}
			for (int a = 1; a <= i; a++)
				System.out.print("*");
			{

			}
			System.out.println();

		}

	}
}