import java.util.Scanner;

public class ex08_��������2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է��ϼ���. : ");
		int a = sc.nextInt();
		
		System.out.println("�޴��� ������.");
		System.out.println("1.�ݶ�(800��)  2.����(500��) 3.��Ÿ�ο���(1500��) >>");
		
		int b =sc.nextInt();
		
		int z = (((a-800)%1000)/100)>5 ? ((a-800)%1000)/100-5 : ((a-800)%1000)/100;
		int x = (((a-500)%1000)/100)>5 ? ((a-500)%1000)/100-5 : ((a-500)%1000)/100;
		int y = (((a-1500)%1000)/100)>5 ? ((a-1500)%1000)/100-5 : ((a-1500)%1000)/100;
				
		if (b==1) { System.out.println("�ܵ�"+(a-800)+"��");
		 System.out.println("õ�� :"+((a-800)/1000)+"��," +"����� :"+(((a-800)%1000)/500)+"��  "+"��� : "+z+"��");
		} else if (b==2) { System.out.println("�ܵ�"+(a-500)+"��");
		 System.out.println("õ�� :"+((a-500)/1000)+"��," +"����� :"+(((a-500)%1000)/500)+"��  "+"��� : "+x+"��");
		} else if (b==3) { System.out.println("�ܵ�"+(a-1500)+"��");
		 System.out.println("õ�� :"+((a-1500)/1000)+"��," +"����� :"+(((a-1500)%1000)/500)+"��  "+"��� : "+y+"��");
			
		//������ �̵��ϴ� �����
		 // �̵��ϰ� ���� ���ο� Ŀ�� �ø��� + alt +ȭ��ǥ ����(��/�Ʒ�)
		}
	}

}
