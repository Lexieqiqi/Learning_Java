package Adventure_Game;

abstract public class Character {
	WeaponBehavior weapon;
	abstract void fight();
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
}
