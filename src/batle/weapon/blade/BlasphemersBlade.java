package batle.weapon.blade;

import batle.weapon.Weapon;

public class BlasphemersBlade implements Weapon {

    public int damage() {
        return 95;
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
