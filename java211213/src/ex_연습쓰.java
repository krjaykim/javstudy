
public class ex_연습쓰 {

	public static void main(String[] args) {
		
		for (int i = 2; i < 10; i++) {
			System.out.print(i+"단 : ");
			
			for (int a = 1; a < 10; a++) {
				
				System.out.print(i+"*"+a+"="+i*a);
				if(i*a<10) {System.out.print("   ");
				}else System.out.print("  ");
			}System.out.println("  ");
		
		}	
		}
	}
	

