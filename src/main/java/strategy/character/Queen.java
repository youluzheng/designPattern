package strategy.character;

public class Queen extends Character {
    @Override
    public void fight() {
        this.weaponBehavior.useWeapon();
    }
}
