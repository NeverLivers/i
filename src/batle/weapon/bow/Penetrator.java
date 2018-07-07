package batle.weapon.bow;

import batle.weapon.Weapon;

public class Penetrator implements Weapon {

    public int damage() {
        return 90;
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
