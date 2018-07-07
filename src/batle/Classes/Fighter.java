package batle.Classes;
import batle.weapon.*;

public abstract class Fighter  {

    protected Weapon weapon;

public abstract int getHealth();
public abstract int getStrength();
public abstract int getAgility();
public abstract int getIntelligence();
public abstract int getArmor();
public abstract int getCriticalStrikeChance();
public abstract int getEndurance();
public abstract int getDamageResistance();
public abstract int atack();
public abstract void defence(int damage);

public void choiceWeapon(Weapon weapon){
    this.weapon = weapon;
}
}
