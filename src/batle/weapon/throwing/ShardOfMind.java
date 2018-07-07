package batle.weapon.throwing;

import batle.weapon.Weapon;

public class ShardOfMind implements Weapon {

    public int damage() {
        return 110;
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
