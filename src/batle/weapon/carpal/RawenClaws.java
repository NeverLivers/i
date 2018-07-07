package batle.weapon.carpal;

import batle.weapon.Weapon;

public class RawenClaws implements Weapon {

    public int damage() {
        return 80;
    }

    public int requiredAgility() {
        return 50;
    }

    @Override
    public int requiredIntelligence() {
        return 0;
    }

    @Override
    public int requiredStrength() {
        return 0;
    }



}
