package PocketMon;

public class PocketMon {

	// ���ϸ� ���赵
	// ���� : �̸�, Ÿ��, ����, �ʻ��, ü��, ���ݷ�, ���� 
	
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
	
	
	// �ܺ� ������ �����ϸ� ���ÿ� ���� �����Ϳ� ������ �� �ִ� �޼ҵ� ����
	// getter() > ������ ������ �ö�
	// setter() > ������ ������ ��
	
	public String getName() {
		return name;
	}

	// ������ �����Ҽ� �ִ� setName()
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

	// ������ �޼ҵ� �����
	
// ���������� ����

//1. public 2. private 3. protected 4. default(��������)
// - public �� ���γ� �ܺο��� ��𼭵� ������ ������ ���
// - private �� ���� Ŭ���� �������� ������ ������ ���
// - protected �� ���� ��Ű�� ������ ��� ���� �ϸ� ����� �޾��� ��� �ٸ� ��Ű�������� ������ �����ϴ�.
// - default �� ���� ��Ű�� �ȿ��� ��� ���� �ϸ� ������ �����ϴ�.
