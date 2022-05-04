package OOP;

public class BankBook {
	//설계할 통장 클래스 (설계도면)
	
	// 1. 필드, 속성, 데이터 = 각 객체가 가질수 있는 값
	// 잔액(money)
	private int money;
	// 외부 클래스로부터 함부로 접근할 수 없게끔 정보은닉! (캡슐화)
	
	// 객체를 생성할 때 필드에 있는 값을 초기화 시킬 수 있는 메소드 생성
	// 생성자(constructor)
	// 1. 생성자는 메소드다.
	// 2. 생성자는 메소드 이름이 클래스의 이름과 동일하다.(대소문자가까지 동일해야함)
	// 3. 리턴타입을 지정하지 않는다.(void도 적지 않는다)
	// 4. 매개변수로 아무것도 받지 않는 생성자를 기본생성자(default constructor)라고 한다.
	// >>>> 기본생성자는 생략이 가능하다.
	// >>>> 단, 새로운 생성자를 만든다면 기본생성자는 덮어씌어진다.
	
	public BankBook(int money) {
		this.money = money;
	}
	
	
	
	
	
	

	
	// 외부 클래스로부터 함부로 접근할 수 없게끔 정보은닉!(캡슐화)
	
	//기본 생성자
	//매개변수의 개수와 타입을 다르게 해서 중복으로 정의하는것 == 메소드 오버로딩
//	public BankBook() {
//
//	}
//



	
	
	


	// 2. 메소드, 기능, 로직 = 각 객체가 가질수 있는 값
	// 돈을 넣는다. deposit
	// 매개변수로 int 데이터를 받아와서 아무런 값도 반환하지 않는 deposit 메소드 생성
	public void deposit(int money) {
		this.money += money;
		// this >> 클래스 나 자신을 가리키는 키워드!
	};
	
	// 돈을 인출한다. withdraw
	public void withdraw(int money) {
		//필드에 있는 money를 매개변수로 받아온 money 빼면서 누적시키오
		this.money-=money;
	};
	// 잔액을 보여준다. showMoney
	public int showMoney() {
		return money; //필드에 있는 데이터 가져와서 돌려주겠다.
		
	};
}


