package OOP;

import java.util.Arrays;

public class Name {

	public static void main(String[] args) {
		// 샐행하는 공간!
		// 설계도면을 기반으로 실제 객체를 생성!
		
		Person dongguk = new Person();


		// dongguk은 주소값을 가지고 있는 래퍼런스 변수이다.
		System.out.println(dongguk.gender);

		dongguk.gender='여';
	
		System.out.println(dongguk.gender);
	
		//필드에 있는 이름, 키, 장기 데이터 채우기!
		dongguk.height = 176.1;
		dongguk.name = "jaykim";
//		dongguk.organs = {};
		//>> {} 는 자로형을 정해주는 순간에만 사용할 수 있다.
		
		dongguk.organs = new String[] {"심장","간","맹장"};
	
		System.out.println(Arrays.toString(dongguk.organs));

		System.out.println(dongguk.height);
		System.out.println(dongguk.organs);
		
		dongguk.think("퇴근");
		
		
		// 하나의 설계도면을 기반으로 여러개의 객체를 생성할 수 있다.
		Person yw = new Person();
		System.out.println(yw.name);
	
	
	}
	
}
		
		