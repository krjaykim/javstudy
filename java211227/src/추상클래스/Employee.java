package 추상클래스;

public abstract class Employee {
	
	// 모든 지급에 대하여 공통된 필드 가져오기
    protected String empno;
    protected String name;
    protected int pay;
	
	//  다른 클래스에서 돌려받으면 반드시 구체화 할 수 있도록 지정
    public abstract int getMoneyPay();
  
    // 일반 메소드 >> 추상 클래스는 추상 메소드 (필수) 와 일반 메소드를 가질수 있다!
    public String print() {
    	return empno + ":" + name + ":" + pay;
    }
    
	

}
