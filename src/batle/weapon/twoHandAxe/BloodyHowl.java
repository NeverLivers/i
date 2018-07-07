package batle.weapon.twoHandAxe;

import batle.weapon.Weapon;

public class BloodyHowl implements Weapon {

    public int damage() {
        return 200;
    }

    public int requiredAgility() {
        return 10;
    }

    @Override
    public int requiredIntelligence() {
        return 0;
    }

    @Override
    public int requiredStrength() {
        return 90;
    }

}
