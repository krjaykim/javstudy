import java.util.Scanner;

public class ex���� {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���� ������ : ");
//		int now  = sc.nextInt();
//		System.out.println("��ǥ ������ : ");
//		int goal = sc.nextInt();
//		int a = 1;
//		int lose = 0;
//		do { System.out.println(a+"���� ���� ������  >>");
//			lose = sc.nextInt();
//			++a;
//			now = now - lose;
//		} while (now>goal);
//		
//		
//		System.out.println("���ϵ帳�ϴ�"+now+"�޼�");
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("���� ������ : ");
			int now  = sc.nextInt();
			System.out.println("��ǥ ������ : ");
			int goal = sc.nextInt();
			int a = 1;
			int lose = 0;
			
			while(true) {
				System.out.print(a+"���� ������ : ");
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