package strategy.character;

import strategy.weaponBehavior.WeaponBehavior;

public abstract class Character1 {
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();
}
