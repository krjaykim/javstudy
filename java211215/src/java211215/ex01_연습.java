package java211215;

public class ex01_¿¬½À {

	public static void main(String args[]) {
		
		int a = 0;
		int sum = 0;
		int count = 0;
		for (int i = 77; i > 0; i--) {
			++count;
			sum = i * count;
			a += sum;
		}

		System.out.println(a);
	}
}
