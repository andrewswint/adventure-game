import java.util.Random;
import java.util.Scanner;
public class Game {
    static String userName;
    public static void gameStart () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        userName = scanner.next();
        System.out.println("Great to meet you " + userName + " are you ready to begin? (yes or no)");
        String input = scanner.next();
        if (input.equalsIgnoreCase("yes")) {
            System.out.println("Lets go...");
        } else {
            System.out.println("Ok... I'll go without you!");
        }
    }

    public static void main (String[] args) {
        gameStart();
    }
}
