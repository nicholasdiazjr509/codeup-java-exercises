import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String playAgain = "";
        int numOfGuesses = 0;
        Random rand = new Random();
        int num = rand.nextInt(101) +1;

    do {

        int playerGuess = 0;

        System.out.println("Welcome to the High-Low Guessing Game! ");
        System.out.println("Guess a number from 1 to 100 and enter it: ");

        while (playerGuess != num) {
            playerGuess = sc.nextInt();
            numOfGuesses++;

            if (playerGuess < num)
                System.out.println("Your guess " + playerGuess + " is too LOW. Try again.");
            else if (playerGuess > num)
                System.out.println("Your guess " + playerGuess + " is too HIGH. Try again.");
            else
                System.out.println("You guessed correctly!! You guessed " + playerGuess + " which was correct. It took " + numOfGuesses + " tries to get the correct number.");
        }
        System.out.println("Would you like to play again? yes or no: ");
        playAgain = sc.next();
    }while
    (Objects.equals(playAgain, "yes"));
        System.out.println("God Bless You!!");
        sc.close();
    }

    }


