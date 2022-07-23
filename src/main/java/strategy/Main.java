package strategy;

import strategy.character.Character1;
import strategy.character.King;
import strategy.character.Queen;
import strategy.weaponBehavior.KnifeBehavior;
import strategy.weaponBehavior.SwordBehavior;

public class Main {
    public static void main(String[] args) {
        Character1 king = new King();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
        Character1 queen = new Queen();
        queen.setWeaponBehavior(new SwordBehavior());
        queen.fight();
    }
}
