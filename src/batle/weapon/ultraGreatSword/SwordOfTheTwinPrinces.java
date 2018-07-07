package batle.weapon.ultraGreatSword;

import batle.weapon.Weapon;

public class SwordOfTheTwinPrinces implements Weapon {

    public int damage() {
        return 240;
    }

    public int requiredAgility() {
        return 40;
    }

    @Override
    public int requiredIntelligence() {
        return 40;
    }

    @Override
    public int requiredStrength() {
        return 90;
    }

}
