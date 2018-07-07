package batle.weapon.ultraGreatSword;

import batle.weapon.Weapon;

public class SwordOfFilth implements Weapon {

    public int damage() {
        return 169;
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
        return 70;
    }

}
