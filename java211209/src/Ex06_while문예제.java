//import java.util.Scanner;

//
//public class Ex_07while������5 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("��������� : ");
//		int now = sc.nextInt();
//		System.out.print("��ǥ������ : ");
//		int d = sc.nextInt();
//		int e = 1;
//
//		while (now > d) {
//
//			System.out.print(e + "���� ���� ������ : ");
//			e = e + 1;
//			int m = sc.nextInt();
//			now = now - m;
//
//			if (now <= d) {
//				System.out.println(now + "kg �޼�!! �����մϴ�!");
//
//			}
//		}
//
//	}
//}

import java.util.Scanner;

public class Ex06_while������ {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("��������� : ");
      int num = sc.nextInt();
      System.out.print("��ǥ������ : ");
      int num2 = sc.nextInt();
      int a = 0;
      while (true) {
         ++a;
         System.out.print(a+ "���� ���� ������ : ");
         int num3 = sc.nextInt();
         num = num-num3;
         if (num <= num2) {
            break;
         }
         
      }System.out.println(num+"kg �޼�!! �����մϴ�!");
      
   }
    
}
      
