package batle.weapon.dagger;

import batle.weapon.Weapon;

public class AssasinDagger implements Weapon {

    public int damage() {
        return 111;
    }

    public int requiredAgility() {
        return 70;
    }

    @Override
    public int requiredIntelligence() {
        return 10;
    }

    @Override
    public int requiredStrength() {
        return 30;
    }


}
