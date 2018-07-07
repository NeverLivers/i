package batle.weapon.carpal;

import batle.weapon.Weapon;

public class RighteousnessFists implements Weapon {

    public int damage() {
        return 100;
    }

    public int requiredAgility() {
        return 70;
    }

    @Override
    public int requiredIntelligence() {
        return 0;
    }

    @Override
    public int requiredStrength() {
        return 10;
    }

}
