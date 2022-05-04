package ex01;

public class Student {
	
	 // 학생들의 정보를 관리할 수 있는 설계도
	// 설계도는 설계만 진핼할 수 있으므로 객체를 생성하는 main() x
	
	// 이름(String), 학번(String), 나이(int) 
	// Java점수(int), Web점수(int), Android점수(int)
	
	 String name;
	 
	 String show;
	
	 String iD;
	
	 int age;
	
	 int javaScore;
	
	 int webScore;
	
	 int androidScore;

	 
	 
	 // 생성자 메소드 생성하기
	 // 접근지정자, 리턴타입X > void X, 메소드의 이름(=클래스의 이름과 동일해야한다)
	 public Student(String name, String iD, int age, int java, int webS, int android)	{
		 
		 this.name=name;
		 this.iD=iD;
		 this.age=age;
		 javaScore=java;
		 this.webScore=webS;
		 this.androidScore=android;
		 
	 }
	 public void show() {
		 System.out.println(name+"님 안녕하세요. ");
		 System.out.println("[ "+iD+" "+age+" ]");
		 System.out.println(name+"님의 java점수는"+javaScore+"점 입니다.");
		 System.out.println(name+"님의 web점수는"+webScore+"입니다");
		 System.out.println(name+"님의 android점수는"+androidScore+"입니다");
		 System.out.println("===========================================");
	 }
	
	 }



