package ex01;

public class Student {
	
	 // �л����� ������ ������ �� �ִ� ���赵
	// ���赵�� ���踸 ������ �� �����Ƿ� ��ü�� �����ϴ� main() x
	
	// �̸�(String), �й�(String), ����(int) 
	// Java����(int), Web����(int), Android����(int)
	
	 String name;
	 
	 String show;
	
	 String iD;
	
	 int age;
	
	 int javaScore;
	
	 int webScore;
	
	 int androidScore;

	 
	 
	 // ������ �޼ҵ� �����ϱ�
	 // ����������, ����Ÿ��X > void X, �޼ҵ��� �̸�(=Ŭ������ �̸��� �����ؾ��Ѵ�)
	 public Student(String name, String iD, int age, int java, int webS, int android)	{
		 
		 this.name=name;
		 this.iD=iD;
		 this.age=age;
		 javaScore=java;
		 this.webScore=webS;
		 this.androidScore=android;
		 
	 }
	 public void show() {
		 System.out.println(name+"�� �ȳ��ϼ���. ");
		 System.out.println("[ "+iD+" "+age+" ]");
		 System.out.println(name+"���� java������"+javaScore+"�� �Դϴ�.");
		 System.out.println(name+"���� web������"+webScore+"�Դϴ�");
		 System.out.println(name+"���� android������"+androidScore+"�Դϴ�");
		 System.out.println("===========================================");
	 }
	
	 }



