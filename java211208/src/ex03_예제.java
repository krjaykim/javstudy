import java.util.Scanner;

public class ex03_���� {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("���� �Է� : ");
	 
	 int a = sc.nextInt();
	 

	 switch (a%2) {
	 case 0:
		 if(a==0) {
			 System.out.println("0 �Դϴ�.");
			 
		 }else {
			 System.out.println("¦���Դϴ�.");
		 }
		 
		 break;
	 case 1:
		 System.out.println("Ȧ���Դϴ�.");
		 break;
		 
	 }
	 
		 
	 }

}

