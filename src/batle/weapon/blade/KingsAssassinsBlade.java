package batle.weapon.blade;

import batle.weapon.Weapon;

public class KingsAssassinsBlade implements Weapon {

    public int damage() {
        return 115;
    }

    public int requiredAgility() {
        return 10;
    }

    @Override
    public int requiredIntelligence() {
        return 0;
    }

    @Override
    public int requiredStrength() {
        return 70;
    }


}
