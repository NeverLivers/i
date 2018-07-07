package batle.weapon.wand;

import batle.weapon.Weapon;

public class Scourge implements Weapon {

    public int damage() {
        return 165;
    }

    public int requiredAgility() {
        return 10;
    }

    @Override
    public int requiredIntelligence() {
        return 90;
    }

    @Override
    public int requiredStrength() {
        return 10;
    }

}
