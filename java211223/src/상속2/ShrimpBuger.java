package 상속2;

public  class ShrimpBuger extends Buger {

	@Override
	public void make() {

		System.out.println("새우버거 만들기");
		
	}
	
	// 추상 클래스를 상속받으면
	// 추상 클래스에 존재하는 추상 메소드를 꼭 반드시 구체적으로 구현해야 한다
	

}
