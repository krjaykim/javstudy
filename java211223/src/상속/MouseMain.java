package ���;

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
		
		// smartMouse ���赵�� ���� sm ��ü �����ϱ�
		System.out.println();
		Smart sm = new Smart();
		// �⺻ ��� >> ��Ŭ��, ��Ŭ��, �巡�� , ��
		sm.drag();
		sm.leftClick();
		sm.rightClick();
		sm.wheel();
		sm.smart();
		// Ȯ�� ��� >>  smart() >> "�Ƿΰ� ���ҵǴ� ���"
		
		
		

	}

}
