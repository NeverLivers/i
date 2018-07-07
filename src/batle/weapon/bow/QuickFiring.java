package batle.weapon.bow;

import batle.weapon.Weapon;

public class QuickFiring implements Weapon {

    public int damage() {
        return 110;
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
