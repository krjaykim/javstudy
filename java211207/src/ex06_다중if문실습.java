import java.util.Scanner;

public class ex06_����if���ǽ� {

	public static void main(String[] args) {

//��������
// ������ �Է¹޾� ������ ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();
	
		if (score>=90) {
			System.out.println("A�����Դϴ�.");
		} else if(score>=80) {System.out.println("B�����Դϴ�.");
		} else if(score>=70) {System.out.println("C�����Դϴ�.");
		} else if(score>=60) {System.out.println("D�����Դϴ�.");
		} else System.out.println("F�����Դϴ�.");
		
			
		}
		
		}
