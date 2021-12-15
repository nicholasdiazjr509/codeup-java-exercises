import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        //1.
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approx. %f.", pi);

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

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter 3 words: ");
//        String userInput = scanner.next();
//
//        //String userInput = scanner.nextLine();
//        System.out.println( userInput);


    /**** Calculate the perimeter and area of Codeup's classrooms.*/
    //1.
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of your room: ");

        String userInput = in.nextLine();
        System.out.println("enter width:");
//        int i = Integer.parseInt(userInput);

        String userInput2 = in.nextLine();
//        int k = Integer.parseInt(userInput2);
        System.out.println("Your room is: " + Integer.parseInt(userInput) + " x " + Integer.parseInt(userInput2));
        System.out.println("Area is: " + Integer.parseInt(userInput) * Integer.parseInt(userInput2));
        System.out.println("The Perimeter is: " + ((Integer.parseInt(userInput)*2) + (Integer.parseInt(userInput2)*2)));

        //2.
        //Display the area and perimeter of that classroom.
        //The area of a rectangle is equal to the length times the width,
        // and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        // area =  length x width
        //perimeter = 2 x length + 2 x width


    }
}