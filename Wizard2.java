public class Wizard2 extends Character{
	protected int mp;
	
	public Wizard2(String name) {
		this.name = name;
	}
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ！");
		m.hp -= 3;
	}
	public void fireball(Monster m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ！");
		m.hp -= 20;
		this.mp -= 5;
	}
}