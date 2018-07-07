package batle.weapon.hammer;

import batle.weapon.Weapon;

public class Mjolnir implements Weapon {

    public int damage() {
        return 115;
    }

    public int requiredAgility() {
        return 0;
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
