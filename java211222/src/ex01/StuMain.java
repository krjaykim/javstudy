package ex01;

import java.util.Arrays;

import javax.xml.ws.handler.MessageContext.Scope;

public class StuMain {

	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동","20150675",22,50,89,77);
		
		
		// 생성자 메소드의 호출 시기? > new 키워드 사용과 동시에 호출
		// 생성자 메소드의 생성 위치? > 
		
		
//		student1.name = "홍길동";
//		student1.iD = "20150675";
//		student1.age = 22;
//		student1.javaScore = 50;
//		student1.webScore = 89;
//		student1.androidScore = 77;
		
		Student student2 = new Student("김영희","2009541",29,90,25,30);
		
//		student2.name = "김영희";
//		student2.iD = "20090541";
//		student2.age = 29;
//		student2.javaScore = 90;
//		student2.webScore = 25;
//		student2.androidScore = 30;
		
		
		
		
		
		System.out.println(student2.iD);
		System.out.println(student1.androidScore);

		
		System.out.println("[ "+student1.iD+" "+student1.age+" ]");
		System.out.println(student1.name+"님의 Java점수는"+student1.javaScore+" 입니다.");
		System.out.println(student1.name+"님의 Web점수는"+student1.webScore+" 입니다");
		System.out.println(student1.name+"님의 Android점수는"+student1.androidScore+"입니다.");
		System.out.println("==============================");
	
	
		student2.show();
		
	}

	
	
}
