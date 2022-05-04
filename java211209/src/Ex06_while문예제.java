//import java.util.Scanner;

//
//public class Ex_07while문예제5 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("현재몸무게 : ");
//		int now = sc.nextInt();
//		System.out.print("목표몸무게 : ");
//		int d = sc.nextInt();
//		int e = 1;
//
//		while (now > d) {
//
//			System.out.print(e + "주차 감량 몸무게 : ");
//			e = e + 1;
//			int m = sc.nextInt();
//			now = now - m;
//
//			if (now <= d) {
//				System.out.println(now + "kg 달성!! 축하합니다!");
//
//			}
//		}
//
//	}
//}

import java.util.Scanner;

public class Ex06_while문예제 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("현재몸무게 : ");
      int num = sc.nextInt();
      System.out.print("목표몸무게 : ");
      int num2 = sc.nextInt();
      int a = 0;
      while (true) {
         ++a;
         System.out.print(a+ "주차 감량 몸무게 : ");
         int num3 = sc.nextInt();
         num = num-num3;
         if (num <= num2) {
            break;
         }
         
      }System.out.println(num+"kg 달성!! 축하합니다!");
      
   }
    
}
      
