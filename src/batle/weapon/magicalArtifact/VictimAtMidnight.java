package batle.weapon.magicalArtifact;

import batle.weapon.Weapon;

public class VictimAtMidnight implements Weapon {

    public int damage() {
        return 170;
    }

    public int requiredAgility() {
        return 50;
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
