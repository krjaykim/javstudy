package 상속2;

public abstract class Buger {

	int price = 5000;

// 추상 클래스가 되기 전 >> Buger 클래스는 완벽한 설계도
// 추상 클래스가 되고 난 후 >> Buger 클래스는 미완성된 설계도	

	// 행위는 가지되 내용은 비어있는 추상 메소드 만들기
	// 물려받을 자식들이 행위만 물려받고 구체적인 기능은 스스로 만들수 있도록 하기 위해!

	// 추상화에 대한 키워드 : abstract

	// 추상메소드는 추상클래스 안에서만 만들어 진다

	public abstract void make();

}
