import java.util.Scanner;

public class ex08_연습문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 적으시오 : ");
		
		 int a = sc.nextInt();
		 
		 int result = a%5==0? a/5 : a/5+1;
		 
		 System.out.println("필요한 상자의 개수는 : "+result);
		 
	}

}
