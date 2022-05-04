import java.util.Scanner;

public class ex예제 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("현재 몸무게 : ");
//		int now  = sc.nextInt();
//		System.out.println("목표 몸무게 : ");
//		int goal = sc.nextInt();
//		int a = 1;
//		int lose = 0;
//		do { System.out.println(a+"주차 감량 몸무게  >>");
//			lose = sc.nextInt();
//			++a;
//			now = now - lose;
//		} while (now>goal);
//		
//		
//		System.out.println("축하드립니다"+now+"달성");
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("현재 몸무게 : ");
			int now  = sc.nextInt();
			System.out.println("목표 몸무게 : ");
			int goal = sc.nextInt();
			int a = 1;
			int lose = 0;
			
			while(true) {
				System.out.print(a+"주차 몸무게 : ");
				lose = sc.nextInt();
				++a;
				now=now-lose;
				if(now>goal) {
				}else {System.out.println(now);
				break;
				}
				
			}
		}
	

}