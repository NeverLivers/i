package batle.weapon.twoHandAxe;

import batle.weapon.Weapon;

public class Detractor implements Weapon {

    public int damage() {
        return 140;
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
