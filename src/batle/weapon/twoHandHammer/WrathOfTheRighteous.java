package batle.weapon.twoHandHammer;

import batle.weapon.Weapon;

public class WrathOfTheRighteous implements Weapon {

    public int damage() {
        return 180;
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
