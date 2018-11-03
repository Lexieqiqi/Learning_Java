package Adventure_Game;

public class Troll extends Character {
	public Troll() {
		weapon = new AxeBehavior();
	}
	public void fight() {
		weapon.useWeapon();
		System.out.println("¾ŞÈËÔÚ´ò¶·£¡");
	}
}
