import java.util.Scanner;

public class ex06_다중if문실습 {

	public static void main(String[] args) {

//학점계산기
// 점수를 입력받아 학저믕 계산하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
	
		if (score>=90) {
			System.out.println("A학점입니다.");
		} else if(score>=80) {System.out.println("B학점입니다.");
		} else if(score>=70) {System.out.println("C학점입니다.");
		} else if(score>=60) {System.out.println("D학점입니다.");
		} else System.out.println("F학점입니다.");
		
			
		}
		
		}
