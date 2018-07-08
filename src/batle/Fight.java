package batle;
import batle.classes.*;
import batle.weapon.*;
import batle.weapon.arbalets.Darcner;
import batle.weapon.arbalets.Iglehorne;
import batle.weapon.arbalets.MoonShadow;
import batle.weapon.axe.Bumper;
import batle.weapon.axe.Cutter;
import batle.weapon.axe.SkullCrusher;
import batle.weapon.blade.BlasphemersBlade;
import batle.weapon.blade.Bloodsucker;
import batle.weapon.blade.KingsAssassinsBlade;
import batle.weapon.bow.Penetrator;
import batle.weapon.bow.QuickFiring;
import batle.weapon.bow.SniperShot;
import batle.weapon.carpal.Bones;
import batle.weapon.carpal.RawenClaws;
import batle.weapon.carpal.RighteousnessFists;
import batle.weapon.dagger.AssasinDagger;
import batle.weapon.dagger.Bloodletter;
import batle.weapon.dagger.PoisoningDagger;
import batle.weapon.hammer.Doomhammer;
import batle.weapon.hammer.Mjolnir;
import batle.weapon.hammer.RockCrusher;
import batle.weapon.magicalArtifact.DuskyHeart;
import batle.weapon.magicalArtifact.GorgonsEys;
import batle.weapon.magicalArtifact.VictimAtMidnight;
import batle.weapon.staff.Atiesh;
import batle.weapon.staff.SoulReaper;
import batle.weapon.staff.StaffOfTheMistery;
import batle.weapon.throwing.GlassSpice;
import batle.weapon.throwing.HeartPierces;
import batle.weapon.throwing.ShardOfMind;
import batle.weapon.twoHandAxe.BloodyHowl;
import batle.weapon.twoHandAxe.Detractor;
import batle.weapon.twoHandAxe.Executioners;
import batle.weapon.twoHandHammer.HammerOfHeawen;
import batle.weapon.twoHandHammer.Sulphuras;
import batle.weapon.twoHandHammer.WrathOfTheRighteous;
import batle.weapon.twoHandSword.Athiesh;
import batle.weapon.twoHandSword.DarckBlade;
import batle.weapon.twoHandSword.FrostMorne;
import batle.weapon.ultraGreatSword.SwordOfFilth;
import batle.weapon.ultraGreatSword.SwordOfTheTwinPrinces;
import batle.weapon.ultraGreatSword.SwordOfTheWolfguardKnight;
import batle.weapon.wand.CrystalPain;
import batle.weapon.wand.Scourge;
import batle.weapon.wand.TheGovernorsFlamed;

import java.util.Arrays;
import java.util.Scanner;

public final class Fight {

    private Fight() {
    }

    private static final Fight BATTLE;

    private static Scanner scanner = new Scanner(System.in);
    private static int number;
    private Fighter warrior = new Warrior();
    private Fighter archer = new Archer();
    private Fighter berserker = new Berserker();
    private Fighter rogue = new Rogue();
    private Fighter magician = new Magician();
    private Weapon[] weapons = new Weapon[]{};
    private Fighter[] opponents = new Fighter[]{new Warrior(), new Archer(), new Berserker(), new Rogue(), new Magician()};
    int Kee = 2;

    static {
        BATTLE = new Fight();
    }

    public static Fight getBattle() {
        return BATTLE;
    }



