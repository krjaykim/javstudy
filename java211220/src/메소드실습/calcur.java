package 메소드실습;

public class calcur {

	public static void main(String[] args) {
		
		System.out.println(cal(1,5,'+'));

	}

	public static int cal(int num1, int num2, char op)	{
	
		switch(op) {
		case'-':
			if(num1>num2) {
				return num1-num2;
			}else if(num2>num1) {
				return num2 -num1;
			}
			case'+':
			return num1+num2;	
		case'*':
			return num1*num2;	
		case'/':
			return num1/num2;
			
			default : // if문의 else 와 같은 역할 !!!
			
			
			
			}
		

		
		
		
		
		return 0;
		
	}
}
