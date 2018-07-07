package batle.weapon.axe;

import batle.weapon.Weapon;

public class Cutter implements Weapon {

    public int damage() {
        return 90;
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
