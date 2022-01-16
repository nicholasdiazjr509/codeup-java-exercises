package util;

import java.util.Scanner;

public class Input {
    //private final Scanner sc = new Scanner(System.in);
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return this.sc.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        return yesNo("Please enter yes or no.");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = this.sc.next();
        sc.nextLine();
        return (input.trim().toLowerCase().equals("y") ||
                input.trim().toLowerCase().equals("yes"));
    }


    public int getInt(int min, int max) {
        System.out.printf("Please enter a whole number between %d and %d. \n", min, max);
        int userNum = sc.nextInt();
        if (userNum > max || userNum < min) {
            return getInt(min, max);
        }
        return userNum;
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userNum = sc.nextInt();
        if (userNum > max || userNum < min) {
            return getInt(min, max);
        }
        return userNum;
    }

    public int getInt() {
        // System.out.println("Please enter a whole number.");
        String userInput = getString("Please enter a whole number.");
        int userNum;

        try {
            userNum = Integer.valueOf(userInput);

        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            return getInt();
        }
        System.out.printf("You chose %d", userNum);
        return userNum;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Please enter a number between %f and %f. \n", min, max);
        double userNum = sc.nextDouble();
        if (userNum > max || userNum < min) {
            return getDouble(min, max);
        }
        return userNum;
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userNum = sc.nextDouble();
        if (userNum > max || userNum < min) {
            return getDouble(min, max);
        }
        return userNum;
    }

    public double getDouble() {
        String userInput = getString(" Please enter a dbl whole number.");
        double userNum;

        try {
            userNum = Double.valueOf(userInput);

        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            return getDouble();
        }
        // System.out.printf("You chose %d", userNum);
        return userNum;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double userNum = sc.nextDouble();
        System.out.printf("You chose: %s", userNum);
        return userNum;
    }


    public long convertHexToDecimal(){
            String userInput = getString("Please enter a hexadecimal number.");
            long userNum;
            try {
                userNum = Long.valueOf(userInput, 16);

            }catch (NumberFormatException nfe){
                nfe.printStackTrace();
                return convertHexToDecimal();
            }
            return userNum;

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