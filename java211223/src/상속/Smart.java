package 상속;

public class Smart extends WheelMouse {
	
	public void smart() {
		System.out.println("피로가 감소되는 기능");
	}

	
	public void leftClick()	{
		System.out.println("바르게 더블클릭하기");
	}
	
	
	//원래 가지고 있던 기능을 수정하려면 어떻게 해야할까?
	//기능을 새롭게 재정의 한다 >>> 메소드 오버라이딩
	
}
