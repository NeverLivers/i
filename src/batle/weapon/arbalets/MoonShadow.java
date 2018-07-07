package batle.weapon.arbalets;

import batle.weapon.Weapon;

public class MoonShadow implements Weapon {

    public int damage() {
        return 100;
    }

    public int requiredAgility() {
        return 90;
    }

    @Override
    public int requiredIntelligence() {
        return 0;
    }

    @Override
    public int requiredStrength() {
        return 30;
    }

}


