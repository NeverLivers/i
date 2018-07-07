package batle.weapon.wand;

import batle.weapon.Weapon;

public class CrystalPain implements Weapon {

    public int damage() {
        return 125;
    }

    public int requiredAgility() {
        return 10;
    }

    @Override
    public int requiredIntelligence() {
        return 70;
    }

    @Override
    public int requiredStrength() {
        return 0;
    }

}
