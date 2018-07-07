package batle.weapon.ultraGreatSword;

import batle.weapon.Weapon;

public class SwordOfTheWolfguardKnight implements Weapon {

    public int damage() {
        return 145;
    }

    public int requiredAgility() {
        return 10;
    }

    @Override
    public int requiredIntelligence() {
        return 10;
    }

    @Override
    public int requiredStrength() {
        return 50;
    }

}
