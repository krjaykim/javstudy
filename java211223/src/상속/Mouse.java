package 상속;

public class Mouse {
	
	// 마우스를 만들기 위한 설계도
	
	// 마우스가 할수 있는 동작 구현하기
	
	// 1. 좌클릭 할 수 있는 leftClick()
	// - 리턴 타입 void 
	
	public void leftClick() {
		System.out.println("좌클릭");
	}
	
	// 2. 우클릭 할 수 있는 rightClick()
	public void rightClick() {
		System.out.println("우클릭");
	}
	
	// 3. 드래그 할 수 있는 drag()
	public void drag() {
		System.out.println("드래그");
	}
	

}
