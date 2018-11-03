package Adventure_Game;

public class Queen extends Character {
	public Queen() {
		weapon = new BowAndArrowBehavior();
	}
	public void fight() {
		weapon.useWeapon();
		System.out.println("»ÊºóÔÚ´ò¶·£¡");
	}
}
