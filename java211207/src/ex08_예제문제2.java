import java.util.Scanner;

public class ex08_예제문제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요. : ");
		int a = sc.nextInt();
		
		System.out.println("메뉴를 고르세오.");
		System.out.println("1.콜라(800원)  2.생수(500원) 3.비타민원터(1500원) >>");
		
		int b =sc.nextInt();
		
		int z = (((a-800)%1000)/100)>5 ? ((a-800)%1000)/100-5 : ((a-800)%1000)/100;
		int x = (((a-500)%1000)/100)>5 ? ((a-500)%1000)/100-5 : ((a-500)%1000)/100;
		int y = (((a-1500)%1000)/100)>5 ? ((a-1500)%1000)/100-5 : ((a-1500)%1000)/100;
				
		if (b==1) { System.out.println("잔돈"+(a-800)+"원");
		 System.out.println("천원 :"+((a-800)/1000)+"개," +"오백원 :"+(((a-800)%1000)/500)+"개  "+"백원 : "+z+"개");
		} else if (b==2) { System.out.println("잔돈"+(a-500)+"원");
		 System.out.println("천원 :"+((a-500)/1000)+"개," +"오백원 :"+(((a-500)%1000)/500)+"개  "+"백원 : "+x+"개");
		} else if (b==3) { System.out.println("잔돈"+(a-1500)+"원");
		 System.out.println("천원 :"+((a-1500)/1000)+"개," +"오백원 :"+(((a-1500)%1000)/500)+"개  "+"백원 : "+y+"개");
			
		//빠르게 이동하는 단축기
		 // 이동하고 싶은 라인에 커서 올리고 + alt +화살표 방향(위/아래)
		}
	}

}
