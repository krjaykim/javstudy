
public class ex04_산술연산자 {

	public static void main(String[] args) {
	
		
//	    int num7= 10;
//		int num6= 7;
//		
//		System.out.println(num1/(float)num2);
//		System.out.println(num1%num2);
//		
		// 정수타입끼리 연산 > 정수
		// 실수타입끼리 연산할 경우 결과값은 실수타입으로 나온다.
		// 정수타입과 실수타입이 연산할 경우 결과값은 실수타입으로 나온다.
		
        String num5 = "4";
        String num6 = "3";
        System.out.println(num5+num6);
        
        System.out.println(num6+num5);
        
        String a = 10+7+"";
  String b = 9+""+2;
       String c = 5+3+4+4+3+"";
        
        
        System.out.println(c);
        
        int num1= 7;
        int num2= 3;
        
        
        System.out.println("더하기결과:"+(num1+num2));
        System.out.println("빼기결과:"+(num1-num2));
        System.out.println("곱하기 결과:"+(num1*num2));
        System.out.println("나누기결과:"+(num1/(double)num2));
        
        
        int num = 777;
        System.out.println(num-num%100);
        
        
        System.out.println(num-num%10+1);
        
        System.out.println(num-((num/10)*10)+1);
        
        
	}

}
