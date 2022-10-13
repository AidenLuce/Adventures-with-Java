import java.util.Scanner;
import java.lang.Math;
public class SpiderHunt {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Welcome to SPIDER HUNT!\nWould you like to begin the hunt?");
        String pilot = SC.next();
        int Hhealth = 200;
        int Shealth = 400;
        if (pilot.equalsIgnoreCase("yes")){
            System.out.println("Name your hunter: ");
            Scanner SC2 = new Scanner(System.in);
            String HunterName = SC2.nextLine();
            System.out.printf("Welcome %s, let us begin...",HunterName);

//            <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< STATS VARIABLE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            String stats = "\n" + HunterName + "'s HP:" + Hhealth + "\nGiga-Spider HP:" + Shealth;
//          ================================================================================================

//            <<<<<<<<<<<<<< RULES>>>>>>>>>>>>>
            System.out.println("You will be fighting an exceptionally large spider called \"Giga-Spider\", " +
                            "you are equipped with a sword that does damage ranging from 25-35 damage, " +
                            "Giga-Spider attacks slow, but it can take a hit. You will have 3 options for " +
                            "every turn: 1)Attack  2)Drink potion  3)Run\n Potions replenish half of your health, " +
                            "and you can try to run at any time ");
//            =================================
            System.out.println("");

            System.out.println(stats);



        }else{
            System.out.println("COWARD!!!");
        }
    }
}
