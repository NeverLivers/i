package batle.weapon.twoHandSword;

import batle.weapon.Weapon;

public class FrostMorne implements Weapon {

    public int damage() {
        return 210;
    }

    public int requiredAgility() {
        return 30;
    }

    @Override
    public int requiredIntelligence() {
        return 10;
    }

    @Override
    public int requiredStrength() {
        return 90;
    }


}
