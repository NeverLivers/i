package batle.weapon.twoHandSword;

import batle.weapon.Weapon;

public class Athiesh implements Weapon {

    public int damage() {
        return 100;
    }

    public int requiredAgility() {
        return 0;
    }

    @Override
    public int requiredIntelligence() {
        return 0;
    }

    @Override
    public int requiredStrength() {
        return 50;
    }

}
