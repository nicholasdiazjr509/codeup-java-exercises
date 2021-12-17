import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        //1.
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approx. %.2f.", pi);
        //printf and format are same
//      using the .2 in %.2f for getting 3.14


        //Explore the scanner class
        //1.

//        Scanner in = new Scanner(System.in);
//        int integer;
//
//        System.out.println("Enter an int:" );
//
//        integer = in.nextInt();
//
//        System.out.println("Here is what you entered: ");
//        System.out.println(integer);
//    }
//}
        //Exception in thread "main" if int not used

//2.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 words: ");
        String userInput = sc.next();
        String userInput2 = sc.next();
        String userInput3 = sc.next();

        //String userInput = scanner.nextLine();
        //System.out.println( userInput +" " +  userInput2 + " "+ userInput3);
        System.out.printf("You entered %n%s %n%s %n%s", userInput, userInput2,  userInput3);
        //
        //3.


        System.out.println("Enter a sentence.");
        String storeSentenceInput = sc.nextLine();
        //System.out.println("here is your sentence: \n%s", storeSentenceInput);

        System.out.format("Here is your sentence: \n%s", storeSentenceInput);

    /**** Calculate the perimeter and area of Codeup's classrooms.*/
    //1. and 2.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter length of your room: ");
//
//        String userInput = in.nextLine();
//        System.out.println("enter width:");
//        int i = Integer.parseInt(userInput);
//
//        String userInput2 = in.nextLine();
//        int k = Integer.parseInt(userInput2);
//
//        int j = i * k;

//        int l = (i + k * 2);
//        System.out.println("Your room is: " + Integer.parseInt(userInput) + " x " + Integer.parseInt(userInput2));
//        System.out.println("Area is: " + Integer.parseInt(userInput) * Integer.parseInt(userInput2));
//        System.out.println("The Perimeter is: " + ((Integer.parseInt(userInput)*2) + (Integer.parseInt(userInput2)*2)));
//
//        System.out.println("The area equals: " + j + " dude.");
//        System.out.println("The perimeter is: " + l + " dude.");
        /** Having fun with it */


        //Display the area and perimeter of that classroom.
        //The area of a rectangle is equal to the length times the width,
        // and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        // area =  length x width
        //perimeter = 2 x length + 2 x width


    }
}