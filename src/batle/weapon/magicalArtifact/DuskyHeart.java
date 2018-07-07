package batle.weapon.magicalArtifact;

import batle.weapon.Weapon;

public class DuskyHeart implements Weapon {

    public int damage() {
        return 100;
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
