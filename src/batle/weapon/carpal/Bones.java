package batle.weapon.carpal;

import batle.weapon.Weapon;

public class Bones implements Weapon {

    public int damage() {
        return 130;
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
