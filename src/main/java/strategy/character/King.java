package strategy.character;

public class King extends Character1 {
    @Override
    public void fight() {
        this.weaponBehavior.useWeapon();
    }
}
