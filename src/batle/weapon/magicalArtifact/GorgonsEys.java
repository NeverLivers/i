package batle.weapon.magicalArtifact;

import batle.weapon.Weapon;

public class GorgonsEys implements Weapon {

    public int damage() {
        return 90;
    }

    public int requiredAgility() {
        return 0;
    }

    @Override
    public int requiredIntelligence() {
        return 50;
    }

    @Override
    public int requiredStrength() {
        return 0;
    }


}
