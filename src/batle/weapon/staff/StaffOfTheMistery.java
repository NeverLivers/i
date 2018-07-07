package batle.weapon.staff;

import batle.weapon.Weapon;

public class StaffOfTheMistery implements Weapon {

    public int damage() {
        return 20;
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
        return 30;
    }

}
