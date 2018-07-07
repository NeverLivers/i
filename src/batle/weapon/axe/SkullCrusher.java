package batle.weapon.axe;

import batle.weapon.Weapon;

public class SkullCrusher implements Weapon {

    public int damage() {
        return 110;
    }

    public int requiredAgility() {
        return 10;
    }

    @Override
    public int requiredIntelligence() {
        return 10;
    }

    @Override
    public int requiredStrength() {
        return 70;
    }


}
