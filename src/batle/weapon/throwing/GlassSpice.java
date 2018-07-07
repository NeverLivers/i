package batle.weapon.throwing;

import batle.weapon.Weapon;

public class GlassSpice implements Weapon {

    public int damage() {
        return 70;
    }

    public int requiredAgility() {
        return 50;
    }

    @Override
    public int requiredIntelligence() {
        return 10;
    }

    @Override
    public int requiredStrength() {
        return 10;
    }

}
