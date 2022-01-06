package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);
//    private Scanner sc;
//
//    public Input() {
//        this.sc = new Scanner(System.in);


    public String getString() {
        System.out.println("Enter your input. ");
        String userInput = sc.nextLine();
        //return sc.next();
        System.out.printf("You entered: %s", userInput);
        return userInput;
    }
    public String getString(String prompt){
        System.out.println(prompt);
        String userInput = sc.nextLine();
        //return sc.next();
        System.out.printf("You entered: %s", userInput);
        return userInput;

    }
    public boolean yesNo(String s) {
        System.out.println("Continue?");
        String input = sc.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Out of range dude. Enter a number between " + min + " and " + ".");
            return getInt(min, max);
        }
    }

    public int getInt() {
        System.out.println("Enter a number.");
        int userNum = sc.nextInt();
        System.out.printf("You entered %d", userNum);
//        if (sc.hasNextInt()) {
//            return sc.nextInt();
//        } else {
//            System.out.println("Try again!");
//            sc.nextLine();
//            return getInt();

        return userNum;
    }


    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Out of range dude! Enter a number between " + min + " and " + max + ".");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.println("Enter a number dude: ");
        try {
            return Double.parseDouble(getString());
            //use an exception??

        } catch (Exception e) {
            System.out.println("You made an invalid entry. Enter a number dude: ");
            return getDouble();
        }
    }

    public void setMinMaxInt(int i, int i1) {
    }

    public void setMinMaxDouble(double i, double i1) {
    }
}
//
//    public static void main(String[] args) {
//        Input input = new Input();
//        System.out.println("Enter a number between 2.5 and 4.5");
//        double userInt = input.getDouble(2.5, 4.5);
//        System.out.println("You entered: " + userInt);
//    }
//}