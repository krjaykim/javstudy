package 추상클래스;

public class PartTImeEmployee extends Employee {

	
	
	private int workDay;

	public PartTImeEmployee(String empno, String name, int pay, int workDay) {

		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}
	
	public int getMoneyPay() {
		return pay*workDay;
	}
	
}
