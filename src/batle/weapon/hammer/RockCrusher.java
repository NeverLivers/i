package batle.weapon.hammer;

import batle.weapon.Weapon;

public class RockCrusher implements Weapon {

    public int damage() {
        return 90;
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
