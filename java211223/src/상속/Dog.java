package 상속;

public class Dog extends Annimal{

	// 상속을 통하여 부모클래스가 가지고 있는 메소드(기능)을
	// 다른 객체가 다른 형태로 사용할 수 있도록 변경! - 오버라이딩 / 다형성
	
	// 오버라이딩 성립조건
	// 1. 메소드의 반환타입, 이름, 매개변수 동일
	// 2. 중괄호 안의 내용이 변경 되어야 한다.
	
	
	
	public void eat() {
		System.out.println("개껌을 맛있게 먹는다!");
	}

	public void move() {
		System.out.println("꼬리를 흔들다!");
	}

	public void crying() {
		System.out.println("멍멍");
	}
}
