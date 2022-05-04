package PocketMon;

public class PocketMon {

	// 포켓몬 설계도
	// 정보 : 이름, 타입, 레벨, 필살기, 체력, 공격력, 방어력 
	
	private String name;
	private String type;
	private int lv;
	private String skill;
	private int hp;
	private int at;
	private int df;
	public PocketMon(String name, String type, int lv, String skill, int hp, int at, int df) {
		this.name = name;
		this.type = type;
		this.lv = lv;
		this.skill = skill;
		this.hp = hp;
		this.at = at;
		this.df = df;
	}
	
	
	// 외부 접근이 가능하며 동시에 내부 데이터에 접근할 수 있는 메소드 생성
	// getter() > 정보를 가지고 올때
	// setter() > 정보를 수정할 때
	
	public String getName() {
		return name;
	}

	// 정보를 수정할수 있는 setName()
	public void setName(String name) {
		this.name=name;
	}
	public String getType() {
		return type;
	}


	public int getLv() {
		return lv;
	}


	public String getSkill() {
		return skill;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setLv(int lv) {
		this.lv = lv;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public void setHp(int d) {
		this.hp = d;
	}


	public void setAt(int at) {
		this.at = at;
	}


	public void setDf(int df) {
		this.df = df;
	}


	public int getHp() {
		return hp;
	}


	public int getAt() {
		return at;
	}


	public int getDf() {
		return df;
	}
	
	
	}

	// 생성자 메소드 만들기
	
// 접근지정자 종류

//1. public 2. private 3. protected 4. default(생략가능)
// - public 은 내부나 외부에서 어디서든 접근이 가능한 기능
// - private 는 현재 클래스 내에서만 접근이 가능한 기능
// - protected 는 같은 패키지 내에서 사용 가능 하며 상속을 받았을 경우 다른 패키지에서도 접근이 가능하다.
// - default 는 같은 패키지 안에서 사용 가능 하며 생략도 가능하다.
