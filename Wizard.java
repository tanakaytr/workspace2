public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public void heal(Hero3 h) {
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.getWand().getPower());
		this.setHp(this.getHp() + recoverPoint);
		
		System.out.println(this.getName() + "のHPを" + recoverPoint + "回復した！");
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if(this.hp < 0) {
			this.hp = 0;
		}
		this.hp = hp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if(this.mp < 0) {
			throw new IllegalArgumentException("MPが異常です。");
		}
		this.mp = mp;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("魔法使いの名前が異常です。");
		}
		this.name = name;
	}
	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("杖がないです。");
		}
		this.wand = wand;
	}
}