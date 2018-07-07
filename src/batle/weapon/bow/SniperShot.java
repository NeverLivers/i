package batle.weapon.bow;

import batle.weapon.Weapon;

public class SniperShot implements Weapon {

    public int damage() {
        return 123;
    }

    public int requiredAgility() {
        return 90;
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
