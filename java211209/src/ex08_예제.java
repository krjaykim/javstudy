import java.util.Scanner;

public class ex08_抗力 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("泅犁 个公霸 : ");
		int now = sc.nextInt();
		System.out.println("格钎 个公霸 : ");
		int goal = sc.nextInt();
		int d = 1;
		int sum = 0;
		do {
			System.out.println(d+"林瞒 皑樊 个公霸:");
			int c = sc.nextInt();
			++d;
			now=now-c;
		} while (now>goal);
		
	System.out.println(now+"个公霸 场");	
	}

}
