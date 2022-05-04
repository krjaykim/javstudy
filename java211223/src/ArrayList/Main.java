package ArrayList;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		//실행하는 공간
		//1. Student 자료형 저장하는   Arraylist 생성해보자
	
		ArrayList<Student> who = new ArrayList<Student>();
		
		//2. 데이터 우가하기
		// 하영준 20211223 20
		
		who.add(new Student("하영준", 20211223, 20));
		who.add(new Student("한정무", 20211224, 20));
		who.add(new Student("김영재", 20211225, 20));
		
		
		//3. 데이터 가져오기
		
			System.out.println(who.get(0).getName());
	}	
}
		
	
		
