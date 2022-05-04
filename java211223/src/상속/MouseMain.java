package 상속;

public class MouseMain {

	public static void main(String[] args) {
		
		Mouse m = new Mouse();
		
		m.drag();
		m.rightClick();
		m.leftClick();
		
		System.out.println();
		WheelMouse wm = new WheelMouse();
		
		wm.drag();
		wm.leftClick();
		wm.rightClick();
		wm.wheel();
		
		System.out.println();
		
		// smartMouse 설계도를 통해 sm 객체 생성하기
		System.out.println();
		Smart sm = new Smart();
		// 기본 기능 >> 좌클릭, 우클릭, 드래그 , 휠
		sm.drag();
		sm.leftClick();
		sm.rightClick();
		sm.wheel();
		sm.smart();
		// 확장 기능 >>  smart() >> "피로가 감소되는 기능"
		
		
		

	}

}
