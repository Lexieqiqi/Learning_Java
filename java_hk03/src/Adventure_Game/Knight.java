package Adventure_Game;

public class Knight extends Character {
	public Knight() {
		weapon = new KnifeBehavior();
	}
	public void fight() {
		weapon.useWeapon();
		System.out.println("ÆïÊ¿ÔÚ´ò¶·£¡");
	}
}
