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


        public int getInt() {
            System.out.println("Please enter an int.");
            return this.sc.nextInt();
        }

        public int getInt(int min, int max) {
            return getInt(min, max, "Please enter an int between " + min + " and " + max);

        }

        public int getInt(int min, int max, String prompt) {
            int input;
            do {
                System.out.println(prompt);
                input = this.sc.nextInt();
            } while (input < min || input > max);

            return input;
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
        System.out.println("Please enter a number.");
        double userNum = sc.nextDouble();
        System.out.printf("You chose: %f", userNum);
        return userNum;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double userNum = sc.nextDouble();
        System.out.printf("You chose: %f", userNum);
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