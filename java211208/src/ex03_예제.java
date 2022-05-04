import java.util.Scanner;

public class ex03_예제 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("정수 입력 : ");
	 
	 int a = sc.nextInt();
	 

	 switch (a%2) {
	 case 0:
		 if(a==0) {
			 System.out.println("0 입니다.");
			 
		 }else {
			 System.out.println("짝수입니다.");
		 }
		 
		 break;
	 case 1:
		 System.out.println("홀수입니다.");
		 break;
		 
	 }
	 
		 
	 }

}

