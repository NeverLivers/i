package batle.weapon.wand;

import batle.weapon.Weapon;

public class TheGovernorsFlamed implements Weapon {

    public int damage() {
        return 85;
    }

    public int requiredAgility() {
        return 0;
    }

    @Override
    public int requiredIntelligence() {
        return 50;
    }

    @Override
    public int requiredStrength() {
        return 0;
    }

}
