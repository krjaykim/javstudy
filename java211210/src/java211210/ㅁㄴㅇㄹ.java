package java211210;
import java.util.Random;
import java.util.Scanner;

public class �������� {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random r = new Random();
      String s="Y";
      int num1 =r.nextInt(20);
      int num2 =r.nextInt(20);
      
      while(s.equals("Y")) {
         System.out.print(num1+"+"+num2+"=");
         int input =sc.nextInt();
         
         if(input==num1+num2) {
            System.out.println("Success");
            num1 =r.nextInt(20);
            num2 =r.nextInt(20);
         }else {
            System.out.println("Fail");
            
         }
         
      System.out.println("��� �����Ͻðڽ��ϱ�? >> ");
      s=sc.next();
      }
         System.out.println("����Ǿ����ϴ�.");
   }

}

