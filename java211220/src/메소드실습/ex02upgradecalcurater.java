package 메소드실습;

public class ex02upgradecalcurater {

	public static void main(String[] args) {
		
		int num1 = 40;
		int num2 = 10;
		char op = '/';
		
		System.out.println(cal(num1,num2,op));

	}
	public static int cal(int num1, int num2, char op) {
		if(op=='-') {
			if(num1>num2) {
			return num1-num2;}
			else if(num2>num1) {
				return num2-num1;
			}
		}else if (op=='+') 	{
			return num1+num2;
		}else if (op=='*') {
			return num1*num2;
		}else if (op=='/') {
			return num1/num2;
		}
	
		
		
		
		
		
		return 0;
		
	}
}
