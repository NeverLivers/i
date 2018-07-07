package batle.weapon.dagger;

import batle.weapon.Weapon;

public class PoisoningDagger implements Weapon {

    public int damage() {
        return 99;
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
