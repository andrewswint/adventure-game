import java.util.Random;
import java.util.Scanner;

public class Game {
    static String userName;

//    public static void gameStart() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        userName = scanner.next();
//        System.out.println("Great to meet you " + userName + " are you ready to begin? (yes or no)");
//        String input = scanner.next();
//        if (input.equalsIgnoreCase("yes")) {
//            System.out.println("Perfect! You begin at a airport, and a man runs towards you" +
//                    " and chases after you with a baseball bat!!");
//            System.out.println("Do you fight [y], do you flee? [n]");
//            String userInput = scanner.next();
//            if (userInput.equals("y")) {
//                //new method goes here
//                JWStats();
//            } else {
//                System.out.println("He's too fast, you die.");
//                scanner.nextLine();
//            }
//
//
//        } else {
//            System.out.println("Ok... I'll go without you!");
//        }
//    }
//
//
//    public static void JWStats() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You turn to fight and you realize, it's JW!! He's so big, plus he wore a cowboy hat today!");
//        System.out.println("Import your stat scanner for your stats and JW's!");
//
//        String scanInput = scanner.next();
//        if (scanInput.equals("sc.stats()") || (scanInput.equals("scanner.stats()"))) {
//            System.out.println("You import scanner to see his power level, and the hat itself increases his stats by 50! Oh no!");
//            System.out.println("You scan his stats, and they are as follows: ");
//            System.out.println("------------------");
//            System.out.println("HEALTH: 50 (+50)");
//            System.out.println("ATK: 10 (+50)");
//            System.out.println("------------------");
//            yourStats();
//            //run fight scene here: --
//            fightScene();
//            //nested conditional for big fight scene
//
//        } else {
//            System.out.println("Try using sc.stat() or sc.scanner()!");
//            JWStats();
//        }
//
//    }
//
//    public static void yourStats() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Now import your stats!");
//        String scanInput = scanner.next();
//        if (scanInput.equals("sc.stats()") || (scanInput.equals("scanner.stats()"))) {
//            System.out.println("You scan your stats, and they are as follows: ");
//            System.out.println("------------------");
//            System.out.println("HEALTH: 50");
//            System.out.println("ATK: 10");
//            System.out.println("------------------");
//        }
//    }


    static int JWHealth = 100;
    static int JWAttack = 20;
    static int yourHeath = 50;
    static int yourAttack = 10;
    public static void fightScene() {
        Scanner scanner = new Scanner(System.in);
        if (JWHealth > 0) {
            System.out.println("So.. you have some options, would you like to do a multi-hit or a normal hit? [multi/normal]");
            String attackInput = scanner.next();
            if (attackInput.equals("multi")) {
                System.out.println("You choose multi. You can do double damage if you hit, or you will just miss completely! Good luck!");
                int randomNum = new Random().nextInt(2) + 1;
                //change it later to like you hit multi, good for rn
                System.out.println(randomNum);
                if (randomNum == 1) {
                    System.out.println("You deal a 20 damage!");
                    JWHealth = JWHealth - (yourAttack * 2);
                    System.out.printf("His health is now %s%n", JWHealth);
                    fightScene();
                }else{
                    System.out.println("You miss! You slip and hit your face on the brim of his hat");
                    yourHeath = yourHeath - 10;
                    System.out.printf("Your health is now %s%n", yourHeath);
                    fightScene();
                }
            } else if (attackInput.equalsIgnoreCase("normal")) {
                JWHealth = JWAttack - 10;
                fightScene();
            }
        } else if (JWHealth == 0) {
            System.out.println("You have beat the JW! Congrats!!!");
        } else if (yourHeath == 0) {
            System.out.println("You suck and youre dead.");
        }
    }

    public static void JWAttacks() {
        if (yourHeath > 0) {
            int randomNum = new Random().nextInt(3) + 1;
            if (randomNum == 1) {
                System.out.println("He swings and hits...");
                yourHeath = yourHeath - JWAttack;
            } else {
                System.out.println("miss");
                //call back fight scene bc it will be your turn again
            }
        } else if (yourHeath == 0) {
            System.out.println("you suck and your dead!");
        }
    }




    public static void main(String[] args) {
//        gameStart();
        fightScene();
    }
}
