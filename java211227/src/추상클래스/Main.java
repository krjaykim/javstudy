package �߻�Ŭ����;



public class Main {

	public static void main(String[] args) {
		
		RegularEmployee regular = new RegularEmployee("SMHRD001", "ȫ�浿", 4000, 400);
		
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay()+"����");
		
		TempEmployee temp = new TempEmployee("SMHRD002", "��O��", 3000);
		System.out.println();
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay()+"����");
		
		
		System.out.println();
		PartTImeEmployee partTime = new PartTImeEmployee("SMHRD001", "��O��", 10, 10);
		
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay());

	}

}
