package batle.weapon.staff;

import batle.weapon.Weapon;

public class Atiesh implements Weapon {

    public int damage() {
        return 140;
    }

    public int requiredAgility() {
        return 0;
    }

    @Override
    public int requiredIntelligence() {
        return 70;
    }

    @Override
    public int requiredStrength() {
        return 10;
    }

}
