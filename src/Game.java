import java.util.Random;
import java.util.Scanner;

public class Game {
    static String userName;
    public static void sleepy(int num) {
        try {
            Thread.sleep(num);
        } catch (Exception e) {
            System.out.println("yep");
        }
    }

    public static void gameStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        userName = scanner.next();
        System.out.println("Great to meet you " + userName + " are you ready to begin? [y/n]");
        String input = scanner.next();
        if (input.equalsIgnoreCase("y")) {
            System.out.println("Perfect! You begin at a airport, and a man runs towards you" +
                    " and chases after you with a baseball bat!!");
            System.out.println("Do you fight [y], do you flee? [n]");
            String userInput = scanner.next();
            if (userInput.equals("y")) {
                //new method goes here
                JWStats();
            } else {
                System.out.println("He's too fast, you die.");
                scanner.nextLine();
            }


        } else {
            System.out.println("Ok... I'll go without you!");
        }
    }


    public static void JWStats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You turn to fight and you realize, it's JW!! He's so big, plus he wore a cowboy hat today!");
        System.out.println("Import your stat scanner for your stats and JW's!");

        String scanInput = scanner.next();
        if (scanInput.equals("import") || (scanInput.equals("import scanner"))) {
            System.out.println("You import scanner to see his power level, and the hat itself increases his stats by 50! Oh no!");
            sleepy(1000);
            System.out.println("You scan his stats, and they are as follows: ");
            sleepy(1000);
            System.out.println("------------------");
            System.out.println("HEALTH: 50 (+50)");
            System.out.println("ATK: 10 (+50)");
            System.out.println("------------------");
            yourStats();
            //run fight scene here: --
            fightScene();
            //nested conditional for big fight scene

        } else {
            System.out.println("Try using import or import scanner!");
            JWStats();
        }

    }

    public static void yourStats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now import your stats!");
        String scanInput = scanner.next();
        if (scanInput.equals("import") || (scanInput.equals("import scanner"))) {
            sleepy(1000);
            System.out.println("You scan your stats, and they are as follows: ");
            sleepy(1000);
            System.out.println("------------------");
            System.out.println("HEALTH: 50");
            System.out.println("ATK: 10");
            System.out.println("------------------");
        } else {
            System.out.println("Try using import or import scanner!");
            yourStats();
        }

    }


    static int JWHealth = 100;
    static int JWAttack = 20;
    static int yourHeath = 50;
    static int yourAttack = 10;
    public static void fightScene() {
        Scanner scanner = new Scanner(System.in);
        if (JWHealth > 0 && yourHeath > 0) {
            sleepy(1000);
            System.out.println("So.. you have some options, would you like to do a multi-hit or a normal hit? [multi/normal]");
            String attackInput = scanner.next();
            if (attackInput.equals("multi")) {
                System.out.println("You choose multi. You can do double damage if you hit, or you will just miss completely! Good luck!");
                int randomNum = new Random().nextInt(2) + 1;
                //change it later to like you hit multi, good for rn
                if (randomNum == 1) {
                    sleepy(1000);
                    System.out.println("You deal a 20 damage!");
                    JWHealth = JWHealth - (yourAttack * 2);
                    sleepy(1000);
                    System.out.printf("His health is now %s%n", JWHealth);
                    JWAttacks();
                }else{
                    sleepy(1000);
                    System.out.println("You miss! You slip and hit your face on the brim of his hat");
                    yourHeath = yourHeath - 10;
                    System.out.printf("Your health is now %s%n", yourHeath);
                    JWAttacks();
                }
            } else if (attackInput.equalsIgnoreCase("normal")) {
                JWHealth = JWAttack - 10;
                System.out.println(JWHealth);
                JWAttacks();
            }
        } else if (JWHealth == 0) {
            sleepy(1000);
            System.out.println("You have beat the JW! Congrats!!!");
        } else if (yourHeath == 0) {
            sleepy(1000);
            System.out.println("You suck and you're dead.");
        }
    }


//    public static void fightScene2(int JWHealth, int JWAttack) {
//        JWHealth = JWHealth/2;
//        JWAttack = JWAttack/2;
//        Scanner scanner = new Scanner(System.in);
//        if (JWHealth > 0) {
//            System.out.printf("Now you're fighting a hatless JW! His health is now %s and his attack is now %s%n So.. you have some options, would you like to do a multi-hit or a normal hit? [multi/normal]", JWHealth, JWAttack);
//            String attackInput = scanner.next();
//            if (attackInput.equals("multi")) {
//                System.out.println("You choose multi. You can do double damage if you hit, or you will just miss completely! Good luck!");
//                int randomNum = new Random().nextInt(2) + 1;
//                //change it later to like you hit multi, good for rn
//                System.out.println(randomNum);
//                if (randomNum == 1) {
//                    System.out.println("You deal a 20 damage!");
//                    JWHealth = JWHealth - (yourAttack * 2);
//                    System.out.printf("His health is now %s%n", JWHealth);
//                    JWAttacks();
//                }else{
//                    System.out.println("You miss! You slip and hit your face on the brim of his hat");
//                    yourHeath = yourHeath - 10;
//                    System.out.printf("Your health is now %s%n", yourHeath);
//                    JWAttacks();
//                }
//            } else if (attackInput.equalsIgnoreCase("normal")) {
//                JWHealth = JWAttack - 10;
//                System.out.println(JWHealth);
//                JWAttacks();
//            }
//        } else if (JWHealth == 0) {
//            System.out.println("You have beat the JW! Congrats!!!");
//        } else if (yourHeath == 0) {
//            System.out.println("You suck and you're dead.");
//        }
//    }

    public static void JWAttacks() {
        Scanner scanner = new Scanner(System.in);
        if (yourHeath == 0) {
            scanner.nextLine();
        } else if (yourHeath > 0) {
            sleepy(1000);
            System.out.println("JW attacks...");
            if (yourHeath > 0) {
                int randomNum = new Random().nextInt(3) + 1;
                if (randomNum == 1) {
                    sleepy(1000);
                    System.out.println("He swings and hits...");
                    yourHeath = yourHeath - JWAttack;
                    sleepy(1000);
                    System.out.printf("Your health is now: %s%n", yourHeath);
                    fightScene();
                } else if (randomNum == 2) {
                    sleepy(1000);
                    System.out.println("He swings and hits but he's weak...");
                    yourHeath = yourHeath - (JWAttack / 2);
                    sleepy(1000);
                    System.out.printf("Your health is now: %s%n", yourHeath);
                    fightScene();
                } else if (randomNum == 3) {
                    sleepy(1000);
                    System.out.println("He swings and misses...");
                    sleepy(1000);
                    System.out.printf("Your health is now: %s%n", yourHeath);
                    fightScene();
                }
            } else if (yourHeath == 0) {
                sleepy(1000);
                System.out.println("you suck and your dead!");
                scanner.nextLine();
            }
        }
    }








    public static void main(String[] args) {
        gameStart();
        fightScene();
    }
}
