package batle.weapon.throwing;

import batle.weapon.Weapon;

public class HeartPierces implements Weapon {

    public int damage() {
        return 90;
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
