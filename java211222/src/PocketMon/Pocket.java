package PocketMon;

public class Pocket {

	

	public static void main(String[] args) {

		PocketMon who1 = new PocketMon("�ս���", "����", 3, "��ġ��", 999, 50, 100);
		
		System.out.println("who�� ����");
		System.out.println(who1.getName()+"/"+who1.getAt()+"/"+who1.getDf()+"/"+who1.getHp()+"/"+who1.getSkill()+"/"+who1.getType());
		
		
		
		
		who1.setName("������");
		System.out.println(who1.getName());
//		System.out.println(who.name);
//		System.out.println(who.type);
//		System.out.println(who.lv);
//		System.out.println(who.skill);
//		System.out.println(who.hp);
//		System.out.println(who.at);
//		
//		
//		who.type = "��";
//		System.out.println("������ Ÿ�� : "+who.type);

	}

}
