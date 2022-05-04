import java.util.Scanner;

public class ex03_while {

	public static void main(String[] args) {
String s = "Y";
Scanner sc = new Scanner(System.in);
System.out.println("첫 번째 정수를 입력하세요 >>");
int a = sc.nextInt();
System.out.println("두 번째 정수를 입력하세요 >>");
int b = sc.nextInt();
System.out.println("[1]더하기[2]빼기>>");
int what = sc.nextInt();

if(what==1) {
	System.out.println("더하기 연산 결과는"+(a+b)+"입니다");
}else if(what==2) {System.out.println("빼기 결과는"+(a-b)+"입니다");
}
System.out.println("다시 실행하시겠습니까? (y/n)>>");
s = sc.next();

	}

}
