package batle.weapon.twoHandHammer;

import batle.weapon.Weapon;

public class HammerOfHeawen implements Weapon {

    public int damage() {
        return 140;
    }

    public int requiredAgility() {
        return 10;
    }

    @Override
    public int requiredIntelligence() {
        return 0;
    }

    @Override
    public int requiredStrength() {
        return 70;
    }

}
