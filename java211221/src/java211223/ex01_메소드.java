package java211223;

public class ex01_�޼ҵ� {

	public static void main(String[] args) {

		System.out.println(isPerfect(6));
	}

	public static boolean isPerfect(int num) {

		int a = 0;
		for (int i = 1; i < num; i++) {

			if (num % i == 0) {

				a += i;

			}
		}

		if (a == num) {
			return true;
		} else {
			return false;

		}

		//		return false;

	}

}


		// ������ ���ϴ� �޼ҵ�
		// ������ : 

