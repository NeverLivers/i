package batle.weapon.hammer;

import batle.weapon.Weapon;

public class Doomhammer implements Weapon {

    public int damage() {
        return 130;
    }

    public int requiredAgility() {
        return 30;
    }

    @Override
    public int requiredIntelligence() {
        return 10;
    }

    @Override
    public int requiredStrength() {
        return 90;
    }


}
