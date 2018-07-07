package batle.Classes;

public class Rogue extends Fighter {

    public static int random(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    private int strength = random(40, 100);
    private int health = 100 + (strength * 7);
    private int agility = random(40, 100);
    private int intelligence = random(40, 100);
    private int armor = (int)(agility * 0.5);
    private int criticalStrikeChance = 100 /(int)(agility * 0.3);
    private int endurance = random(10, 50);
    private int damageResistance = 100 / (int)armor;

    @Override
    public int atack() {
        return weapon.damage();
    }

    @Override
    public void defence(int damage) {
        health -= atack();
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getCriticalStrikeChance() {
        return criticalStrikeChance;
    }

    @Override
    public int getEndurance() {
        return endurance;
    }

    @Override
    public int getDamageResistance() {
        return damageResistance;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
