import java.util.Random;
import java.util.Scanner;

public class DiceRolling {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String choice = "y";

       // choice Validator.getString(sc, "Roll the Dice? y or n:");

        while(choice.equalsIgnoreCase("y")){
        //    choice = getString("Would you like to roll again? y or n: ");
        }
    }

    Random rand = new Random();{
        int dieOne = 0;
        int dieTwo = 0;
        int[] total = new int[13];

    for (int index = 0; index < total.length; index++){
        total[index] = 0;
        for(int roll = 1; roll <= 4; roll++){
            dieOne = (int) (Math.random()* 6) + 1;
            dieTwo = (int) (Math.random()* 6) + 1;
            total[dieOne]++;
            total[dieTwo]++;

            System.out.println("Roll 1" + "\n " + dieOne + " " + "\n "+ dieTwo + " ");
        if(total[dieOne + dieTwo] == 7)
            System.out.println("Craps!" + "\n");

        else if(total[dieOne + dieTwo] == 2)
            System.out.println("Snake eyes!" + "\n");


        }

    }
    }
//}
//
//
//boolean confirm = true;
//
//while (confirm){
//    System.out.println("How many sides?");
//    int sides = sc.nextInt();
//    rollDice = sc.nextInt();
//    rollDice(side)
        }