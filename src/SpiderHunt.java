import java.util.Scanner;
import java.lang.Math;
public class SpiderHunt {
    public static void playerAction(){
        SpiderHunt gameOne = new SpiderHunt();
        gameOne.playerAttack();
        Scanner A = new Scanner(System.in);
        System.out.println("1)Attack  2)Drink potion  3)Run");
        String action = A.nextLine();
        if (action.equals("1")) {
            playerAttack();
        } else if (action.equals("2")){
            drinkPotion();
        } else if (action.equals("3")){
            run();
        }else{
            playerAction();
        }
    }
    public static void run(){
        System.out.println("You tried to run but you were not fast enough");
    }
    public static double playerAttack(){
        return Math.floor(Math.random()*10+25);
    }
    public static int drinkPotion(){
        return 1;
    }
    public static double spiderAttack(){
        return Math.floor(Math.random()*10+45);
    }
    public static String attackRatio(){
        for (int t = 0; t < 50; t++ ){
            if(t % 3 == 0){
                double enemyAttack = spiderAttack();
                System.out.printf("GS did %s damage\n",enemyAttack);
            }else{
                double attack = playerAttack();
                System.out.printf("You did %s damage\n",attack);
            }
        }
        return "Complete";
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

//        <<<<<<<<<<<<< TEST >>>>>>>>>>>>>
        System.out.println(attackRatio());
        SpiderHunt gameOne = new SpiderHunt();
        gameOne.drinkPotion();
//        ================================

        System.out.println("Welcome to SPIDER HUNT, were we kill spiders for fun. :)\nWould you like to begin the hunt?");
        String pilot = SC.next();
        int Hhealth = 200;
        int Shealth = 400;

        System.out.println(drinkPotion());
        System.out.println(Hhealth);


        if (pilot.equalsIgnoreCase("yes")){
            System.out.println("Name your hunter: ");
            Scanner SC2 = new Scanner(System.in);
            String HunterName = SC2.nextLine();
            System.out.printf("Welcome %s, let us begin...",HunterName);

//            <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< STATS VARIABLE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            String stats = "\n" + HunterName + "'s HP:" + Hhealth + "\nGiga-Spider HP:" + Shealth;
//          ================================================================================================

//            <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< RULES >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            System.out.println(
                "You will be fighting an exceptionally large spider called \"Giga-Spider\",\n " +
                "you are equipped with a sword that does damage ranging from 25-35 damage,\n " +
                "Giga-Spider attacks slow, but it can take a hit. You will have 3 options for " +
                "every turn:\n 1)Attack  2)Drink potion  3)Run \nPotions add 100 HP to your health pool, " +
                "but you can choose to run at any time...\nGood Luck.");
//            ===============================================================================================

            System.out.println("You have approached Giga-Spider");
            System.out.println(stats);
            System.out.println(attackRatio());












        }else{
            System.out.println("COWARD!!!");
        }
    }
}
