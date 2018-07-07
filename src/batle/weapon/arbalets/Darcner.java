package batle.weapon.arbalets;

import batle.weapon.Weapon;

public class Darcner implements Weapon {
    public static int random(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

        @Override
        public int damage() {
            return 75;
        }

        public int requiredAgility() {
            return 70;
        }

        @Override
        public int requiredIntelligence() {
            return 0;
        }

        @Override
        public int requiredStrength() {
            return 10;
        }


}
