package batle.weapon.blade;

import batle.weapon.Weapon;

public class Bloodsucker implements Weapon {

    public int damage() {
        return 150;
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
