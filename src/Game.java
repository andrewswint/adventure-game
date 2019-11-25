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
            System.out.println("Perfect! You begin walking to class, a man runs towards you" +
                    " and chases after you with a baseball bat!!");
            System.out.println("Do you fight... do you flee? [y/n]");
            String userInput = scanner.next();
            if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("fight")) {
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
        System.out.println("You turn to fight and you realize, it's JW!! Standing at 6'8 AND he wore his HAT OF POWER!");
        sleepy(1000);
        System.out.println("" +
                "           ,'-',\n" +
                "          :-----:\n" +
                "      (''' , - , ''')\n" +
                "      \\   ' .  , `  /\n" +
                "       \\  '   ^  ? /\n" +
                "        \\ `   -  ,'\n" +
                "         `j_ _,'\n" +
                "    ,- -`\\ \\  /f\n" +
                "  ,-      \\_\\/_/'-\n" +
                " ,                 `,\n" +
                " ,                   ,     \n" +
                "      /\\          \\\n" +
                "|    /             \\   ',\n" +
                ",   f  :           :`,  ,\n" +
                "<...\\  ,           : ,- '\n" +
                "\\,,,,\\ ;           : j  '\n" +
                " \\    \\            :/^^^^'\n" +
                "  \\    \\            ; ''':\n" +
                "    \\   -,         -`.../\n" +
                "     '    - -,`,--`\n" +
                "      \\_._'-- '---:");
        sleepy(2000);
        System.out.println("Import your stat scanner for your stats and JW's!");

        String scanInput = scanner.next();
        if (scanInput.equalsIgnoreCase("import") || (scanInput.equalsIgnoreCase("import scanner"))) {
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
        if (scanInput.equalsIgnoreCase("import") || (scanInput.equalsIgnoreCase("import scanner"))) {
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
    static int yourHealth = 50;
    static int yourAttack = 10;
    static int normAttack = 10;

    public static void fightScene() {
        Scanner scanner = new Scanner(System.in);
        if (JWHealth > 0 && yourHealth > 0) {
            sleepy(1000);
            System.out.println("So.. you have some options, would you like to do a multi-hit or a normal hit? [multi/normal]");
            String attackInput = scanner.next();
            if (attackInput.equalsIgnoreCase("multi")) {
                System.out.println("You choose multi. You can do double damage if you hit, or you will just miss completely! Good luck!");
                sleepy(2000);
                System.out.println("" +
                        "         \\____         ___,\n" +
                        "       __\\o___|__   __)____)__\n" +
                        "        ///  =.       -)- )))\n" +
                        "        _/ \\_c/       \\=_/ \\__\n" +
                        "       /= \\/              )_/=\\\n" +
                        "       \\ ^|\\           __((_\\_/\\\n" +
                        "       )\\  \\___ __    /_/-\\o____)\n" +
                        "      _\\_\\,__o/-\\_\\   \\/  ))__|_\n" +
                        "     (x_\\_:M     \\/      ,/:_/_s)\n" +
                        "       \\ *\\ \\           /  /o /\n" +
                        "        \\ *\\ \\         /  /o /\n" +
                        "         \\,/ `)       ('  \\,/\n" +
                        "        / (   |        |   ) \\\n" +
                        "       ,- <___(        )___> -\\\n" +
                        "   -,--(o \\|  |-.--,-- |  |/ o)--,. -\n" +
                        "        [_,_(o \\__     _/ o)_,_/\n" +
                        "           \\_,___]  [___,_/");

                int randomNum = new Random().nextInt(2) + 1;
                //change it later to like you hit multi, good for rn
                if (randomNum == 1) {
                    sleepy(1000);
                    System.out.println("You deal 20 damage!");
                    JWHealth = JWHealth - (yourAttack * 2);
                    sleepy(1000);
                    System.out.printf("His health is now %s%n", JWHealth);
                    JWAttacks();
                } else {
                    sleepy(1000);
                    System.out.println("You miss! You slip and hit your face on the brim of his hat");

                    yourHealth = yourHealth - normAttack;
                    if(yourHealth < 0){
                        yourHealth = 0;
                        System.out.printf("Your health is now 0");
                        JWAttacks();
                    }else{
                        System.out.printf("Your health is now %s%n", yourHealth);
                        JWAttacks();
                    }

                }
            } else if (attackInput.equalsIgnoreCase("normal")) {
                System.out.println("You sneeze for 10 damage!");
                JWHealth = JWHealth - normAttack;
                sleepy(1000);
                if(JWHealth < 0){
                    JWHealth = 0;
                    System.out.println("His health is now 0!");
                    JWAttacks();
                }else {
                    System.out.printf("JW's health is now: %s%n ", JWHealth);
                }
                sleepy(1000);
                JWAttacks();
            }
        } else if (JWHealth <= 0) {
            sleepy(1000);
            System.out.println("You have beat the JW! Congrats!!!");
        } else if (yourHealth <= 0) {
            sleepy(1000);
            System.out.println("You died. Game Over");
            System.out.println(" ..............\n" +
                    "   ::::::::::::::::::\n" +
                    "  :::::::::::::::\n" +
                    " :::`::::::: :::     :\n" +
                    " :::: ::::: :::::    :\n" +
                    " :`   :::::;     :..~~\n" +
                    " :   ::  :::.     :::.\n" +
                    " :...`:, :::::...:::\n" +
                    "::::::.  :::::::::'\n" +
                    " ::::::::|::::::::  !\n" +
                    " :;;;;;;;;;;;;;;;;']}\n" +
                    " ;--.--.--.--.--.-\n" +
                    "  \\/ \\/ \\/ \\/ \\/ \\/\n" +
                    "     :::       ::::\n" +
                    "      :::      ::\n" +
                    "     :\\:      ::\n" +
                    "   /\\::    /\\:::\n" +
                    " ^.:^:.^^^::`::\n" +
                    " ::::::::.::::\n" +
                    "  .::::::::::");
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
        if (yourHealth <= 0) {
//            System.out.println("You died. Game Over");
            System.out.println(" ..............\n" +
                    "   ::::::::::::::::::\n" +
                    "  :::::::::::::::\n" +
                    " :::`::::::: :::     :\n" +
                    " :::: ::::: :::::    :\n" +
                    " :`   :::::;     :..~~\n" +
                    " :   ::  :::.     :::.\n" +
                    " :...`:, :::::...:::\n" +
                    "::::::.  :::::::::'\n" +
                    " ::::::::|::::::::  !\n" +
                    " :;;;;;;;;;;;;;;;;']}\n" +
                    " ;--.--.--.--.--.-\n" +
                    "  \\/ \\/ \\/ \\/ \\/ \\/\n" +
                    "     :::       ::::\n" +
                    "      :::      ::\n" +
                    "     :\\:      ::\n" +
                    "   /\\::    /\\:::\n" +
                    " ^.:^:.^^^::`::\n" +
                    " ::::::::.::::\n" +
                    "  .::::::::::");
//            scanner.nextLine();
        } else if (JWHealth <= 0) {
            System.out.println("You win!");

        } else if (yourHealth > 0 && JWHealth > 0) {
            sleepy(1000);
            System.out.println("JW attacks...");
            if (yourHealth > 0) {
                int randomNum = new Random().nextInt(3) + 1;
                if (randomNum == 1) {
                    sleepy(1000);
                    System.out.println("You get mollywhopped yeeHAWWWWWWWWWWWWD for full damage!");
                    yourHealth = yourHealth - JWAttack;
                    sleepy(1000);
                    System.out.printf("Your health is now: %s%n", yourHealth);
                    fightScene();
                } else if (randomNum == 2) {
                    sleepy(1000);
                    System.out.println("He swings and hits but he's weak...");
                    yourHealth = yourHealth - (JWAttack / 2);
                    sleepy(1000);
                    System.out.printf("Your health is now: %s%n", yourHealth);
                    fightScene();
                } else if (randomNum == 3) {
                    sleepy(1000);
                    System.out.println("He swings and misses...");
                    sleepy(1000);
                    System.out.printf("Your health is still: %s%n", yourHealth);
                    fightScene();
                }
            } else if (yourHealth == 0) {
                sleepy(1000);
                System.out.println("You died. Game Over");
                scanner.nextLine();
            }
        }
    }


    public static void main(String[] args) {
        gameStart();
        fightScene();
    }
}
