package OOP;

public class Person {
	
	// 우리가 새롭게 만드는  자료형
	// 설계도면 만들기
	// 1.속성 = field, data
	//장기
	String[] organs;
	//이름
	String  name;
	//키
	double height;
	//성별
	char gender;
	// 2.기능 = method, logic
	//생각하다.
	public void think(String s) {
		System.out.println(s+"을(를) 생각한다.");
	}
	//백반을 만들다.
	public void makeMeal() {
	System.out.println("맛있는 백반을 만든다");
	}
	//공부를 한다.
	public void study() {
		System.out.println("자바공부를 한다.");
	}
	

}
