package Adventure_Game;

public class King extends Character {
	public King() {
		weapon = new SwordBehavior();
	}
	public void fight() {
		weapon.useWeapon();
		System.out.println("�����ڴ򶷣�");
	}
}
