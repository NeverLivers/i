package batle.weapon.staff;

import batle.weapon.Weapon;

public class SoulReaper implements Weapon {

    public int damage() {
        return 110;
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
