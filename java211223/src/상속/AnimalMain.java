package 상속;

public class AnimalMain {

	public static void main(String[] args) {
		
		// Dog 클래스, Cat 클래스 객체 생성과 사용하기!
		Dog d = new Dog();
		
		Cat c = new Cat();
		
		System.out.println("Dog의 이름 : "+d.name);
		
		System.out.println("Cat의 이름 : "+c.name);
	}

}