    public void start() {
        System.out.println();
        System.out.println("*************welcome to my arena***************");

        System.out.println("*****Today is a beautiful evening for death****");

        System.out.println("******you are ready to kill or be killed?******");

        System.out.println("do not strain, nothing depends on your decision");

        System.out.println("***************let the fun begin***************");

        while (Kee > 0) {

            System.out.println();
            System.out.println("choose your class");
            System.out.println();
            System.out.println("1 - Warrior " + '\n' + "2 - Berserker" + '\n' + "3 - Rogue" + '\n' + "4 - Magician" + '\n' + "5 - Archer" + '\n' + "6 - EXIT");
            System.out.println();

            number = scanner.nextInt();

            if (number == 1) {
                while (warrior.getHealth() > 0) {
                    if (warrior.getStrength() >= 50 || warrior.getStrength() < 70) {
                        weapons = new Weapon[]{new RockCrusher(), new Cutter(), new Executioners()};
                        Weapon weaponForWarrior = weapons[(int) (Math.random() * 3)];
                        warrior.choiceWeapon(weaponForWarrior);
                    } else if (warrior.getStrength() >= 70 || warrior.getStrength() > 90) {
                        weapons = new Weapon[]{new SkullCrusher(), new Mjolnir(), new Detractor()};
                        Weapon weaponForWarrior = weapons[(int) (Math.random() * 3)];
                        warrior.choiceWeapon(weaponForWarrior);
                    } else {
                        weapons = new Weapon[]{new Bumper(), new Doomhammer(), new BloodyHowl()};
                        Weapon weaponForWarrior = weapons[(int) (Math.random() * 3)];
                        warrior.choiceWeapon(weaponForWarrior);
                    }
                    Fighter opponentsForWarrior = opponents[(int) (Math.random() * 4)];
                    weapons = new Weapon[]{new MoonShadow(), new Cutter(), new Bloodsucker(), new Penetrator(), new Bones(), new AssasinDagger(), new Doomhammer(), new GorgonsEys(), new Atiesh(), new GlassSpice(), new BloodyHowl(), new HammerOfHeawen(), new DarckBlade(), new SwordOfFilth(), new Scourge()};
                    Weapon weaponForOpponent = weapons[(int) (Math.random() * 14)];
                    opponentsForWarrior.choiceWeapon(weaponForOpponent);
                    warrior.defence(opponentsForWarrior.attack());
                    System.out.println("Warrior health = " + warrior.getHealth());
                    opponentsForWarrior.defence(warrior.attack());
                    System.out.println("Opponents health = " + opponentsForWarrior.getHealth());
                }
                if (warrior.getHealth() > 0) {
                    System.out.println("Warrior WIN");
                } else {
                    System.out.println("Warrior LOSE");
                }
            } else if (number == 2) {
                while (berserker.getHealth() > 0) {
                    if (berserker.getStrength() >= 50 || berserker.getStrength() < 70) {
                        weapons = new Weapon[]{new Sulphuras(), new Athiesh(), new SwordOfTheWolfguardKnight()};
                        Weapon weaponForBerserker = weapons[(int) (Math.random() * 3)];
                        berserker.choiceWeapon(weaponForBerserker);
                    } else if (berserker.getStrength() >= 70 || berserker.getStrength() < 90) {
                        weapons = new Weapon[]{new HammerOfHeawen(), new DarckBlade(), new SwordOfFilth()};
                        Weapon weaponForBerserker = weapons[(int) (Math.random() * 3)];
                        berserker.choiceWeapon(weaponForBerserker);
                    } else {
                        weapons = new Weapon[]{new WrathOfTheRighteous(), new FrostMorne(), new SwordOfTheTwinPrinces()};
                        Weapon weaponForBersercer = weapons[(int) (Math.random() * 3)];
                        berserker.choiceWeapon(weaponForBersercer);
                    }
                    Fighter oponentsForBerserker = opponents[(int) (Math.random() * 4)];
                    weapons = new Weapon[]{new MoonShadow(), new Cutter(), new Bloodsucker(), new Penetrator(), new Bones(), new AssasinDagger(), new Doomhammer(), new GorgonsEys(), new Atiesh(), new GlassSpice(), new BloodyHowl(), new HammerOfHeawen(), new DarckBlade(), new SwordOfFilth(), new Scourge()};
                    Weapon weaponForOponent = weapons[(int) (Math.random() * 14)];
                    oponentsForBerserker.choiceWeapon(weaponForOponent);
                    berserker.defence(oponentsForBerserker.attack());
                    System.out.println(" Berserker Health = " + berserker.getHealth());
                    oponentsForBerserker.defence(berserker.attack());
                    System.out.println("Opponets Health = " + oponentsForBerserker.getHealth());
                }
                if (berserker.getHealth() > 0) {
                    System.out.println("Berserker WIN");
                } else {
                    System.out.println("Berserker LOSE");
                }
            } else if (number == 3) {
                while (rogue.getHealth() > 0) {
                    if (rogue.getAgility() >= 50 || rogue.getAgility() < 70) {
                        weapons = new Weapon[]{new BlasphemersBlade(), new RawenClaws(), new Bloodletter()};
                        Weapon weaponForRogue = weapons[(int) (Math.random() * 3)];
                        rogue.choiceWeapon(weaponForRogue);
                    } else if (rogue.getAgility() >= 70 || rogue.getAgility() < 90) {
                        weapons = new Weapon[]{new KingsAssassinsBlade(), new RighteousnessFists(), new PoisoningDagger()};
                        Weapon weaponForRogue = weapons[(int) (Math.random() * 3)];
                        rogue.choiceWeapon(weaponForRogue);
                    } else {
                        weapons = new Weapon[]{new Bloodsucker(), new Bones(), new AssasinDagger()};
                        Weapon weaponForRogue = weapons[(int) (Math.random() * 3)];
                        rogue.choiceWeapon(weaponForRogue);
                    }
                    Fighter oponentsForRogue = opponents[(int) (Math.random() * 4)];
                    weapons = new Weapon[]{new MoonShadow(), new Cutter(), new Bloodsucker(), new Penetrator(), new Bones(), new AssasinDagger(), new Doomhammer(), new GorgonsEys(), new Atiesh(), new GlassSpice(), new BloodyHowl(), new HammerOfHeawen(), new DarckBlade(), new SwordOfFilth(), new Scourge()};
                    Weapon weaponForOponent = weapons[(int) (Math.random() * 14)];
                    oponentsForRogue.choiceWeapon(weaponForOponent);
                    rogue.defence(oponentsForRogue.attack());
                    System.out.println("Rogue health = " + rogue.getHealth());
                    oponentsForRogue.defence(rogue.attack());
                    System.out.println("Opponents health = " + oponentsForRogue.getHealth());
                }
                if (rogue.getHealth() > 0) {
                    System.out.println("Rogue WIN");
                } else {
                    System.out.println("Rogue LOSE");
                }
            } else if (number == 4) {
                while (magician.getHealth() > 0) {
                    if (magician.getIntelligence() >= 50 || magician.getIntelligence() < 70) {
                        weapons = new Weapon[]{new GorgonsEys(), new Atiesh(), new TheGovernorsFlamed()};
                        Weapon weaponForMagician = weapons[(int) (Math.random() * 3)];
                        magician.choiceWeapon(weaponForMagician);
                    } else if (magician.getIntelligence() >= 70 || magician.getIntelligence() < 90) {
                        weapons = new Weapon[]{new DuskyHeart(), new SoulReaper(), new CrystalPain()};
                        Weapon weaponForMagician = weapons[(int) (Math.random() * 3)];
                        magician.choiceWeapon(weaponForMagician);
                    } else {
                        weapons = new Weapon[]{new VictimAtMidnight(), new StaffOfTheMistery(), new Scourge()};
                        Weapon weaponForMagician = weapons[(int) (Math.random() * 3)];
                        magician.choiceWeapon(weaponForMagician);
                    }
                    Fighter oponentsForMagician = opponents[(int) (Math.random() * 4)];
                    weapons = new Weapon[]{new MoonShadow(), new Cutter(), new Bloodsucker(), new Penetrator(), new Bones(), new AssasinDagger(), new Doomhammer(), new GorgonsEys(), new Atiesh(), new GlassSpice(), new BloodyHowl(), new HammerOfHeawen(), new DarckBlade(), new SwordOfFilth(), new Scourge()};
                    Weapon weaponForOponent = weapons[(int) (Math.random() * 14)];
                    oponentsForMagician.choiceWeapon(weaponForOponent);
                    magician.defence(oponentsForMagician.attack());
                    System.out.println("Magician health = " + magician.getHealth());
                    oponentsForMagician.defence(magician.attack());
                    System.out.println("Opponents health = " + oponentsForMagician.getHealth());
                }
                if (magician.getHealth() > 0) {
                    System.out.println("Magician WIN");
                } else {
                    System.out.println("Magician LOSE");
                }
            } else if (number == 5) {
                while (archer.getHealth() > 0) {
                    if (archer.getAgility() >= 50 || archer.getAgility() < 70) {
                        weapons = new Weapon[]{new Iglehorne(), new Penetrator(), new GlassSpice()};
                        Weapon weaponForArcher = weapons[(int) (Math.random() * 3)];
                        archer.choiceWeapon(weaponForArcher);
                    } else if (archer.getAgility() >= 70 || archer.getAgility() < 90) {
                        weapons = new Weapon[]{new Darcner(), new QuickFiring(), new HeartPierces()};
                        Weapon weaponForArcher = weapons[(int) (Math.random() * 3)];
                        archer.choiceWeapon(weaponForArcher);
                    } else {
                        weapons = new Weapon[]{new MoonShadow(), new SniperShot(), new ShardOfMind()};
                        Weapon weaponForArcher = weapons[(int) (Math.random() * 3)];
                        archer.choiceWeapon(weaponForArcher);
                    }
                    Fighter oponentsForArcher = opponents[(int) (Math.random() * 4)];
                    weapons = new Weapon[]{new MoonShadow(), new Cutter(), new Bloodsucker(), new Penetrator(), new Bones(), new AssasinDagger(), new Doomhammer(), new GorgonsEys(), new Atiesh(), new GlassSpice(), new BloodyHowl(), new HammerOfHeawen(), new DarckBlade(), new SwordOfFilth(), new Scourge()};
                    Weapon weaponForOponent = weapons[(int) (Math.random() * 14)];
                    oponentsForArcher.choiceWeapon(weaponForOponent);
                    archer.defence(oponentsForArcher.attack());
                    System.out.println("Archer health = " + archer.getHealth());
                    oponentsForArcher.defence(archer.attack());
                    System.out.println("Opponents health = " + oponentsForArcher.getHealth());

                }
                if (archer.getHealth() > 0) {
                    System.out.println("Archer WIN");
                } else {
                    System.out.println("Archer LOSE");
                }
            }


            if (number == 6){
                break;
            }

           /* Weapon weaponForWarrior = weapons[(int) (Math.random() * 3)];
            warrior.choiceWeapon(weaponForWarrior);

            System.out.println("h" + warrior.getHealth());
            System.out.println("s" + warrior.getStrength());
            System.out.println("a" + warrior.getAgility());
            System.out.println("i" + warrior.getIntelligence());
            System.out.println("c" + warrior.getCriticalStrikeChance());
            System.out.println("ar" + warrior.getArmor());
            System.out.println("e" + warrior.getEndurance());
            System.out.println("dr" + warrior.getDamageResistance());
            System.out.println("attack" + warrior.attack());*/


        }

    }
    }

