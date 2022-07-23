package strategy.character;

public class Queen extends Character1 {
    @Override
    public void fight() {
        this.weaponBehavior.useWeapon();
    }
}
