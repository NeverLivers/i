package batle.weapon.twoHandAxe;

import batle.weapon.Weapon;

public class Executioners implements Weapon {

    public int damage() {
        return 110;
    }

    public int requiredAgility() {
        return 0;
    }

    @Override
    public int requiredIntelligence() {
        return 0;
    }

    @Override
    public int requiredStrength() {
        return 50;
    }

}
