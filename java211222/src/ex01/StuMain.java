package ex01;

import java.util.Arrays;

import javax.xml.ws.handler.MessageContext.Scope;

public class StuMain {

	public static void main(String[] args) {
		
		Student student1 = new Student("ȫ�浿","20150675",22,50,89,77);
		
		
		// ������ �޼ҵ��� ȣ�� �ñ�? > new Ű���� ���� ���ÿ� ȣ��
		// ������ �޼ҵ��� ���� ��ġ? > 
		
		
//		student1.name = "ȫ�浿";
//		student1.iD = "20150675";
//		student1.age = 22;
//		student1.javaScore = 50;
//		student1.webScore = 89;
//		student1.androidScore = 77;
		
		Student student2 = new Student("�迵��","2009541",29,90,25,30);
		
//		student2.name = "�迵��";
//		student2.iD = "20090541";
//		student2.age = 29;
//		student2.javaScore = 90;
//		student2.webScore = 25;
//		student2.androidScore = 30;
		
		
		
		
		
		System.out.println(student2.iD);
		System.out.println(student1.androidScore);

		
		System.out.println("[ "+student1.iD+" "+student1.age+" ]");
		System.out.println(student1.name+"���� Java������"+student1.javaScore+" �Դϴ�.");
		System.out.println(student1.name+"���� Web������"+student1.webScore+" �Դϴ�");
		System.out.println(student1.name+"���� Android������"+student1.androidScore+"�Դϴ�.");
		System.out.println("==============================");
	
	
		student2.show();
		
	}

	
	
}
