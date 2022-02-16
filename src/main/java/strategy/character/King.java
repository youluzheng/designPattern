package strategy.character;

public class King extends Character {
    @Override
    public void fight() {
        this.weaponBehavior.useWeapon();
    }
}
