package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString() {
        return sc.next();
    }

    public boolean yesNo() {
        String input = sc.next();
        return (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"));
    }

    public int getInt (int min, int max) throws Exception{
        System.out.println("Please enter a number between 1 and 10");
        try {
            int newInput = Integer.valueOf(getString());
                if (newInput < max && newInput > min) {
                    System.out.println("Great! " + newInput + " is in range!");
                } else {
                    System.out.println("That's not right. Please enter a number between 1 and 10");
                    throw new Exception("Recursion");
                }
            return newInput;
        } catch (Exception e) {
            System.out.println("Please try again");
            return getInt(min, max);
        }
    }

    public int getInt() throws Exception{
        System.out.println("Please enter a number");
        try {
            int newInput = Integer.valueOf(getString());
            return newInput;
        } catch (Exception e){
            System.out.println("Please try again");
            return getInt();
        }
    }

    public double getDouble (double min, double max) throws Exception{
        System.out.println("Please enter a number between 1 and 2");
        try {
            double newInput = Double.valueOf(getString());
                if (newInput < max && newInput > min) {
                    System.out.println("Great! " + newInput + " is in range!");
                } else {
                    System.out.println("That's not right. Please enter a number between 1 and 10");
                    throw new Exception("Recursion");
                }
                return newInput;
        } catch (Exception e) {
            System.out.println("Please try again");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.println("Please enter a number between 1 and 10");
        try {
            double newInput = Double.valueOf(getString());
            System.out.println(newInput);
            return newInput;
        } catch (Exception e) {
            System.out.println("Please try again");
            return getDouble();
        }
    }

    public int getBinary() {
        System.out.println("What number do you want converted from Binary?");
        try {
            int newInput = Integer.valueOf(getString(), 2);
            System.out.println(newInput);
            return newInput;
        } catch (Exception e) {
            System.out.println("Please try again");
            return getBinary();
        }
    }

    public int getHex() {
        System.out.println("What number do you want converted from Hex?");
        try {
            int newInput = Integer.valueOf(getString(), 16);
            System.out.println(newInput);
            return newInput;
        } catch (Exception e) {
            System.out.println("Please try again");
            return getHex();
        }
    }

}
