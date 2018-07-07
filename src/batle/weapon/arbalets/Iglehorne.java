package batle.weapon.arbalets;

import batle.weapon.Weapon;

public class Iglehorne implements Weapon {

    public int damage() {
        return 60;
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
