package OOP;

public class BankBookMain {

	public static void main(String[] args) {
	
		// 1. BankBook 설계도면을  기반으로 bank 객체 생성
		
		// 2. bank가 가지고 있는 money 필드의값을 1000으로 초기화
		
		// 3. bank 에서 1500원을 입금해주세요.
		
		// 4. 잔액 출력
		
		// 5. bank에서 700원을 출금해주세요
		
		// 6. 잔액 출력
		
		BankBook jay = new BankBook(10000);
		
		jay.deposit(10000);
		
//		System.out.println(jay.money);
		
//		jay.money += 1200;
		//jay.deposit(1500);
//		System.out.println(jay.money);
		
		jay.showMoney();
		
		jay.withdraw(700);

		
		System.out.println(jay.showMoney());
//		System.out.println(jay.money);
		

	}

}
