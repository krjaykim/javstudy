package 상속2;

public class BuggerMain {

	public static void main(String[] args) {
	
		// 1. 기본 햄버거를 만들수 있는 버거 클래스 생성하기
		// 추상 클래스는 객체 생성이 불가능하다
		
//		Buger buger= new Buger();
		
		// 2. 기본 햄버거를 물려받는 Cheese 클래스 생성하기
		
		Cheese chese = new Cheese();
		
		
		// Bugger 를 물려받는 다양한 햄버거 클래스 생성하기
		// shrimp, chicken
		
//		buger.make();
		chese.make();
		
		
		System.out.println(chese.price);
		
		ShrimpBuger Sh = new ShrimpBuger();
		
		Sh.make();
	
		
		// 업캐스팅 : 자식의 개체를 부모의 객체로 지정 할 수 있도록 하는것 !@
	Buger buger = new ShrimpBuger();
	Buger buger2 = new Cheese();
	
	System.out.println("본점에 다른 버거 들이기");
	
	buger.make();
	
	
	// 다운 캐스팅 : 업캐스팅 된 내용을 강제적으로 ( 명시적 ) 타입을 변환하는것
	// 다운 캐스팅의 조건 : 반드시 업캐스팅 되어있는 환겨엥서 다시 다운 캐스팅이 가능하다 
	
	ShrimpBuger shrimp2 = (ShrimpBuger)buger;
	
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
