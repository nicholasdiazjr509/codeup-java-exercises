import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args){
       String name = "Nick";
       String firstName ="Nick";
       String lastName = "Diaz";
       double pi = 3.14159;
       int myFavoriteNumber = 69;

        System.out.printf("Hello, my name is %s", name);//%s= string placeholder  //f = format
        System.out.printf("\n Hello, my name is %s %s", firstName, lastName);
        System.out.printf("\n Hello, my name is %s %s. The value of pi is: %f.", firstName, lastName, pi);  //%f= float placeholder
        /**
         d : decimal integer [byte, short, int, long]
         f : floating-point number [float, double]
         c : character Capital C will uppercase the letter
         s : String Capital S will uppercase all the letters in the string
         h : hashcode A hashcode is like an address. This is useful for printing a reference
         n : newline Platform specific newline character- use %n instead of \n for greater compatibility
         */
            Scanner scanner = new Scanner(System.in);

        System.out.println("\n What is your favorite color?");
        //String userInput = scanner.next();
        //for input of more than one input, i.e. sentence
        String userInput = scanner.nextLine(); //scanner. then "method"

        System.out.printf("your fav color is: %s", userInput);
        //System.out.println(userInput);

    }
}
