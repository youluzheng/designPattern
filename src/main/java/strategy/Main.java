package strategy;

import character.King;
import character.Queen;
import weaponBehavior.KnifeBehavior;
import weaponBehavior.SwordBehavior;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
        Character queen = new Queen();
        queen.setWeaponBehavior(new SwordBehavior());
        queen.fight();
    }
}
