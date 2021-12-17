import java.util.Scanner;

public class Warmups {
    public static void main(String[] args){
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");


        Scanner in = new Scanner(System.in);
        System.out.println("What did you eat for breakfast today?");
        String userInput = in.nextLine();
        System.out.println("But, why " + userInput + "????");
        String userInput2 = in.nextLine();
        System.out.println("Please do better than just " + userInput2 + " for breakfast.");

        System.out.printf("%s, I wish I had that for breakfast! %s", userInput, userInput2);//remember printf!!
        // no need for concatenation

    }

}
